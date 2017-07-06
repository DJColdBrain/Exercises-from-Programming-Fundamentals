using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Text.RegularExpressions;
using System.Threading.Tasks;

namespace _03.Endurance_Rally
{
    class Program
    {
        static void Main(string[] args)
        {
            List<string> players = Console.ReadLine().Split(
                new char[] { ' ' }, StringSplitOptions.RemoveEmptyEntries).ToList();

            double[] layout = Console.ReadLine().Split(
                new char[] { ' ' }, StringSplitOptions.RemoveEmptyEntries).Select(double.Parse).ToArray();
            int[] checkpoints = Console.ReadLine().Split(
                new char[] { ' ' }, StringSplitOptions.RemoveEmptyEntries).Select(int.Parse).ToArray();


            foreach (var player in players)
            {
                string name = player;
                double fuel = player[0];
                for (int i = 0; i < layout.Length; i++)
                {
                    if (checkpoints.Contains(i))
                    {
                        fuel += layout[i];
                    }
                    else
                    {
                        fuel -= layout[i];
                    }
                    if (fuel <=0 )
                    {
                        Console.WriteLine($"{name} - reached {i}");
                        break;
                    }
                }
                if (fuel > 0)
                {
                    Console.WriteLine($"{name} - fuel left {fuel:f2}");
                }
            }
            
        }
    }
}
