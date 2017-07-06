using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _03.Unicode_Characters
{
    class Program
    {
        static void Main(string[] args)
        {
            string text = Console.ReadLine();

            for (int i = 0; i < text.Length; i++)
            {
                Console.Write("\\u" + ((int)text[i]).ToString("X4").ToLower());
            }
            Console.WriteLine();
        }
    }
}
