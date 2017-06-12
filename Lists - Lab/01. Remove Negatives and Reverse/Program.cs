using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _01.Remove_Negatives_and_Reverse
{
    class Program
    {
        static void Main(string[] args)
        {
            List<int> nums = Console.ReadLine().Split(' ').Select(int.Parse).ToList();

            for (int i = 0; i < nums.Count; i++) 
            {
                if (nums[i] < 0)
                {
                    nums.RemoveAt(i);
                    i--;
                }
            }
            if (nums.Count <= 0)
            {
                Console.WriteLine("empty");
            }else
            {
                nums.Reverse();
                Console.WriteLine(string.Join(" " , nums));
            }

        }
    }
}
