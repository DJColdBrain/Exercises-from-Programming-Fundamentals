using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _07.Play_Catch
{
    class Program
    {
        static void Main(string[] args)
        {
            int[] numbers = Console.ReadLine().Split(' ').Select(int.Parse).ToArray();
            int count = 0;
            while (true)
            {
                try
                {
                    string[] comands = Console.ReadLine().Split(' ');

                    switch (comands[0])
                    {
                        case "Replace":
                            int index = int.Parse(comands[1]);
                            int number = int.Parse(comands[2]);
                            numbers[index] = number; 
                            break;
                        case "Print":
                            int startIndex = int.Parse(comands[1]);
                            int endIndex = int.Parse(comands[2]);
                            string s = "";
                            for (int i = startIndex; i <= endIndex; i++)
                            {
                                s += numbers[i] + ", ";
                            }
                            s=s.Remove(s.Length - 2, 2);
                            Console.WriteLine(s);
                            break;
                        case "Show":
                            index = int.Parse(comands[1]);
                            Console.WriteLine(numbers[index]);
                            break;
                    }





                }
                catch (IndexOutOfRangeException)
                {
                    count++;
                    Console.WriteLine("The index does not exist!");
                    if (count == 3)
                    {
                        break;
                    }
                } catch (FormatException) {
                    count++;
                    Console.WriteLine("The variable is not in the correct format!");
                    if (count == 3)
                    {
                        break;
                    }
                }


            }
            Console.WriteLine(string.Join(", ", numbers));
        }
    }
}
