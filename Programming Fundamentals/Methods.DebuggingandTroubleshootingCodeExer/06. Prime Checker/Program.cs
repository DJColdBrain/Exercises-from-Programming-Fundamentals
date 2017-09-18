using System;


namespace _06.Prime_Checker
{
    class Program
    {
        static void Main(string[] args)
        {
            long n = long.Parse(Console.ReadLine());
            Console.WriteLine(IsPrime(Math.Abs(n)));
        }

        static Boolean IsPrime(long n)
        {
            if (n == 0) return false;
            if (n == 1) return false;
            if (n == 2) return true;
            for (long i = 2; i <= Math.Ceiling(Math.Sqrt(n)); i++)
            {
                if (n % i == 0)
                {
                    return false;
                    break;
                }
               
            }
            return true;
        }
    }
}
