using System.Linq;
using System.Web.Mvc;
using ShoppingList.Models;

namespace ShoppingList.Controllers
{
    [ValidateInput(false)]
    public class ProductController : Controller
    {
        [HttpGet]
        [Route("")]
        public ActionResult Index()
        {
            using (var db = new ShoppingListDbContext())
            {
                var products = db.Products.ToList();

                return View(products);
            }
        }

        [HttpGet]
        [Route("create")]
        public ActionResult Create()
        {
            return View();
        }

        [HttpPost]
        [Route("create")]
        [ValidateAntiForgeryToken]
        public ActionResult Create(Product product)
        {
            if (product == null)
            {
                return RedirectToAction("Index", "Product");
            }
            if (ModelState.IsValid)
            {
                using (var db = new ShoppingListDbContext())
                {
                    db.Products.Add(product);
                    db.SaveChanges();
                }
                return RedirectToAction("index", "Product");
            }
            return RedirectToAction("Create", "Product");
        }

        [HttpGet]
        [Route("edit/{id}")]
        public ActionResult Edit(int? id)
        {
            using (var db = new ShoppingListDbContext())
            {
                var product = db.Products.Find(id);

                if (product == null)
                {
                    return RedirectToAction("Index", "Product");
                }

                return View(product);
            }
        }

        [HttpPost]
        [Route("edit/{id}")]
        [ValidateAntiForgeryToken]
        public ActionResult EditConfirm(int? id, Product productModel)
        {
            if (ModelState.IsValid)
            {
                using (var db = new ShoppingListDbContext())
                {
                    var product = db.Products.Find(id);

                    if (product == null)
                    {
                        return RedirectToAction("index", "Product");
                    }

                    product.Name = productModel.Name;
                    product.Priority = productModel.Priority;
                    product.Quantity = productModel.Quantity;
                    product.Status = productModel.Status;
                    
                    db.SaveChanges();
                }
                return RedirectToAction("index", "Product");
            }
            return RedirectToAction("Edit", "Product");
        }
    }
}