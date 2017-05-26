using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApplication7
{
    class Program
    {
        static void Main(string[] args)
        {
            string s = "";
            int ing = 0;
            s = Console.ReadLine();
            do
            {

            
                Console.WriteLine("Adding ingredient {0}.", s);
                ing++;
                s = Console.ReadLine();
            } while (s != "Bake!");
                Console.WriteLine("Preparing cake with {0} ingredients." , ing);
        }
    }
}
