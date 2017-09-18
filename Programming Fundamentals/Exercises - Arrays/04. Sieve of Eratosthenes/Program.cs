using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _04.Sieve_of_Eratosthenes
{
    class Program
    {
        static void Main(string[] args)
        {
            int p = int.Parse(Console.ReadLine());

            bool[] isPrime = new bool[p+1];

            for (int i = 0; i < isPrime.Length; i++)
            {
                isPrime[i] = true;
            }
            isPrime[0] = false;
            isPrime[1] = false;
            for (int i = 0; i <= p; i++)
            {
                int k = 2;
                if (!isPrime[i])
                {
                    continue;
                }
                while (k*i <= p) {
                    isPrime[k * i] = false;
                    k++;
                }

            }
            List <int> primes = new List<int>();

            for (int i = 0; i < isPrime.Length; i++)
            {
                if (isPrime[i])
                {
                    primes.Add(i);
                }
            }
            Console.WriteLine(string.Join(" ", primes));

        }
    }
}
