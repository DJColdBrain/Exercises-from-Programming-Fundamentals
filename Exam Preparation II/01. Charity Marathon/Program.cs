using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _01.Charity_Marathon
{
    class Program
    {
        static void Main(string[] args)
        {
            long marathonDays = long.Parse(Console.ReadLine());
            long runners = long.Parse(Console.ReadLine());
            long laps = long.Parse(Console.ReadLine());
            long lapLenght = long.Parse(Console.ReadLine());
            long trackCapacity = long.Parse(Console.ReadLine());
            double moneyPerKm = double.Parse(Console.ReadLine());

            long maxPersons = marathonDays * trackCapacity;
            if (maxPersons < runners)
            {
                runners = maxPersons;
            }
            long totalMeters = (long)runners * laps * lapLenght;
            long totalKm = totalMeters / 1000;
            Console.WriteLine("Money raised: {0:f2}", totalKm*moneyPerKm);

        }
    }
}
