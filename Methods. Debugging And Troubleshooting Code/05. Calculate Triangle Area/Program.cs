using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _05.Calculate_Triangle_Area
{
    class Program
    {
        static void Main(string[] args)
        {
            double width = double.Parse(Console.ReadLine());
            double height = double.Parse(Console.ReadLine());
            double area = TriangleAreaCalculation(width, height);
            Console.WriteLine(area);

        }
        static double TriangleAreaCalculation (double width, double height)
        {
            double area = width * height / 2;
            return area;
        }
    }
}
