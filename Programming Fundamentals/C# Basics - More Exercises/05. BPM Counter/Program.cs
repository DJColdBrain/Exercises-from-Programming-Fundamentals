using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApplication5
{
    class Program
    {
        static void Main(string[] args)
        {
            int BPM = int.Parse(Console.ReadLine());
            double beats = int.Parse(Console.ReadLine());
            double time = beats / BPM;
            double sec;
            sec = Math.Round(60 * time, 2);
            int min = 0;
            while (sec >= 60)
            {
                sec -= 60;
                min += 1;
            }

            sec = Math.Truncate(sec);
            Console.WriteLine($"{Math.Round(beats / 4.0, 1)} bars - {min}m {sec}s");
        }
    }
}
