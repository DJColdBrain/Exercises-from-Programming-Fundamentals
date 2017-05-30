using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApplication1
{
    class Program
    {
        static void Main(string[] args)
        {
            string s = Console.ReadLine();
            if (s == "Athlete")
            {
                Console.WriteLine("Water");

            }
            else if (s == "Businessman" || s == "Businesswoman")
            {
                Console.WriteLine("Coffee");
            }
            else if (s == "SoftUni Student") { Console.WriteLine("Beer"); }
            else { Console.WriteLine("Tea"); }

        }
    }
}
