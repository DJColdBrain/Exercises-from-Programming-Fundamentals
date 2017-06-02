using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _05.Weather_Forecast
{
    class Program
    {
        static void Main(string[] args)
        {
            try
            {
                long number = long.Parse(Console.ReadLine());

                if (number > sbyte.MinValue && number < sbyte.MaxValue)
                {
                    Console.WriteLine("Sunny");
                }
                else if (number > int.MinValue && number < int.MaxValue)
                {
                    Console.WriteLine("Cloudy");

                }
                else //if (number > long.MinValue && number < long.MaxValue)
                {
                    Console.WriteLine("Windy");

                }
            }
            catch 
            {
                Console.WriteLine("Rainy");
                
            }

            }
        }
    }

