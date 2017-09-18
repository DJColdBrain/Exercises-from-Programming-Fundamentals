using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApplication5
{
    class Program
    {
        static void Main(string[] args)
        {
            string s = Console.ReadLine();

            if (s.EndsWith("y"))
            {
                s = s.Remove(s.Length - 1, 1);
                s = s.Insert(s.Length, "ies");
                Console.WriteLine(s);
            }
            else if (s.EndsWith("o") || s.EndsWith("s") || s.EndsWith("x") || s.EndsWith("z"))
            {
              
                s = s.Insert(s.Length, "es");
                Console.WriteLine(s);
            }
            else if (s.EndsWith("sh") || s.EndsWith("ch")){
                
                s = s.Insert(s.Length, "es");
                Console.WriteLine(s);
            }

            else
            {

                s = s.Insert(s.Length, "s");
                Console.WriteLine(s);
            }
        }
    }
}
