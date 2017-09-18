using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _04.Longest_Increasing_Subsequence
{
    class Program
    {
        static void Main(string[] args)
        {
            int[] nums = Console.ReadLine().Split(' ').Select(int.Parse).ToArray();
            int[] len = new int[nums.Length];
            int[] prev = new int[nums.Length];

            int leftIndex = -1;
            int bestLenght = 0;
            List<int> LIS = new List<int>();

            for (int i = 0; i < nums.Length; i++)
            {
                len[i] = 1;
                prev[i] = -1;

                int numFromI = nums[i];
                for (int j = 0; j < i; j++)
                { int currentNum = nums[j];
                    if (currentNum < numFromI && len[j]+1 > len[i])
                    {
                        len[i] = len[j] + 1;
                        prev[i] = j;
                    }
                }
                if (len[i] > bestLenght)
                {
                    bestLenght = len[i];
                    leftIndex = i;
                }
            }

            while(leftIndex != -1)
            {
                LIS.Add(nums[leftIndex]);
                leftIndex = prev[leftIndex];
            }
            LIS.Reverse();
            Console.WriteLine(string.Join(" ", LIS));
        }
    }
}
