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

            string[] comand = { "" ,""};
            while (comand[0] != "done")
            {
                comand = Console.ReadLine().Split(' ');
                if (comand[0] == "done")
                {
                    break;

                }

                int indexOfElement = Array.IndexOf(nameOfProduct, comand[0]);

                if (indexOfElement >= quantity.Length )
                {
                    Console.WriteLine($"We do not have enough {nameOfProduct[indexOfElement]}");
                }else if(quantity[indexOfElement] < long.Parse(comand[1]))
                {
                    Console.WriteLine($"We do not have enough {nameOfProduct[indexOfElement]}");
                }
                else {
                    quantity[indexOfElement] -= long.Parse(comand[1]);
                Console.WriteLine($"{nameOfProduct[indexOfElement]} x {comand[1]} costs {(price[indexOfElement] * long.Parse(comand[1])):f2}");
                }
            }
        }
    }
}
