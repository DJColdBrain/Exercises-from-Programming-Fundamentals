using System;
using System.Numerics;

namespace _13.Factorial
{
    class Program
    {
        static void Main(string[] args)
        {
            BigInteger n = BigInteger.Parse(Console.ReadLine());
            GetFactoriel(n);

        }


        static void GetFactoriel(BigInteger n)
        {
            BigInteger sum = 1;
            for (BigInteger i = n; i > 0; i--)
            {
                sum *= i;
            }


            int trailingZeros = 0;
            while (sum % 10 == 0)
            {
                trailingZeros++;
                sum /= 10;
            }
            Console.WriteLine(trailingZeros);

        }
    }
}
