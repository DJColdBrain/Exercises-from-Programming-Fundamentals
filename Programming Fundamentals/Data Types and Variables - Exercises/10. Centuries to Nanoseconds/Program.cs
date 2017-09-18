using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _10.Centuries_to_Nanoseconds
{
    class Program
    {
        static void Main(string[] args)
        {
            byte centuries = byte.Parse(Console.ReadLine());
            ushort years = (ushort)(centuries * 100);
            uint days = (uint)(years * 365.2422);
            uint hours = (uint)(days * 24);
            long minutes = hours * 60;
            decimal sec = (decimal)(minutes * 60);
            decimal milisec = sec * 1000;
            decimal microsec = milisec * 1000;
            decimal nanosec = microsec * 1000;

            Console.WriteLine($"{centuries } centuries = {years } years = {days } days = {hours } hours " +
                $"= {minutes } minutes = {sec} seconds = {milisec } milliseconds" +
                $" = {microsec } microseconds = {nanosec } nanoseconds");

        }
    }
}
