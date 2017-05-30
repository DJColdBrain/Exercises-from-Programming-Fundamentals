using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApplication6
{
    class Program
    {
        static void Main(string[] args)
        {
            int start = int.Parse(Console.ReadLine());
            int end = int.Parse(Console.ReadLine());


            if (start != end)
            {
                while (start < end)
                {
                    Console.WriteLine(start);
                    start++;
                }
                while (end <= start)
                {
                    Console.WriteLine(end);
                    end++;
                }
            }
        }
    }
}
