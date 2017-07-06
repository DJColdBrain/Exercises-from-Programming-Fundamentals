using System;
using System.Collections.Generic;
using System.Globalization;
using System.Linq;
using System.Numerics;
using System.Text;
using System.Threading.Tasks;

namespace _01.Sino_The_Walker
{
    class Program
    {
        static void Main(string[] args)
        {
            DateTime time = DateTime.ParseExact(Console.ReadLine(), "H:m:s", CultureInfo.InvariantCulture);
            int steps = int.Parse(Console.ReadLine());
            int secForStep = int.Parse(Console.ReadLine());
            long sec = (long)steps * secForStep;

            sec = sec % (24 * 60 * 60);

            time = time.AddSeconds(sec);

            string format = "HH:mm:ss"; 
            Console.WriteLine("Time Arrival: " + time.ToString(format));

        }
    }
}
