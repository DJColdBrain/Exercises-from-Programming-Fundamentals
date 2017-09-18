using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Problem_1
{
    class Program
    {
        static void Main(string[] args)
        {
            decimal originalPower = decimal.Parse(Console.ReadLine());
            decimal range = decimal.Parse(Console.ReadLine());
            decimal exaust = decimal.Parse(Console.ReadLine());

            decimal power = originalPower;
            decimal count = 0;
            while (range <= power)
            {
                power -= range;
                if ((power / originalPower) * 100 == 50)
                {
                    if (exaust != 0)
                    {
                        power = Math.Floor(power / exaust);
                    }
                }
                count++;
            }
            Console.WriteLine(power);
            Console.WriteLine(count);
        }
    }
}
