using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApplication13
{
    class Program
    {
        static void Main(string[] args)
        {
            int a = int.Parse(Console.ReadLine());
            int b = int.Parse(Console.ReadLine());
            int c = int.Parse(Console.ReadLine());
            int sum1 = 0;
            int sum2 = 0;
            int comb = 0;
            bool t = false;
            for (int i = a; i <=b; i++)
            {

                for (int j = a; j <= b; j++)
                {
                    comb++;
                    if (i + j == c)
                    {
                        sum1 = i;
                        sum2 = j;
                        
                        t = true;
                    }
                }

            }
            if (t){
                Console.WriteLine("Number found! {0} + {1} = {2}",sum1,sum2,c);
            }else
            {
                Console.WriteLine("{0} combinations - neither equals {1}", comb,c);
            }
        }
    }
}
