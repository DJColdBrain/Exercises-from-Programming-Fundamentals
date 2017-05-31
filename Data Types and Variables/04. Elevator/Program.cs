using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _04.Elevator
{
    class Program
    {
        static void Main(string[] args)
        { 
                 int e = int.Parse (Console .ReadLine());
            float c = float.Parse(Console.ReadLine());
            int cources = (int)Math.Ceiling((double)(e / c));

            Console.WriteLine(cources);

        }
    }
}
