using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _04.Triple_Sum
{
    class Program
    {
        static void Main(string[] args)
        {
            checked
            {
                string values = Console.ReadLine();
                string[] items = values.Split(' ');
                long[] arr = new long[items.Length];
                for (int i = 0; i < items.Length; i++)
                {
                    arr[i] = int.Parse(items[i]);
                }
                bool isHaving = false;
                for (int i = 0; i < arr.Length -1; i++)
                {
                    for (int j = 1 + i; j < arr.Length; j++)
                    {
                        for (int g = 0; g < arr.Length; g++)
                        {
                            if (arr[i] + arr[j] == arr[g])
                            {
                                Console.WriteLine($"{arr[i]} + {arr[j]} == {arr[g]}");
                                isHaving = true;
                                break;
                            }
                        }
                    }

                }
                if (!isHaving)
                {
                    Console.WriteLine("No");
                }


            }
        }
    }
}
