using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _09.Extract_Middle_Elements
{
    class Program
    {
        static void Main(string[] args)
        {
            int[] nums = Console.ReadLine().Split(' ').Select(int.Parse).ToArray();

            if (nums.Count() == 1)
            {
                Console.Write("{ ");
                Console.Write(nums[0]);
                Console.WriteLine(" }");
            }
            else if(nums.Count() % 2 == 0)
            {
                Console.Write("{ ");
                for (int i = 0; i < nums.Count(); i++)
                {
                    
                    if (i == nums.Count()/2 -1 || i == nums.Count() / 2)
                    {
                        if (i != 0)
                        {
                            Console.Write(", " + nums[i]);
                        }else
                        Console.Write(nums[i]);
                    }
                    
                }
                Console.WriteLine(" }");
            }
            else
            {
                Console.Write("{ ");
                for (int i = 0; i < nums.Count(); i++)
                {
                    if (i == nums.Count() / 2 - 1 || i == nums.Count() / 2 || i == nums.Count() / 2 + 1)
                    {
                        if (i != 0)
                        {
                            Console.Write(", " + nums[i]);
                        }
                        else
                            Console.Write(nums[i]);
                    }
                   
                }
                Console.WriteLine(" }");
            }


        }
    }
}
