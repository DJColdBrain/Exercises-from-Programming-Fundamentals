using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _02.Rotate_and_Sum
{
    class Program
    {
        static void Main(string[] args)
        {
            int[] array = Console.ReadLine().Split(' ').Select(int.Parse).ToArray();
            int n = int.Parse(Console.ReadLine());
            int[] sum = new int[array.Count()];

            for (int i = 0; i < n; i++)
            {
                Rotate(array, sum);
            }
            Console.WriteLine(string.Join(" ", sum));

        }
        static void Rotate(int[] array, int[] sum)
        {
            int holder = array[array.Length - 1];
            for (int i = array.Length - 1; i >0; i--)
            {
                array[i] = array[i -1];
            }
            array[0] = holder;

            for (int i = 0; i < array.Length; i++)
            {
                sum[i] += array[i];
            }



        }
    }
}
