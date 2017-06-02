using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _03.Water_Overflow
{
    class Program
    {
        static void Main(string[] args)
        {
            byte liters = 0;
            byte n = byte.Parse(Console.ReadLine());

            for (int i = 0; i < n; i++)
            {
                ushort pouringLiters = ushort.Parse(Console.ReadLine());

                if (liters + pouringLiters > byte.MaxValue)
                {
                    
                    Console.WriteLine("Insufficient capacity!");
                }else liters += (byte)pouringLiters;

            }
            Console.WriteLine(liters);
        }
    }
}
