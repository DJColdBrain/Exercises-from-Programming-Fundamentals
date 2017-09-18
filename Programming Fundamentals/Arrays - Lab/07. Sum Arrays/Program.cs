using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _07.Sum_Arrays
{
    class Program
    {
        static void Main(string[] args)
        {
            int[] firstArr = Console.ReadLine().Split(' ').Select(int.Parse).ToArray();
            int[] secondArr = Console.ReadLine().Split(' ').Select(int.Parse).ToArray();
            


            MaxArr(firstArr, secondArr);
            
            


        }

        static void MaxArr (int[] firstArr, int[] secondArr)
        {
            if (firstArr.Length > secondArr.Length)
            {
                int[] thirdArr = new int[firstArr.Length];
                int t = 0;
                bool isExit = false;
                while (!isExit)
                {
                    isExit = false;
                    int l = 0;
                    for (int i = 0; i < secondArr.Length; i++)
                    {
                        thirdArr[i + t] = secondArr[i];
                        l++;
                        if (i+t == thirdArr.Length-1)
                        {
                            isExit = true;
                            break;
                        }
                    }
                    if (isExit)
                    {
                        break;
                    }
                    t =t+ l;
                }
                for (int i = 0; i < firstArr.Length; i++)
                {
                    Console.Write((firstArr[i] + thirdArr[i]) + " ");
                }

            }
            else if (secondArr.Length > firstArr.Length)
            {
                int[] thirdArr = new int[secondArr.Length];
                int t = 0;
                bool isExit = false;
                while (!isExit)
                {
                    isExit = false;
                    int l = 0;
                    for (int i = 0; i < firstArr.Length; i++)
                    {
                        thirdArr[i + t] = firstArr[i];
                        l++;
                        if (i + t == thirdArr.Length - 1)
                        {
                            isExit = true;
                            break;
                        }
                    }
                    if (isExit)
                    {
                        break;
                    }
                    t = t + l;
                }
                for (int i = 0; i < secondArr.Length; i++)
                {
                    Console.Write((secondArr[i] + thirdArr[i]) + " ");
                }


            }
            else
            {
                for (int i = 0; i < firstArr.Length; i++)
                {
                    Console.Write((firstArr[i] + secondArr[i]) + " ");
                }

            }
        } 


    }
}
