using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _10.Cube_Properties
{
    class Program
    {
        static void Main(string[] args)
        {
            
            string parameter = Console.ReadLine();
            GetCubeParameter(parameter);
        }

        static void GetCubeParameter( string parameter)
        {
            double area = 0.0;

            switch (parameter)
            {
                case "triangle":
                    double widthTriangle = double.Parse(Console.ReadLine());
                    double heightTriangle = double.Parse(Console.ReadLine());
                    area = widthTriangle * heightTriangle / 2d;
                    break;
                case "square":
                    double sideSquare = double.Parse(Console.ReadLine());
                    area = sideSquare * sideSquare;
                    break;
                case "rectangle":
                    double widthRect = double.Parse(Console.ReadLine());
                    double heightRect = double.Parse(Console.ReadLine());
                    area = widthRect * heightRect;
                    break;
                case "circle":
                    double radius = double.Parse(Console.ReadLine());
                    area = Math.PI * radius * radius;
                    break;

            }

            Console.WriteLine("{0:f2}",area);
        }


    }
}
