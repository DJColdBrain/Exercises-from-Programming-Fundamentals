using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _12.Beer_Kegs
{
    class Program
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());

            String biggestBeer = "";
            double biggestBeerVolume = 0;

            for (int i = 0; i < n; i++)
            {
                String beerModel = Console.ReadLine();
                double radius = double.Parse(Console.ReadLine());
                int heightOfBeer = int.Parse(Console.ReadLine());

                double beerVolume = Math.PI * radius * radius * heightOfBeer;

                if (beerVolume > biggestBeerVolume)
                {
                    biggestBeerVolume = beerVolume;
                    biggestBeer = beerModel;
                }


            }
            Console.WriteLine(biggestBeer);

        }
    }
}
