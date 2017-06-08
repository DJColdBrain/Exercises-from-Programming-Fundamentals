using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _05.Compare_Char_Arrays
{
    class Program
    {
        static void Main(string[] args)
        {
            char[] firstArr = Console.ReadLine().Split(' ').Select(char.Parse).ToArray();
            char[] secondArr = Console.ReadLine().Split(' ').Select(char.Parse).ToArray();

            if (firstArr.Length > secondArr.Length)
            {
                bool k = false;
                for (int i = 0; i < secondArr.Length; i++)
                {

                    if ((int)(firstArr[i]) > (int)(secondArr[i]) || k)
                    {
                        k = true;
                        char holder = firstArr[i];
                        firstArr[i] = secondArr[i];
                        secondArr[i] = holder;
                    }
                    

                }
                Console.WriteLine(string.Join("" , secondArr));
                Console.WriteLine(string.Join("", firstArr));

            }
            else
            {
                bool k = false;
                for (int i = 0; i < firstArr.Length; i++)
                {

                    if ((int)(firstArr[i]) > (int)(secondArr[i]) || k)
                    {
                        k = true;
                        char holder = firstArr[i];
                        firstArr[i] = secondArr[i];
                        secondArr[i] = holder;
                    }


                }
                Console.WriteLine(string.Join("", firstArr));
                Console.WriteLine(string.Join("", secondArr));
            }
        }
    }
}
