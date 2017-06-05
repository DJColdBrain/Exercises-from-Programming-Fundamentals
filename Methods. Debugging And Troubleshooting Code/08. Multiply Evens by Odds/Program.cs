using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _08.Multiply_Evens_by_Odds
{
    class Program
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());
            Console.WriteLine(GetMultiplyOddsAndEvens(n));
        }

        static int GetMultiplyOddsAndEvens(int n)
        {
            n = Math.Abs(n);
            int sumEven = SumOffEvenDigits(n) ;
            int sumOdd =SumOffOddDigits(n); 

            return sumEven * sumOdd;

        }
        static int SumOffEvenDigits (int n)
        {
            int sum = 0;
            while (n > 0)
            {
                int lastDigit = n % 10;
                if(lastDigit %2 == 0)
                {
                    sum += lastDigit;
                }
                n /= 10;
            }
            return sum;

        }
        static int SumOffOddDigits(int n)
        {
            int sum = 0;
            while (n > 0)
            {
                int lastDigit = n % 10;
                if (lastDigit % 2 != 0)
                {
                    sum += lastDigit;
                }
                n /= 10;
            }
            return sum;

        }


    }
}
