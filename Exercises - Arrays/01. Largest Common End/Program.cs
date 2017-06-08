using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _01.Largest_Common_End
{
    class Program
    {
        static void Main(string[] args)
        {
            string[] firstArr = Console.ReadLine().Split(' ');
            string[] secondArr = Console.ReadLine().Split(' ');


            MaxArr(firstArr, secondArr);

        }
    
        static void MaxArr (string[] firstArr, string[] secondArr)
        {
            int count = 0;
            int count2 = 0;
            if (firstArr.Length > secondArr.Length)
            {

                for (int i = 0; i < secondArr.Length; i++)
                {
                    if (secondArr[i] != firstArr[i])
                    {
                        break;
                    }
                    count++;

                }
                int k = firstArr.Length - secondArr.Length;
                for (int i = secondArr.Length-1; i >= 0; i--)
                {
                    if (secondArr[i] != firstArr[i+k])
                    {
                        break;
                    }
                    count2++;
                }
            }
            else
            {

                for (int i = 0; i < firstArr.Length; i++)
                {
                    if (secondArr[i] != firstArr[i])
                    {
                        break;
                    }
                    count++;

                }
                int k = secondArr.Length - firstArr.Length;
                for (int i = firstArr.Length-1; i >= 0; i--)
                {
                    if (firstArr[i] != secondArr[i + k])
                    {
                        break;
                    }
                    count2++;
                }
            }
            if (count > count2)
            {
                Console.WriteLine(count);
            }else
                Console.WriteLine(count2);

        }
    }
}
