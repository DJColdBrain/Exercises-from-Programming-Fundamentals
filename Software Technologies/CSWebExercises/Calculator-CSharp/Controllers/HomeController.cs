using Calculator_CSharp.Models;
using System.Web.Mvc;
using System;

namespace Calculator_CSharp.Controllers
{
    public class HomeController : Controller
    {
        public ActionResult Index(Calculator calculator)
        {
            return View(calculator);
        }

        [HttpPost]
        public ActionResult Calculate(Calculator calculator)
        {
            calculator.Result = CalculatorResult(calculator);

            return RedirectToAction("Index", calculator);
        }

        private decimal CalculatorResult(Calculator calculator)
        {
            var result = 0m;

            switch (calculator.Operator)
            {
                case "+":
                    result = calculator.LeftOperand + calculator.RightOperand;
                    break;
                case "-":
                    result = calculator.LeftOperand - calculator.RightOperand;
                    break;
                case "*":
                    result = calculator.LeftOperand * calculator.RightOperand;
                    break;
                case "/":
                    if (calculator.RightOperand != 0)
                    {
                        result = calculator.LeftOperand / calculator.RightOperand;
                    }else
                    {
                        result = 0;
                    }
                    break;
            }
            return result;

        }
    }
}