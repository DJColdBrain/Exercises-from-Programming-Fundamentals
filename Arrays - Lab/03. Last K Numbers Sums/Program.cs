using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _03.Last_K_Numbers_Sums
{
    class Program
    {
        static void Main(string[] args)
        {
            long n = long.Parse(Console.ReadLine());
            long k = long.Parse(Console.ReadLine());

            long[] arrayFromInt = new long[n];
            arrayFromInt[0] = 1;
            for (long i = 1; i < n; i++)
            {
                if (i <= k)
                {
                    for (int j = 0; j < i; j++)
                    {
                        arrayFromInt[i] += arrayFromInt[j];
                    }
                }else
                {
                    for (long j = i-k; j < i; j++)
                    {
                        arrayFromInt[i] += arrayFromInt[j];
                    }
                }
                
            }
            for (int i = 0; i < n; i++)
            {
                Console.WriteLine(arrayFromInt[i]+ " ");
            }

        }
    }
}
