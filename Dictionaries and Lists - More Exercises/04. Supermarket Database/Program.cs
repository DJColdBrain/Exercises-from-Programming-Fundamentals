using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _04.Supermarket_Database
{
    class Program
    {
        static void Main(string[] args)
        {
            string[] products = Console.ReadLine().Split(' ');
            Dictionary<string, double> productPrice = new Dictionary<string, double>();
            Dictionary<string, int> productQuantity = new Dictionary<string, int>();


            while (!products[0].Equals("stocked"))
            {
                string nameOfProduct = products[0];
                int quantity = int.Parse(products[2]);
                Double price = double.Parse(products[1]);
                if (!productPrice.ContainsKey(nameOfProduct))
                {
                    productPrice.Add(nameOfProduct, price);
                    productQuantity.Add(nameOfProduct, quantity);
                }
                else
                {
                    productPrice[nameOfProduct] = price;
                    productQuantity[nameOfProduct] += quantity;
                }

                

                products = Console.ReadLine().Split(' ');
            }
           
            double sum = 0;
            foreach (var item in productPrice)
            {
                Console.WriteLine(
                    $"{item.Key}: ${productPrice[item.Key]:F2} " +
                    $"* {productQuantity[item.Key]} = " +
                    $"${productQuantity[item.Key] * productPrice[item.Key]:F2}");

                sum += productQuantity[item.Key] * productPrice[item.Key];
            }
            Console.WriteLine(new String('-', 30));
            Console.WriteLine("Grand Total: ${0:F2}", sum);
        }
    }
}
