using System;
using System.Collections.Generic;
using System.Globalization;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _01.Count_Working_Days
{
    class Program
    {
        static void Main(string[] args)
        {
            string date = Console.ReadLine();
            DateTime firstDate = DateTime.ParseExact(date, "dd-MM-yyyy", CultureInfo.InvariantCulture);
            date = Console.ReadLine();
            DateTime secondDate = DateTime.ParseExact(date, "dd-MM-yyyy", CultureInfo.InvariantCulture);

            int numOfDays = WorkingDays(firstDate, secondDate);
            Console.WriteLine(numOfDays);

           
        }


        static int WorkingDays(DateTime firstDate, DateTime secondDate)
        {
            int numOfDays = 0;
            DateTime[] hollidays =
            {
                new DateTime(1998,1,1),
                new DateTime(1992,3,3),
                new DateTime(1998,5,1),
                new DateTime(1992,5,6),
                new DateTime(1998,5,24),
                new DateTime(1992,9,6),
                new DateTime(1998,9,22),
                new DateTime(1992,11,1),
                new DateTime(1992,12,24),
                new DateTime(1998,12,25),
                new DateTime(1992,12,26),
            };

            for (var i = firstDate; i <= secondDate; i = i.AddDays(1))
            {
                if (i.DayOfWeek != DayOfWeek.Saturday && i.DayOfWeek != DayOfWeek.Sunday)
                {
                    bool t = false;
                    for (int j = 0; j < hollidays.Length; j++)
                    {
                       
                        if (hollidays[j].Month == i.Month && hollidays[j].Day == i.Day)
                        {
                            t = true;
                         
                        }
                        
                    }
                    if (!t)
                    {
                        numOfDays++;
                    }
                }
            }




            return numOfDays;
        }
    }
}
