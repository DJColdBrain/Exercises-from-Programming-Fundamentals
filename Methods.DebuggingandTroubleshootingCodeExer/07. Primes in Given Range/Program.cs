using System;
using System.Collections.Generic;

namespace _06.Prime_Checker
{
    class Program
    {
        static void Main(string[] args)
        {
            long start = long.Parse(Console.ReadLine());
            long stop = long.Parse(Console.ReadLine());
            string stringWithListToPrint = "";
            List<long> listToPrint = IsPrime(Math.Abs(start), Math.Abs(stop));
            foreach(long i in listToPrint)
            {
                stringWithListToPrint = stringWithListToPrint+ i.ToString() + ", ";
            }
            stringWithListToPrint = stringWithListToPrint.Remove(stringWithListToPrint.Length -2,2);
            Console.WriteLine(stringWithListToPrint);
        }

        static List<long> IsPrime(long start, long stop)
        {
            List<long> listOfPrimes = new List<long>();
            if (start < 2) start = 2;
            if (start == 2) listOfPrimes.Add(2);
            while (start <= stop)
            {
                bool isPrime = true;
                for (long i = 2; i <= Math.Ceiling(Math.Sqrt(start)); i++)
                {
                    if (start % i == 0)
                    {
                        isPrime = false;
                        break;
                    }

                }
                if (isPrime)
                {
                    listOfPrimes.Add(start);
                }
                start++;


            }
            return listOfPrimes;
        }
    }
}
