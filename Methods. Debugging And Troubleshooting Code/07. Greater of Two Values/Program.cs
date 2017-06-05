using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _07.Greater_of_Two_Values
{
    class Program
    {
        static void Main(string[] args)
        {
            string type = Console.ReadLine();
            ComparingTypes(type);
        }

        static void ComparingTypes (string type)
        {
            if(type == "int")
            {
                int first = int.Parse(Console.ReadLine());
                int second = int.Parse(Console.ReadLine());
                GetMaxInt(first, second);
            }
            if (type == "char")
            {
                char first = char.Parse(Console.ReadLine());
                char second = char.Parse(Console.ReadLine());
                GetMaxChar(first, second);
            }
            if (type == "string")
            {
                string first = Console.ReadLine();
                string second = Console.ReadLine();
                GetMaxString(first, second);

            }
        }
        static void GetMaxInt(int first, int second)
        {
            if (first>second)
            {
                Console.WriteLine(first);
            }
            else Console.WriteLine(second);
        }
        static void GetMaxChar(char first, char second)
        {
            if (first > second)
            {
                Console.WriteLine(first);
            }
            else Console.WriteLine(second);
        }
        static void GetMaxString(string first, string second)
        {
            if (first.CompareTo(second) >=0)
            {
                Console.WriteLine(first);
            }
            else Console.WriteLine(second);
        }

    }
}
