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
            int key = int.Parse(Console.ReadLine());
            int n = int.Parse(Console.ReadLine());
            object wordToPrint = "";
            for (int i = 0; i < n; i++)
            {
                char symbol = char.Parse(Console.ReadLine());
                symbol = (char)((int)symbol + key);
                wordToPrint = wordToPrint + symbol.ToString();
            }

            Console.WriteLine("{0}", wordToPrint);
        }
    }
}
