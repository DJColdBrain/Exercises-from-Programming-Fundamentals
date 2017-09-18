using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _14.Integer_to_Hex_and_Binary
{
    class Program
    {
        static void Main(string[] args)
        {
            int decimall =int.Parse( Console.ReadLine());
            string hex = decimall.ToString("X");
            Console.WriteLine(hex);
            string binary = Convert.ToString(decimall, toBase:2);
            Console.WriteLine(binary);

        }
    }
}
