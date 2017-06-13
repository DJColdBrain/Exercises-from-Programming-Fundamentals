using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _03.Search_for_a_Number
{
    class Program
    {
        static void Main(string[] args)
        {
            List<int> nums = Console.ReadLine().Split(' ').Select(int.Parse).ToList();
            int[] commands = Console.ReadLine().Split(' ').Select(int.Parse).ToArray();
            List<int> results = new List<int>();
            for (int i = 0; i < commands[0]; i++)
            {
                results.Add(nums[i]);
            }
            for (int i = 0; i < commands[1]; i++)
            {
                results.RemoveAt(0);
            }
            if (results.Contains(commands[2]))
            {
                Console.WriteLine("YES!");
            }
            else
            {
                Console.WriteLine("NO!");
            }
        }
    }
}
