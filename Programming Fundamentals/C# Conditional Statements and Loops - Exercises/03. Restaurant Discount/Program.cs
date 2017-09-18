using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApplication3
{
    class Program
    {
        static void Main(string[] args)
        {
            int q = int.Parse(Console.ReadLine());
            string s = Console.ReadLine();


            if (q <= 50)
            { if (s == "Normal")
                Console.WriteLine("We can offer you the Small Hall\r\nThe price per person is {0:f2}$", (2500+500) * 0.95/q);
                if (s == "Gold")
                    Console.WriteLine("We can offer you the Small Hall\r\nThe price per person is {0:f2}$", (2500+750) * 0.90/q);
                if (s == "Platinum")
                    Console.WriteLine("We can offer you the Small Hall\r\nThe price per person is {0:f2}$", (2500+1000) * 0.85/q);
            }
            else if (q <= 100)
            {
                if (s == "Normal")
                    Console.WriteLine("We can offer you the Terrace\r\nThe price per person is {0:f2}$",( 5000 + 500) * 0.95 / q);
                if (s == "Gold")
                    Console.WriteLine("We can offer you the Terrace\r\nThe price per person is {0:f2}$",( 5000 + 750) * 0.90 / q);
                if (s == "Platinum")
                    Console.WriteLine("We can offer you the Terrace\r\nThe price per person is {0:f2}$", (5000 + 1000) * 0.85 / q);
            }
            else if (q <= 120)
            {
                if (s == "Normal")
                    Console.WriteLine("We can offer you the Great Hall\r\nThe price per person is {0:f2}$", (7500 + 500) * 0.95 / q);
                if (s == "Gold")
                    Console.WriteLine("We can offer you the Great Hall\r\nThe price per person is {0:f2}$",( 7500 + 750 )* 0.90 / q);
                if (s == "Platinum")
                    Console.WriteLine("We can offer you the Great Hall\r\nThe price per person is {0:f2}$", (7500 + 1000) * 0.85 / q);
            }
            else {
                Console.WriteLine("We do not have an appropriate hall.");

            }

        }
    }
}
