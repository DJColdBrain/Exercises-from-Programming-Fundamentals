using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _08.Condense_Array_to_Number
{
    class Program
    {
        static void Main(string[] args)
        {

            int[] nums = Console.ReadLine().Split(' ').Select(int.Parse).ToArray();
            if (nums.Count() == 1)
            {
                Console.WriteLine(nums[0]);
            }
            else
            {
                int[] condensed = new int[2];

                while (condensed.Count() > 1)
                {
                    condensed = new int[nums.Count() - 1];
                    for (int i = 0; i < nums.Count() - 1; i++)
                    {
                        condensed[i] = nums[i] + nums[i + 1];
                    }
                    nums = (int[])condensed.Clone();
                }

                Console.WriteLine(condensed[0]);
            }
        }
    }
}
