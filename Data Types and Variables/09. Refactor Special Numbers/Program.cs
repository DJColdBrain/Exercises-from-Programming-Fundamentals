using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _09.Refactor_Special_Numbers
{
    class Program
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());
      
            for (int i = 1; i <= n; i++)
            {
                int sumOfNumbers = 0;

                int number = i;
                while (number > 0)
                {
                    sumOfNumbers += number % 10;
                    number = number / 10;
                }
                bool isMagical = (sumOfNumbers == 5) || (sumOfNumbers == 7) || (sumOfNumbers == 11);
                Console.WriteLine($"{i} -> {isMagical}");
                sumOfNumbers = 0;
               
            }



        }
    }
}
