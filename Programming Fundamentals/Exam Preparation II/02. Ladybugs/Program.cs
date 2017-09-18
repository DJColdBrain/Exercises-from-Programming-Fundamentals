using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _02.Ladybugs
{
    class Program
    {
        static void Main(string[] args)
        {
            int[] field = new int[int.Parse(Console.ReadLine())];
            int[] ladybugs = Console.ReadLine().Split(' ').Select(int.Parse).Where(l => l >= 0 && l < field.Length).Distinct().ToArray();

            for (int i = 0; i < ladybugs.Length; i++)
            {
                field[ladybugs[i]] = 1;                
            }

            string[] comands = Console.ReadLine().Split(' ').ToArray();
            while (comands[0] != "end")
            {
                int index = int.Parse(comands[0]);
                if (index < 0 || index >= field.Length || field[index] != 1)
                {
                    comands = Console.ReadLine().Split(' ').ToArray();
                    continue;
                }


                int step = int.Parse(comands[2]);
                int initialIndex = index;
                field[initialIndex] = 0;
                if (comands[1] == "right")
                {
                    index += step;
                }
                else if(comands[1] == "left")
                {
                    index -= step;
                }
                while (true)
                {
                    if (index < 0 || index >= field.Length )
                    {
                        break;
                    }
                    if (field[index] != 1)
                    {
                        field[index] = 1;
                        break;
                    }
                    if (comands[1] == "right")
                    {
                        index += step;
                    }
                    else if (comands[1] == "left")
                    {
                        index -= step;
                    }
                }


                comands = Console.ReadLine().Split(' ').ToArray();
            }
            Console.WriteLine(string.Join(" ", field));
        }
    }
}
