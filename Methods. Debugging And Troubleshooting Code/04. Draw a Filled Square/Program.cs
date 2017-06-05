using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _04.Draw_a_Filled_Square
{
    class Program
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());
            PrintSomeMonstrosity(n);
        }
        static void PrintSomeMonstrosity(int n)
        {
            PrintHeader(n);
            for (int i = 0; i < n-2; i++)
            {
                PrintMiddleRows(n);
            }
            PrintHeader(n);
        }

        static void PrintHeader(int n )
        {
            Console.WriteLine(new string('-', n*2));
        }
        static void PrintMiddleRows(int n)
        {
            Console.Write("-");
            for (int i = 1; i < n; i++)
            {
                Console.Write("\\/");
            }
            Console.WriteLine("-");
        }
    }
}
