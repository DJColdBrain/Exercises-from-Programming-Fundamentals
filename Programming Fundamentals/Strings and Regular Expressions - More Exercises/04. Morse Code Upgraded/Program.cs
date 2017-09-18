using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _04.Morse_Code_Upgraded
{
    class Program
    {
        static void Main(string[] args)
        {
            var messageLetters = Console.ReadLine()
           .Split('|')
           .ToList();

            var decipheredMessage = new StringBuilder();

            foreach (var messageLetter in messageLetters)
            {
                var zeroesCount = messageLetter
                    .Count(x => x == '0');

                var onesCount = messageLetter
                    .Count(x => x == '1');

                var currentSum = zeroesCount * 3 + onesCount * 5;



                var equalDigitsCount = 1;
                for (int i = 0; i < messageLetter.Length - 1; i++)
                {
                    int currentDigit = messageLetter[i];
                    int nextDigit = messageLetter[i + 1];
                    
                    if (currentDigit == nextDigit)
                    {
                        equalDigitsCount++;
                    }

                    else
                    {
                        if (equalDigitsCount == 1)
                        {
                            continue;
                        }

                        currentSum += equalDigitsCount;
                        equalDigitsCount = 1;
                    }

                    if (equalDigitsCount != 1 && i==messageLetter.Length-2)
                    {
                        currentSum += equalDigitsCount;
                    }

                }

                decipheredMessage.Append((char)currentSum);
            }

            Console.WriteLine(decipheredMessage.ToString());
        }
    }
}
