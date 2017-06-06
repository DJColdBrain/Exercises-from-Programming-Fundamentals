using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Methods.DebuggingandTroubleshootingCodeExer
{
    class Program
    {
        static void Main(string[] args)
        {
            String s = Console.ReadLine();
            PrintName(s);
        }
        static void PrintName(string name)
        {
            Console.WriteLine("Hello, " + name+"!");
        }
    }
}
