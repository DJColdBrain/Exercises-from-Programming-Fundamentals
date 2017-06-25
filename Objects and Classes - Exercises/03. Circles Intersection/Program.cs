using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _03.Circles_Intersection
{
    class Circle
    {
        public int X { get; set; }
        public int Y { get; set; }
        public int R { get; set; }


    }

    class Program
    {
        static void Main(string[] args)
        {
            int[] paramehers = Console.ReadLine().Split(' ').Select(int.Parse).ToArray();
            Circle circle1 = new Circle() { X = paramehers[0], Y = paramehers[1] , R = paramehers[2]};
            paramehers = Console.ReadLine().Split(' ').Select(int.Parse).ToArray();
            Circle circle2 = new Circle() { X = paramehers[0], Y = paramehers[1], R = paramehers[2] };

            if (AreCirclesCrosing(circle1, circle2))
            {
                Console.WriteLine("Yes");
            }
            else
            {
                Console.WriteLine("No");
            }


        }


        static bool AreCirclesCrosing(Circle circle1, Circle circle2)
        {
            var x = Math.Abs(circle1.X - circle2.X);
            var y = Math.Abs(circle1.Y - circle2.Y);

            var d = Math.Sqrt(x * x + y * y);

            if (d <= circle2.R + circle1.R)
            {
                return true;
            }
            else
            {

                return false;
            }
        }
    }
}
