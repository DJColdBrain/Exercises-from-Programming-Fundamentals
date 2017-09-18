using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _03.Karate_Strings
{
    class Program
    {
        static void Main(string[] args)
        {
            var input = new StringBuilder(Console.ReadLine());

            var punch = '>';
            var punchStrength = 0;

            for (int i = 0; i < input.Length; i++)
            {
                if (input[i] == punch)
                {
                    punchStrength += int.Parse(input[i + 1].ToString());

                    i++;

                    while (i < input.Length && punchStrength > 0)
                    {
                        if (input[i] == punch)
                        {
                            break;
                        }

                        input.Remove(i, 1);
                        punchStrength--;
                    }

                    i--;
                }
            }

            Console.WriteLine(input);
        }
    }
}
