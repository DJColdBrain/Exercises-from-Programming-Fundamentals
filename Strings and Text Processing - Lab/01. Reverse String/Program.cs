using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _01.Reverse_String
{
    class Program
    {
        static void Main(string[] args)
        {
            string originalString = Console.ReadLine();
            string reversedString = new string(originalString.Reverse().ToArray());
            Console.WriteLine(reversedString);
        }
    }
}
