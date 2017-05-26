using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApplication2
{
    class Program
    {
        static void Main(string[] args)
        {
            string s = Console.ReadLine();
            int q = int.Parse(Console.ReadLine());
            if (s == "Athlete")
            {
                Console.WriteLine("The {0} has to pay {1:f2}.", s, q * 0.70);

            }
            else if (s == "Businessman" || s == "Businesswoman")
            {
                Console.WriteLine("The {0} has to pay {1:f2}.", s, q * 1.00);
            }
            else if (s == "SoftUni Student") { Console.WriteLine("The {0} has to pay {1:f2}.", s, q * 1.70); }
            else { Console.WriteLine("The {0} has to pay {1:f2}.", s, q* 1.20); }

        }
    }
}
