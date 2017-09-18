using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApplication7
{
    class Program
    {
        static void Main(string[] args)
        {
            float budget = float.Parse(Console.ReadLine());
            int n = int.Parse(Console.ReadLine());
            double money_spent = 0.0;
            for (int i = 0; i < n; i++)
            {
                String s = Console.ReadLine();

                float price = float.Parse(Console.ReadLine());

                int quantity = int.Parse(Console.ReadLine());
                // int quantity = int.Parse(Console.ReadLine());

                money_spent += price * quantity;
                if (quantity < 2)
                    Console.WriteLine($"Adding {quantity} {s} to cart.");
                else Console.WriteLine($"Adding {quantity} {s}s to cart.");
            }

            if (money_spent <= budget)
            {
                Console.WriteLine($"Subtotal: ${money_spent :f2}");
                Console.WriteLine($"Money left: ${(budget - money_spent):f2}");
            }
            else
            {
                Console.WriteLine($"Subtotal: ${money_spent :f2}");
                Console.WriteLine($"Not enough. We need ${(money_spent - budget):f2} more.");
            }

        }
    }
}