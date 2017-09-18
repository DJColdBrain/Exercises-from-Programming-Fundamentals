using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
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


        static void GetFactoriel (BigInteger n)
        {
            BigInteger sum =1;
            for (BigInteger i = n; i > 0; i--)
            {
                sum *= i;
            }

            Console.WriteLine(sum);
        }
    }
}
