using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _06.Catch_the_Thief
{
    class Program
    {
        static void Main(string[] args)
        {
            String type = Console.ReadLine();
            int n = int.Parse(Console.ReadLine());

            long thiefID = long.MinValue;

            for (int i = 0; i < n; i++)
            {
                long ID = long.Parse(Console.ReadLine());

                switch (type)
                {
                    case "sbyte":
                        if (ID > thiefID && ID <= sbyte.MaxValue && ID >= sbyte.MinValue)
                            thiefID = ID;

                        break;
                    case "int":
                        if (ID > thiefID && ID <= int.MaxValue && ID >= int.MinValue)
                            thiefID = ID;
                        break;
                    case "long":
                        if (ID > thiefID && ID <= long.MaxValue && ID >= long.MinValue)
                            thiefID = ID;
                        break;

                }

            }

            long years = 1;

            if (thiefID< 0)
            {
                years = (long)Math.Ceiling((thiefID / (double)sbyte.MinValue));
            }
            else {
                years = (long)Math.Ceiling((thiefID / (decimal)sbyte.MaxValue));
            }

            if (years == 1)
            {
                Console.WriteLine($"Prisoner with id {thiefID} is sentenced to {years} year");
            }
            else

            Console.WriteLine($"Prisoner with id {thiefID} is sentenced to {years} years");


        }
    }
}
