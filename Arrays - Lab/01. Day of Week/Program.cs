using System;

namespace Arrays___Lab
{
    class Program
    {
        static void Main(string[] args)
        {
            string[] days = { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" };
            int selectedDay = int.Parse(Console.ReadLine()) - 1;

            if (selectedDay < 7 && selectedDay >= 0 )
            {
                Console.WriteLine(days[selectedDay]);
            }
            else
            {
                Console.WriteLine("Invalid Day!");
            }

        }
    }
}
