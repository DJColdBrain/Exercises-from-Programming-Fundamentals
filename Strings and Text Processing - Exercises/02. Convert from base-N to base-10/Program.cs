using System;
using System.Collections.Generic;
using System.Linq;
using System.Numerics;
using System.Text;
using System.Threading.Tasks;

namespace _02.Convert_from_base_N_to_base_10
{
    class Program
    {
        static void Main(string[] args)
        {
            string[] convertable = Console.ReadLine().Split(' ').ToArray();
            BigInteger basse = BigInteger.Parse(convertable[0]);
            string number = convertable[1];

            BigInteger[] baseTen = new BigInteger[number.Length];
            for (int i = 0; i < number.Length; i++)
            {
                BigInteger n = BigInteger.Parse(number[number.Length - 1 - i].ToString()) * BigInteger.Pow(basse, i);
                baseTen[i] = n; 
            }
            BigInteger sum = 0;
            foreach (var item in baseTen)
            {
                sum += item;
            }
            Console.WriteLine(sum);
        }
    }
}
