using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _01.Array_Statistics
{
    class Program
    {
        static void Main(string[] args)
        {
            long[] array = Console.ReadLine().Split(' ').Select(long.Parse).ToArray();

            long count = 0;
            long sum = 0;
            double average = 0;
            long min = long.MaxValue;
            long max = long.MinValue;

            for (int i = 0; i < array.Length; i++)
            {
                count++;
                sum += array[i];
                if (min > array[i])
                {
                    min = array[i];
                }
                if (max < array[i])
                {
                    max = array[i];
                }

            }
            average = (double)sum / (double)count;
            Console.WriteLine($@"Min = {min}
Max = {max}
Sum = {sum}
Average = {average}");
        }
    }
}
