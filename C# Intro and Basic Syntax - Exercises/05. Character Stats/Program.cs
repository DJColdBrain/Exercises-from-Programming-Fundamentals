using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApplication20
{
    class Program
    {
        static void Main(string[] args)
        {
            String ime = Console.ReadLine();
            int C_healt = int.Parse(Console.ReadLine());
            int Max_healt = int.Parse(Console.ReadLine());
            int C_energy = int.Parse(Console.ReadLine());
            int Max_energy = int.Parse(Console.ReadLine());


            Console.WriteLine("Name: " + ime);
            Console.WriteLine("Health: |" + new string('|', C_healt) + new string('.', Max_healt - C_healt) + "|");
            Console.WriteLine("Energy: |" + new string('|', C_energy) + new string('.', Max_energy - C_energy) + "|");


        }
    }
}
