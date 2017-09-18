using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _09.Make_a_Word
{
    class Program
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());
            object wordToPrint = "";
            for (int i = 0; i < n; i++)
            {
                char symbol = char.Parse(Console.ReadLine());
                wordToPrint = wordToPrint + symbol.ToString();
            }

            Console.WriteLine("The word is: {0}", wordToPrint);
        }
    }
}
