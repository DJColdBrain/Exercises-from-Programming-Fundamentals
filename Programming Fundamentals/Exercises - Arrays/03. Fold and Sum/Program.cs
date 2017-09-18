using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _03.Fold_and_Sum
{
    class Program
    {
        static void Main(string[] args)
        {
            int[] intArr = Console.ReadLine().Split(' ').Select(int.Parse).ToArray();
            int k = intArr.Length /4;

            int[] leftSideArr = new int[k];
            int[] rightSideArr = new int[k];
            int[] middleArr = new int[k*2];

            for (int i = 0; i < k; i++)
            {
                leftSideArr[i] = intArr[i];
            }
            for (int i = 0; i < k; i++)
            {
                rightSideArr[i ] = intArr[intArr.Length-1-i];
            }
            for (int i = k; i < 3*k; i++)
            {
                middleArr[i-k] = intArr[i];
            }
            ReverceArr(leftSideArr);



            for (int i = 0; i < leftSideArr.Length; i++)
            {
                middleArr[i] += leftSideArr[i];
            }
            for (int i = rightSideArr.Length-1; i >= 0 ; i--)
            {
                middleArr[i + rightSideArr.Length] += rightSideArr[i];
            }


            Console.WriteLine(string.Join(" ", middleArr));

        }

        static void ReverceArr(int[] array)
        {
            for (int i = 0; i < array.Length/2; i++)
            {
                int holder = array[i];
                array[i] = array[array.Length - 1 - i];
                array[array.Length - 1 - i] = holder;
            }

        }

    }
}
