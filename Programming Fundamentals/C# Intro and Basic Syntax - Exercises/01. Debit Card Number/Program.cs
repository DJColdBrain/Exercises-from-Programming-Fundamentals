using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApplication16
{
    class Program
    {
        static void Main(string[] args)
        {
            int a = int.Parse(Console.ReadLine());
            int b = int.Parse(Console.ReadLine());
            int c = int.Parse(Console.ReadLine());
            int d = int.Parse(Console.ReadLine());

            Console.Write(a.ToString("0000") + " ");
            Console.Write(b.ToString("0000") + " ");
            Console.Write(c.ToString("0000") + " ");
            Console.Write(d.ToString("0000") + " ");

        }
    }
}
