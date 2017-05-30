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
            int width = int.Parse(Console.ReadLine());
            int height = int.Parse(Console.ReadLine());
            double mp;
            mp = width * height / 1000000.0;

            Console.WriteLine($"{width}x{height} => {Math.Round(mp, 1)}MP");
        }
    }
}
