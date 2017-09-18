using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApplication8
{
    class Program
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());
            int cal = 0;

            for (int i = 0; i < n; i++) {
                string s = Console.ReadLine().ToLower () ;
                

                if (s == "cheese") {
                    cal += 500;
                }
                else if (s  == "tomato sauce")
                {
                    cal += 150;
                }
                else if (s == "salami")
                {
                    cal +=600;
                }
                else if (s == "pepper")
                {
                    cal += 50;
                }


            }
            Console.WriteLine("Total calories: {0}", cal);
        }
    }
}
