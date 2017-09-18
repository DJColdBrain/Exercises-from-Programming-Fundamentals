using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _13.Vowel_or_Digit
{
    class Program
    {
        static void Main(string[] args)
        {

            char s = char.Parse(Console.ReadLine());

            if (s == 65 || s == 69 || s == 73 || s == 79 || s == 85 || s == 89 || s == 97 || s == 101 ||
                s == 105 || s == 111 || s == 117 || s == 121)
            {
                Console.WriteLine("vowel");

            }
            else if (s >= 48 && s <= 57) { Console.WriteLine("digit"); }
            else Console.WriteLine("other");


        }
    }
}
