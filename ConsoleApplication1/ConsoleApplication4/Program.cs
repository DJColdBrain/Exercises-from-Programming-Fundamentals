using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApplication4
{
    class Program
    {
        static void Main(string[] args)
        {
            string s = Console.ReadLine();
            int q = int.Parse(Console.ReadLine());
            double studio=0;
            double doubleroom=0;
            double suite=0;

            if (s == "May" || s == "October")
            {
                studio = 50 * q;
                if (q > 7)
                {
                    studio = 50 * q * 0.95;
                    if (s == "October")
                        studio = studio - 50 * 0.95;
                }
                doubleroom = 65 * q;
                suite = 75 * q;
            }
            else if (s == "June" || s == "September")
            {
                studio = 60 * q;
                if (q > 7)
                    studio -= 60;
                if (q > 14)
                    doubleroom = 72 * q * 0.9;
                else
                    doubleroom = 72 * q;
                suite = 82 * q;


            }
            else if (s == "July" || s == "August" || s == "December")
            {

                studio = 68 * q;

                doubleroom = 77 * q;
                if (q > 14)
                    suite = 89 * q * 0.85;
                else
                    suite = 89 * q;
            }
            Console.WriteLine("Studio: {0:f2} lv.", studio );
            Console.WriteLine("Double: {0:f2} lv.", doubleroom );
            Console.WriteLine("Suite: {0:f2} lv.", suite );
        }
    }
}
