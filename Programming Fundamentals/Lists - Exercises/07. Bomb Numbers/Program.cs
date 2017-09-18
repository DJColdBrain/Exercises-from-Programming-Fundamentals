using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _07.Bomb_Numbers
{
    class Program
    {
        static void Main(string[] args)
        {
            List<int> nums = Console.ReadLine().Split(' ').Select(int.Parse).ToList();
            int[] bomb = Console.ReadLine().Split(' ').Select(int.Parse).ToArray();

            while (nums.Contains(bomb[0]))
            {

                int index = nums.IndexOf(bomb[0]);
                for (int i = 0; i < bomb[1]; i++)
                {
                    if (index > 0)
                    {
                        nums.RemoveAt(index - 1);
                        index--;
                    }
                    if (index < nums.Count -1)
                    {
                        nums.RemoveAt(index + 1);
                    }
                }
                nums.RemoveAt(index);

            }
            Console.WriteLine(nums.Sum());

        }
    }
}
