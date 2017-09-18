using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _01._Centuries_to_Minutes
{
    class Program
    {
        static void Main(string[] args)
        {
            byte centuries = byte.Parse(Console.ReadLine());
            ushort  years = (ushort)(centuries * 100);
            int days = (int)(years * 365.2422);
            ulong hours =(ulong) days * 24;
            ulong min = hours * 60;
            Console.WriteLine($"{centuries } centuries = {years } years = {days} days = {hours } hours = {min} minutes");

        }
    }
}
