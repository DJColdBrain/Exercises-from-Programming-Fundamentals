using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _11.Convert_Speed_Units
{
    class Program
    {
        static void Main(string[] args)
        {


            //need to make it work

            float distance = float.Parse(Console.ReadLine());
            float hours = float.Parse(Console.ReadLine());
            float min = float.Parse(Console.ReadLine());
            float sec = float.Parse(Console.ReadLine());


            float timeInSec = (hours * 3600.0f) +( min * 60.0f )+ sec;
            float timeInHours = timeInSec /3600;
            float meterPerSec = distance  / timeInSec;
            Console.WriteLine(meterPerSec );



            float kmPerHour = (distance / 1000f) / (float)timeInHours;
            Console.WriteLine(kmPerHour );


            float miles = distance / 1609f;
            float milesPerHour = miles / (float)timeInHours;
            Console.WriteLine(milesPerHour );


        }
    }
}
