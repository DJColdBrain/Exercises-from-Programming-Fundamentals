using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _03.Practice_Chars_And_Strings
{
    class Program
    {
        static void Main(string[] args)
        {
            String name = Console.ReadLine();
            Char a = char.Parse(Console.ReadLine());
            Char b = char.Parse(Console.ReadLine());
            Char c = char.Parse(Console.ReadLine());
            String lastRow = Console.ReadLine();

            Console.WriteLine(name);
            Console.WriteLine(a);
            Console.WriteLine(b);
            Console.WriteLine(c);
            Console.WriteLine(lastRow);

        }
    }
}
