using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _03.English_Name_of_Last_Digit
{
    class Program
    {
        static void Main(string[] args)
        {
           long num = long.Parse(Console.ReadLine());
            Console.WriteLine(ReturnLastDigitInString(Math.Abs(num)));
        }

        static string ReturnLastDigitInString(long a)
        {
            string result = "";
            a = a % 10;
             switch (a) {
                case 1:
                    result = "one";
                    break;
                case 2:
                    result = "two";
                    break;
                case 3:
                    result = "three";
                    break;
                case 4:
                    result = "four";
                    break;
                case 5:
                    result = "five";
                    break;
                case 6:
                    result = "six";
                    break;
                case 7:
                    result = "seven";
                    break;
                case 8:
                    result = "eight";
                    break;
                case 9:
                    result = "nine";
                    break;
                case 0:
                    result = "zero";
                    break;


            }
            return result ;
        }
    }
}
