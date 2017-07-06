using System;
using System.Collections.Generic;
using System.Linq;
using System.Numerics;
using System.Text;
using System.Threading.Tasks;

namespace _01.Convert_from_base_10_to_base_N
{
    class Program
    {
        static void Main(string[] args)
        {
            BigInteger[] convertable = Console.ReadLine().Split(' ').Select(BigInteger.Parse).ToArray();
            BigInteger basse = convertable[0];
            BigInteger number = convertable[1];

            string newNumber = "";
            while (number != 0)
            {
                BigInteger n = number % basse;
                number = number / basse;
                
                    newNumber += n;
                
               
                
            }
            newNumber =new string( newNumber.Reverse().ToArray());
            Console.WriteLine(newNumber);
        }

    }
}
