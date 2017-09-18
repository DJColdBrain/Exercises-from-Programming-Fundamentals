using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _01.Sort_Times
{
    class Program
    {
        static void Main(string[] args)
        {
            List<string> time = Console.ReadLine().Split(' ').ToList();
            time = time.OrderBy(x => x).ToList();
            Console.WriteLine(string.Join(", ", time));
        }
    }
}
