using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApplication14
{
    class Program
    {
        static void Main(string[] args)
        {
            char a = char.Parse(Console.ReadLine());
            char b = char.Parse(Console.ReadLine());
            char c = char.Parse(Console.ReadLine());


            for (char i = a; i <=b; i++)
            {
                for (char j = a; j <= b; j++)
                {
                    for (char g = a; g <= b; g++)
                    {
                        if (i != c && j != c && g != c)
                        {
                            Console.Write(i.ToString ()+j.ToString() + g.ToString() + " ");
                        }
                    }
                }
            }
        }
    }
}
