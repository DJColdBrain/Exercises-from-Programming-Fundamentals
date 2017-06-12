using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _04.Split_by_Word_Casing
{
    class Program
    {
        static void Main(string[] args)
        {
            List<string> words = Console.ReadLine().Split(' ', '!', '(', ')', ',' , '.' ,'\'', '\"' , ':' , ';' ,'[' , ']', '\\','/').ToList();

            List<string> upperCase = new List<string>();
            List<string> lowerCase = new List<string>();
            List<string> mixedCase = new List<string>();

            foreach (var word in words)
            {
                if (word != "")
                {

                
                if (word.All(char.IsUpper))
                {
                    upperCase.Add(word);
                }
                
                else if (word.All(char.IsLower))
                {
                    lowerCase.Add(word);
                }
                    else
                {
                    mixedCase.Add(word);
                }
                }
            }

            Console.WriteLine("Lower-case: " + string.Join(", ", lowerCase));
            Console.WriteLine("Mixed-case: " + string.Join(", ", mixedCase));
            Console.WriteLine("Upper-case: " + string.Join(", ", upperCase));

        }
    }
}
