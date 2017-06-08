using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _06.Max_Sequence_of_Equal_Elements
{
    class Program
    {
        static void Main(string[] args)
        {
            checked
            {
                int[] array = Console.ReadLine().Split(' ').Select(int.Parse).ToArray();
                int[] parametrs = new int[2];

                int count = 1;

                for (int i = 1; i < array.Length; i++)
                {
                    if (array[i - 1] >= array[i])
                    {
                        count = 1;
                        continue;
                    }
                    count++;
                    if (count > parametrs[1])
                    {
                        parametrs[0] = i +1-count;
                        parametrs[1] = count;
                    }


                }
                int[] result = new int[parametrs[1]];
                for (int i = 0; i < parametrs[1]; i++)
                {
                    result[i] = array[parametrs[0]+i ];
                }
                Console.WriteLine(string.Join(" ", result));


            }
        }
    }
}
