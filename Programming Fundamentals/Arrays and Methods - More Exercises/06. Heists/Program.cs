using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _06.Heists
{
    class Program
    {
        static void Main(string[] args)
        {
            int[] prices = Console.ReadLine().Split(' ').Select(int.Parse).ToArray();

            string[] expenses = { " " , ""};
            int sum = 0;
            while(expenses[0] != "Jail" || expenses[1] != "Time")
            {
                expenses = Console.ReadLine().Split(' ');
                if (expenses[0] == "Jail" && expenses[1] == "Time")
                {
                    break;
                }
                char[] goodies = expenses[0].ToCharArray();
                for (int i = 0; i < goodies.Length; i++)
                {
                    if (goodies[i] == '$')
                    {
                        sum += prices[1];
                    }
                    if (goodies[i] == '%')
                    {
                        sum += prices[0];
                    }

                }
                sum -= int.Parse(expenses[1]);

            }

            if (sum >= 0)
            {
                Console.WriteLine($"Heists will continue. Total earnings: {sum}.");
            }else
                Console.WriteLine($"Have to find another job. Lost: {Math.Abs(sum)}.");


        }
    }
}
