using System;

namespace _08.Center_Point
{
    class Program
    {
        static void Main(string[] args)
        {
            double x1 = double.Parse(Console.ReadLine());
            double y1 = double.Parse(Console.ReadLine());
            double x2 = double.Parse(Console.ReadLine());
            double y2 = double.Parse(Console.ReadLine());
            double x3 = double.Parse(Console.ReadLine());
            double y3 = double.Parse(Console.ReadLine());
            double x4 = double.Parse(Console.ReadLine());
            double y4 = double.Parse(Console.ReadLine());
            GetBiggerLine(x1, y1, x2, y2, x3, y3, x4, y4);
        }

        static void GetCenterCordinates(double x1, double y1, double x2, double y2)
        {

            if (Math.Abs(x1) + Math.Abs(y1) <= Math.Abs(x2) + Math.Abs(y2))
            {
                Console.Write($"({x1}, {y1})");
                Console.WriteLine($"({x2}, {y2})");
            }
            else
            {
                Console.Write($"({x2}, {y2})");
                Console.WriteLine($"({x1}, {y1})");
            }

        }

        static void GetBiggerLine(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4)
        {

            double lineA = Math.Sqrt(Math.Abs(x1 - x2) * Math.Abs(x1 - x2) + Math.Abs(y1 - y2) * Math.Abs(y1 - y2));
            double lineB = Math.Sqrt(Math.Abs(x3 - x4) * Math.Abs(x3 - x4) + Math.Abs(y3 - y4) * Math.Abs(y3 - y4));

            if (lineA > lineB)
            {
                GetCenterCordinates(x1, y1, x2, y2);
            }
            else
            {
                GetCenterCordinates(x3, y3, x4, y4);
            }

        }

    }
}
