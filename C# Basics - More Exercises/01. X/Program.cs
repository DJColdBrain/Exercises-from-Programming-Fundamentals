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
            int n = int.Parse(Console.ReadLine());
            int t = 0;
            for (int i = 0; i < n / 2; i++)
            {
                Console.Write(new string(' ', i));
                Console.Write(new string('x', 1));
                Console.Write(new string(' ', n - 2 - (2 * i)));
                Console.Write(new string('x', 1));
                Console.Write(new string(' ', i));
                Console.WriteLine();
                t = i;
            }
            Console.Write(new string(' ', t + 1));
            Console.Write(new string('x', 1));
            Console.Write(new string(' ', t + 1));
            Console.WriteLine();
            for (int i = n / 2; i >= 1; i--)
            {
                Console.Write(new string(' ', i - 1));
                Console.Write(new string('x', 1));
                Console.Write(new string(' ', n - (2 * i)));
                Console.Write(new string('x', 1));
                Console.Write(new string(' ', i - 1));
                Console.WriteLine();
                t = i;
            }


        }
    }
}
