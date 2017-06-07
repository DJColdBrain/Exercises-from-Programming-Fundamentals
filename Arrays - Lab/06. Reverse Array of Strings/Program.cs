using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _06.Reverse_Array_of_Strings
{
    class Program
    {
        static void Main(string[] args)
        {
            string[] items = Console.ReadLine().Split(' ');
            ReverceArray(items);

            Console.WriteLine(string.Join(" ", items));


        }

        static void ReverceArray(string[] items)
        {
            string lastString;

            for (int i = 0; i < items.Length/2; i++)
            {
                lastString = items[i];
                items[i] = items[items.Count() - 1-i];
                items[items.Count() - 1 - i] = lastString;
            }
        }
    }
}
