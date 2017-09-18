using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _06.Strings_And_Objects
{
    class Program
    {
        static void Main(string[] args)
        {
            String firstPart = Console.ReadLine();
            String secondPart = Console.ReadLine();
            Object combinationOfTwoParts = firstPart + " " + secondPart;
            String finalString = (string )combinationOfTwoParts;
            Console.WriteLine(finalString );

        }
    }
}
