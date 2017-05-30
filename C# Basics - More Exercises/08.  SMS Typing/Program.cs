using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApplication8
{
    class Program
    {
        static void Main(string[] args)
        {

            int n = int.Parse(Console.ReadLine());
            String s = "";
            int numberOfDigits = 1;
            int mainChar = 0;
            int offset = 0;
            int letterIndex = 0;
            for (int i = 0; i < n; i++)
            {
                int character = int.Parse(Console.ReadLine());
                if (character != 0)
                {
                    mainChar = character;
                    while (character > 9)
                    {
                        numberOfDigits += 1;
                        character /= 10;
                        mainChar = character;
                    }
                    offset = (mainChar - 2) * 3;
                    if (mainChar > 7)
                        offset += 1;
                    letterIndex = offset + numberOfDigits - 1;
                    s += (char)(letterIndex + 97);
                    numberOfDigits = 1;
                    mainChar = 0;
                    offset = 0;
                    letterIndex = 0;
                }
                else
                {
                    s += " ";
                }

            }
            Console.WriteLine(s);

        }
    }
}
