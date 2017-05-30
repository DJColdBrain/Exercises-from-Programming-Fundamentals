using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApplication15
{
    class Program
    {
        static void Main(string[] args)
        {
            int P_dmg = int.Parse(Console.ReadLine());
            int G_dmg = int.Parse(Console.ReadLine());
            int P_healt = 100;
            int G_healt = 100;
            int round = 0;

            while (P_healt >0 || G_healt > 0)
            {
                round++;
                if (round %2 == 0)
                {
                    P_healt -= G_dmg;
                    if( P_healt <= 0)
                        break;
                    Console.WriteLine($"Gosho used Thunderous fist and reduced Pesho to {P_healt} health.");
                   
                }
                else
                {
                    G_healt -= P_dmg;
                    if (G_healt <= 0)
                        break;
                    Console.WriteLine($"Pesho used Roundhouse kick and reduced Gosho to {G_healt} health.");
                   
                }
                if (round % 3 == 0)
                {
                    P_healt += 10;
                    G_healt += 10;
                }
            }
            if (P_healt <=0)
            Console.WriteLine($"Gosho won in {round }th round.");
            else
                Console.WriteLine($"Pesho won in {round }th round.");
        }
    }
}
