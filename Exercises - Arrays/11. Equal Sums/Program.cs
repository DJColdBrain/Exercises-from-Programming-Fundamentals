using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _11.Equal_Sums
{
    class Program
    {
        static void Main(string[] args)
        {
            int[] array = Console.ReadLine().Split(' ').Select(int.Parse).ToArray();

            bool isThere = false;
            for (int i = 0; i < array.Length; i++)
            {
                int k = i;
                int leftSum = 0;
                int rightSum = 0;
                int l = i;
                while (k > 0)
                {                    
                    k--;
                    leftSum += array[k];
                }
                while (l < array.Length-1 )
                {
                    l++;
                    rightSum += array[l];
                }
                if (leftSum == rightSum)
                {
                    Console.WriteLine(i);
                    isThere = true;
                    break;
                }

            }
            if (!isThere)
            {
                Console.WriteLine("no");
            }

        }
    }
}
