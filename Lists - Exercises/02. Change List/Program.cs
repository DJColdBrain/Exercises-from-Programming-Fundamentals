using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _02.Change_List
{
    class Program
    {
        static void Main(string[] args)
        {
            List<int> nums = Console.ReadLine().Split(' ').Select(int.Parse).ToList();
            string[] commands = { "" };

            while (commands[0] != "Even" && commands[0] != "Odd")
            {
                commands = Console.ReadLine().Split(' ');
                if (commands[0] == "Even" || commands[0] == "Odd")
                {
                    break;
                }
                if (commands[0] == "Delete")
                {
                    while (nums.Contains(int.Parse(commands[1])))
                    {
                        nums.Remove(int.Parse(commands[1]));
                    }
                }
                else
                if (commands[0] == "Insert")
                {
                    nums.Insert(int.Parse(commands[2]), int.Parse(commands[1]));
                }
            }
            List<int> result = new List<int>();
            if (commands[0] == "Even")
            {
                foreach (var num in nums)
                {
                    if (num % 2 ==0)
                    {
                        result.Add(num);
                    }
                }
            }
            else
            {
                foreach (var num in nums)
                {
                    if (num % 2 != 0)
                    {
                        result.Add(num);
                    }
                }

            }
            Console.WriteLine(string.Join(" ", result));

        }
    }
}
