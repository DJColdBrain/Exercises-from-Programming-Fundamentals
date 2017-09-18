using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _16.Comparing_floats
{
    class Program
    {
        static void Main(string[] args)
        {
            double a = double.Parse(Console.ReadLine());
            double b = double.Parse(Console.ReadLine());
            double esq = 0.000001;

            if (Math.Abs(a-b) < esq)
            {
                Console.WriteLine(true);
            }
            else Console.WriteLine(false);



        }
    }
}
