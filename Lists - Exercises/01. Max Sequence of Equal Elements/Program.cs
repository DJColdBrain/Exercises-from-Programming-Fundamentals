using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _01.Max_Sequence_of_Equal_Elements
{
    class Program
    {
        static void Main(string[] args)
        {
            List<int> nums = Console.ReadLine().Split(' ').Select(int.Parse).ToList();
            int count= 0;
            List<int> result = new List<int>();
            int max = 0;
            int biggestNum = 0;
            int lastNum = nums[0];
            foreach (var num in nums)
            {
                if (num == lastNum )
                {
                    count++;
                    lastNum = num;
                }

                if (max < count)
                    {
                        max = count;
                        biggestNum = lastNum;
                    }
                    if (num != lastNum)
                    
                    {
                        lastNum = num;
                        count = 1;
                    }
                
                


            }
            for (int i = 0; i < max; i++)
            {
                result.Add(biggestNum);
            }
            Console.WriteLine(string.Join(" ", result));
        }
    }
}
