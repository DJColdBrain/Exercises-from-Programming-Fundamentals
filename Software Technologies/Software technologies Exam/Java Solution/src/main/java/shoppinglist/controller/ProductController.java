package shoppinglist.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import shoppinglist.bindingModel.ProductBindingModel;
import shoppinglist.entity.Product;
import shoppinglist.repository.ProductRepository;

import java.util.List;
import java.util.stream.Collectors;

@Controller
public class ProductController {

	private final ProductRepository productRepository;

	@Autowired
	public ProductController(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}

	@GetMapping("/")
	public String index(Model model) {
		List<Product> products = productRepository.findAll();
		model.addAttribute("products", products);
		model.addAttribute("view", "product/index");

		return "base-layout";
	}

	@GetMapping("/create")
	public String create(Model model) {
		model.addAttribute("view", "product/create");

		return "base-layout";
	}

	@PostMapping("/create")
	public String createProcess(Model model, ProductBindingModel productBindingModel) {

		if (productBindingModel.getName().equals("")){
			model.addAttribute("product", productBindingModel);
			model.addAttribute("view", "product/create");
			return "base-layout";
		}

		Product productEntity = new Product(
				productBindingModel.getPriority(),
				productBindingModel.getName(),
				productBindingModel.getQuantity(),
				productBindingModel.getStatus()
		);

		this.productRepository.saveAndFlush(productEntity);

		return "redirect:/";
	}

	@GetMapping("/edit/{id}")
	public String edit(Model model, @PathVariable int id) {
		if (!this.productRepository.exists(id)) {
			return "redirect:/";
		}
		Product product =this.productRepository.findOne(id);

		model.addAttribute("product" , product);
		model.addAttribute("view", "product/edit");

		return "base-layout";
	}

	@PostMapping("/edit/{id}")
	public String editProcess(Model model, @PathVariable int id, ProductBindingModel productBindingModel) {
		if (!this.productRepository.exists(id)) {
			return "redirect:/";
		}
		if (productBindingModel.getName().equals("")){
			Product product = new Product();
			product.setId(id);
			product.setName(productBindingModel.getName());
			product.setStatus(productBindingModel.getStatus());
			product.setPriority(productBindingModel.getPriority());
			product.setQuantity(productBindingModel.getQuantity());
			model.addAttribute("product", product);
			model.addAttribute("view", "product/edit");
			return "base-layout";
		}

		Product product =this.productRepository.findOne(id);

		product.setName(productBindingModel.getName());
		product.setPriority(productBindingModel.getPriority());
		product.setQuantity(productBindingModel.getQuantity());
		product.setStatus(productBindingModel.getStatus());

		this.productRepository.saveAndFlush(product);

		return "redirect:/";
	}
}
