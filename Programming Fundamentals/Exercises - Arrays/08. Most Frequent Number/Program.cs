using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _08.Most_Frequent_Number
{
    class Program
    {
        static void Main(string[] args)
        {
            int[] array = Console.ReadLine().Split(' ').Select(int.Parse).ToArray();

            int[] nums = new int[array.Length];
            int[] timesSeen = new int[array.Length];


            for (int i = 0; i < array.Length; i++)
            {
                bool isSeen = false;
                for (int j = 0; j < nums.Length; j++)
                {
                    if (array[i] == nums[j])
                    {
                        timesSeen[j]++;
                        isSeen = true;
                        continue;
                    }
                    
                }
                if (!isSeen)
                {
                    nums[i] = array[i];
                    timesSeen[i] = 1;
                }
            }
            int place = 0;
            int lastBiggest = 0;
            for (int i = 0; i < timesSeen.Length; i++)
            {
                if (timesSeen[i] > lastBiggest)
                {
                    lastBiggest = timesSeen[i];
                    place = i;
                }
            }
            Console.WriteLine(nums[place]);


        }
    }
}
