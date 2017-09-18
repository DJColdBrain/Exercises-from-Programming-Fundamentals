using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _06.Sum_big_numbers
{
    class Program
    {
        static void Main(string[] args)
        {
            string num1 = Console.ReadLine().TrimStart(new char[] { '0' });
            string num2 = Console.ReadLine().TrimStart(new char[] { '0' });

            Console.WriteLine(Sum (num1, num2));
        }

        static string Sum(string num1 , string num2)
        {
            string sum = "";
            string[] BiggerSmallerNum = GreaterString(num1, num2);

            int remeining = 0;
            int k = 0;
            int numberLenghtDiff = BiggerSmallerNum[0].Length - BiggerSmallerNum[1].Length;
            for (int i = BiggerSmallerNum[1].Length - 1; i >= 0 ; i--)
            {
                int z = int.Parse(BiggerSmallerNum[0][i + numberLenghtDiff].ToString());
                int x = int.Parse(BiggerSmallerNum[1][i].ToString());
                int num = (z+ x);
                k = (num + remeining);
                sum += k % 10;
                remeining = k / 10;
               
            }
            for (int i = numberLenghtDiff-1; i >= 0; i--)
            {
                int num = int.Parse(BiggerSmallerNum[0][i].ToString());
                k = (num + remeining);
                sum += k % 10;
                remeining = k / 10;
                
            }
            if (remeining != 0)
            {
                sum += remeining;
            }
            sum = new string(sum.Reverse().ToArray());
            return sum;
        }
        private static string[] GreaterString(string str1, string str2)
        {
            if (String.Compare(str1, str2) < 0)
            {
                return new string[] { str2, str1 };
            }
            else
            {
                return new string[] { str1, str2 };
            }
        }
    }
}
