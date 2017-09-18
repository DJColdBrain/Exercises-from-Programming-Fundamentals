using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _07.Inventory_Matcher
{
    class Program
    {
        static void Main(string[] args)
        {
            string[] nameOfProduct = Console.ReadLine().Split(' ');
            long[] quantity = Console.ReadLine().Split(' ').Select(long.Parse).ToArray();
            decimal[] price = Console.ReadLine().Split(' ').Select(decimal.Parse).ToArray();

            string comand = "";
            while (comand != "done")
            {
                comand = Console.ReadLine();
                if (comand == "done")
                {
                    break;

                }

                int indexOfElement = Array.IndexOf(nameOfProduct, comand);

                Console.WriteLine($"{nameOfProduct[indexOfElement]} costs:" +
                    $" {price[indexOfElement]}; Available quantity: {quantity[indexOfElement]}");

            }
        }
    }
}
