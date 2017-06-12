using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _07.Count_Numbers
{
    class Program
    {
        static void Main(string[] args)
        {
            List<int> nums = Console.ReadLine().Split(' ').Select(int.Parse).ToList();
            int count = 1;
            nums.Sort();
            for (int i = 0; i < nums.Count; i++)
            {
                while (true) {
                if (i + count == nums.Count || nums[i] != nums[i + count] || i == nums.Count - 1)
                {
                    Console.WriteLine($"{nums[i]} -> {count}");
                    i = i + count-1;
                    count = 0;
                    break;
                }
                    count++;
                }
                count++;
            }


        }
    }
}
