using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _06.Square_Numbers
{
    class Program
    {
        static void Main(string[] args)
        {
            List<int> nums = Console.ReadLine().Split(' ').Select(int.Parse).ToList();
            List<int> sqares = new List<int>();

            foreach (var num in nums)
            {
                if (Math.Sqrt(num) == (int)(Math.Sqrt(num)))
                {
                    sqares.Add(num);
                }
            }
            sqares.Sort();
            sqares.Reverse();
            Console.WriteLine(string.Join(" ", sqares));
        }
    }
}
