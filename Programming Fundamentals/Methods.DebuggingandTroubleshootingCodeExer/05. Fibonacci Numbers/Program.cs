using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _05.Fibonacci_Numbers
{
    class Program
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());
            Console.WriteLine(FabobacciNumber(n));

        }


        static int FabobacciNumber(int n)
        {

            int fabonacci = 0;
            int firstValue =0;
            int secondValue = 1;
            int trhirdValue = 0;
            if (n == 0)
            {
                fabonacci = 1;
            }
            else { 
                for (int i = 1; i <= n; i++)
                {
                    trhirdValue = firstValue + secondValue;
                    firstValue = secondValue;
                    secondValue = trhirdValue;
                }
            
            fabonacci = trhirdValue;
            }
            return fabonacci;
        }

    }
}
