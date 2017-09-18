using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _04.Grab_and_Go
{
    class Program
    {
        static void Main(string[] args)
        {
            int[] array = Console.ReadLine().Split(' ').Select(int.Parse).ToArray();
            int n = int.Parse(Console.ReadLine());

            bool isThere = false;
            int lastIndex = 0;
            for (int i = 0; i < array.Length; i++)
            {
                if (array[i] == n)
                {
                    isThere = true;
                    lastIndex = i;
                }
            }

            if (!isThere)
            {
                Console.WriteLine("No occurrences were found!");
            }
            else
            {
                long sum = 0;
                for (int i = lastIndex-1; i >= 0; i--)
                {
                    sum += array[i];
                }
                Console.WriteLine(sum);
            }
        }
    }
}
