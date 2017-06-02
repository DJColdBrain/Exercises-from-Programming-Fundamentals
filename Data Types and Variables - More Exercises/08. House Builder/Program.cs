using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _08.House_Builder
{
    class Program
    {
        static void Main(string[] args)
        {
            checked
            {
                int materialSbyte;
                decimal materialInt;
                decimal a = decimal.Parse(Console.ReadLine());
                if (a <= sbyte.MaxValue)
                {
                    materialSbyte = (int)a;
                    materialInt = decimal.Parse(Console.ReadLine());
                }
                else
                {
                    materialSbyte = int.Parse(Console.ReadLine());
                    materialInt = a;
                }
                Console.WriteLine((4 * materialSbyte) + (10 * materialInt));
            }
        }
    }
}
