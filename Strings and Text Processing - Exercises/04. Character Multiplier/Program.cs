using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _04.Character_Multiplier
{
    class Program
    {
        
        static void Main(string[] args)
        {
            string[] words = Console.ReadLine().Split(' ');

            Console.WriteLine(SumOfTwoStrings(words[0], words[1]));
        }

        private static string SumOfTwoStrings(string str1, string str2)
        {
            int n = 0;
            int k = 0;
            if (str1.Length < str2.Length)
            {
                n = str1.Length;
                k = str2.Length;
            }
            else
            {
                k = str1.Length;
                n = str2.Length;
            }
            string toReturn = "";
            int sum = 0;
            for (int i = 0; i < n; i++)
            {
                int multipliedChars = str1[i] * str2[i];
                sum += multipliedChars;
            }
            for (int i = n; i < k; i++)
            {
                if (str1.Length < str2.Length)
                {
                    sum += str2[i];
                }
                else
                {
                    sum += str1[i];
                }
            }
            toReturn = sum.ToString();
            return toReturn;
        }
    }
}
