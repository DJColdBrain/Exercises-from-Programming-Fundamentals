using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _06.Math_Power
{
    class Program
    {
        static void Main(string[] args)
        {
            double number = double.Parse(Console.ReadLine());
            int power = int.Parse(Console.ReadLine());
            Console.WriteLine(PowerMath(number,power));


        }
        static double PowerMath (double number , int power)
        {
            double result = Math.Pow(number, power);

            return result;
        }
    }
}
