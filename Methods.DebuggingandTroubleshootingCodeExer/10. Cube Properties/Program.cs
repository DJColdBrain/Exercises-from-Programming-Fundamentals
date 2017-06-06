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
            double sideOfCube = double.Parse(Console.ReadLine());
            string parameter = Console.ReadLine();
            Console.WriteLine("{0:f2}", GetCubeParameter(sideOfCube,parameter));
        }

        static double GetCubeParameter(double sideOfCube , string parameter)
        {
            double cube = 0.0;

            switch (parameter) {
                case "face":
                    cube = Math.Sqrt(2*sideOfCube * sideOfCube);
                    break;
                case "space":
                    
                    cube = Math.Sqrt(3 * sideOfCube * sideOfCube);
                    break;
                case "volume":
                    cube = sideOfCube * sideOfCube * sideOfCube;
                    break;
                case "area":
                    cube = 6 * sideOfCube * sideOfCube;
                    break;

            }
            return cube;

        }


    }
}
