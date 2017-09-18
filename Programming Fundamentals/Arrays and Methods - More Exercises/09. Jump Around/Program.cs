using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _09.Jump_Around
{
    class Program
    {
        static void Main(string[] args)
        {
            int[] array = Console.ReadLine().Split(' ').Select(int.Parse).ToArray();

            int sum = 0;
            int index = 0;
            while (true)
            {
                sum += array[index];
                if (index + array[index] <= array.Length-1)
                {
                    index = array[index]+index;
                }
                else if (index - array[index] > 0)
                {
                    index = index - array[index];
                }
                else
                {
                    break;
                }
            }
            Console.WriteLine(sum);

        }
    }
}
