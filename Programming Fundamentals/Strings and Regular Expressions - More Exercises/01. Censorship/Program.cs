using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _01.Censorship
{
    class Program
    {
        static void Main(string[] args)
        {
            var censoredWord = Console.ReadLine();

            var sentence = Console.ReadLine();

            var censoredSentence = sentence
                .Replace(censoredWord, new string('*', censoredWord.Length));

            Console.WriteLine(censoredSentence);
        }
    }
}
