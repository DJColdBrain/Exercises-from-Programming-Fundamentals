using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _07.Multiply_big_number
{
    class Program
    {
        static void Main(string[] args)
        {
            string num1 = Console.ReadLine().TrimStart(new char[] { '0' });
            string num2 = Console.ReadLine().TrimStart(new char[] { '0' });
            
            Console.WriteLine(Multiply(num1, num2));
        }

        static string Multiply (string num1 ,string num2)
        {
            string result = "0";
            string[] BiggerSmallerNum = GreaterString(num1, num2);
            
            for (int i = BiggerSmallerNum[0].Length-1; i >=0 ; i--)
            {
                string temporary = "";
                int remeining = 0;
                for (int j = BiggerSmallerNum[1].Length-1; j >= 0 ; j--)
                {
                    int z = int.Parse(BiggerSmallerNum[0][i].ToString());
                    int x = int.Parse(BiggerSmallerNum[1][j].ToString());

                    int k = z * x;
                    int num = k + remeining;
                    temporary += num % 10;
                    remeining = num / 10;
                }
                if (remeining!= 0)
                {
                    temporary += remeining;
                }
                temporary = new string(temporary.Reverse().ToArray() ) + new string('0', BiggerSmallerNum[0].Length - 1 -i);
                result = Sum(temporary, result);
            }



            return result;
        } 




        static string Sum(string num1, string num2)
        {
            string sum = "";
            string[] BiggerSmallerNum = GreaterString(num1, num2);

            int remeining = 0;
            int k = 0;
            int numberLenghtDiff = BiggerSmallerNum[0].Length - BiggerSmallerNum[1].Length;
            for (int i = BiggerSmallerNum[1].Length - 1; i >= 0; i--)
            {
                int z = int.Parse(BiggerSmallerNum[0][i + numberLenghtDiff].ToString());
                int x = int.Parse(BiggerSmallerNum[1][i].ToString());

                int num = (z + x);
                k = (num + remeining);
                sum += k % 10;
                remeining = k / 10;

            }
            for (int i = numberLenghtDiff - 1; i >= 0; i--)
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
            if (str1.Length > str2.Length)
            {

                return new string[] { str1, str2 };
            }
            else
            {
                return new string[] { str2, str1 };
            }
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
