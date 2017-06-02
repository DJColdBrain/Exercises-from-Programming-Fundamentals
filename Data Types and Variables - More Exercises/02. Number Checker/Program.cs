using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _02.Number_Checker
{
    class Program
    {
        static void Main(string[] args)
        {
            double num = double.Parse(Console.ReadLine());
            if (Math.Ceiling(num) != num && Math.Floor(num) != num)
            {
                Console.WriteLine("floating-point");
            }
            else Console.WriteLine("integer");
    } }
}
