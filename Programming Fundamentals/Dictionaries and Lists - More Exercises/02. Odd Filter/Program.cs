using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _02.Odd_Filter
{
    class Program
    {
        static void Main(string[] args)
        {
            int[] numbers = Console.ReadLine().Split(' ').Select(int.Parse).ToArray();
            numbers = numbers.Where(x => x % 2 == 0).ToArray();
            List<int> goodNumbers = new List<int>();
            double average = numbers.Average();
            for (int i = 0; i < numbers.Length; i++)
            {
               
                    if (numbers[i] > average)
                    {
                        numbers[i]++;
                    }
                    else
                    {
                        numbers[i]--;
                    }
                    goodNumbers.Add(numbers[i]);

            }
            Console.WriteLine(string.Join(" ", goodNumbers));
        }
    }
}
