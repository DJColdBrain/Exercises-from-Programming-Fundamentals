using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApplication9
{
    class Program
    {
        static void Main(string[] args)
        {
            int value;
            string  thing = Console.ReadLine();
            int br = 0;

            if (int.TryParse(thing, out value))
            {

                do
                {
                    br++;

                    thing = Console.ReadLine();

                }
                while (int.TryParse(thing, out value));
            }
            Console.WriteLine(br);
        }
    }
}
