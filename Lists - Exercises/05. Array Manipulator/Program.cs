using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _05.Array_Manipulator
{
    class Program
    {
        static void Main(string[] args)
        {
            List<int> nums = Console.ReadLine().Split(' ').Select(int.Parse).ToList();
            string[] commands = { "" };

            while (commands[0] != "print")
            {
                commands = Console.ReadLine().Split(' ');
                if (commands[0] == "print")
                {
                    break;
                }
                if (commands[0] == "remove")
                {

                    nums.RemoveAt(int.Parse(commands[1]));
                    
                }
                else
                if (commands[0] == "add")
                {
                    nums.Insert( int.Parse(commands[1]), int.Parse(commands[2]));
                }
                else
                if (commands[0] == "addMany")
                {
                    List<int> add = new List<int>();
                    for (int i = 2 ; i < commands.Length; i++)
                    {
                        add.Add(int.Parse(commands[i]));
                    }
                    nums.InsertRange(int.Parse(commands[1]), add);
                }else
                if (commands[0] == "contains")
                {
                    if (nums.Contains(int.Parse(commands[1]))) 
                    {
                        Console.WriteLine(nums.IndexOf(int.Parse(commands[1])));
                    }
                    else
                    {
                        Console.WriteLine(-1);
                    }
                }
                else
                if (commands[0] == "shift")
                {
                    for (int i = 0; i < int.Parse(commands[1]) % nums.Count; i++)
                    {
                        nums.Add(nums[0]);
                        nums.RemoveAt(0);
                    }
                }
                else
                if (commands[0] == "sumPairs")
                {
                    List<int> list = new List<int>();
                    for (int i = 0; i < nums.Count; i+=2)
                    {
                        if (i < nums.Count - 1)
                        {
                            list.Add(nums[i] + nums[i + 1]);
                        }
                        else
                        {
                            list.Add(nums[i]);
                        }                      
                    }

                    nums = list;
                }
            }
            
            Console.Write("[");
            Console.Write(string.Join(", ", nums));
            Console.WriteLine("]");
        }
    }
}
