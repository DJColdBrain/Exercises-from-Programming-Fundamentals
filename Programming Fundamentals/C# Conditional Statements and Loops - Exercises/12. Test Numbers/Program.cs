using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApplication12
{
    class Program
    {
        static void Main(string[] args)
        {
            int a = int.Parse(Console.ReadLine());
            int b = int.Parse(Console.ReadLine());
            int c = int.Parse(Console.ReadLine());
            int com = 0;
            int sum= 0;
            for (int i = a; i >0; i--)
            {
                for (int j = 1; j <= b; j++)
                {
                    sum += 3 * (i * j);
                    com++;
                    if (sum >= c) break;
                   
                }
                if (sum >= c) break;
            }
            if (sum >= c) {
                Console.WriteLine("{0} combinations", com);
                Console.WriteLine("Sum: {0} >= {1}", sum,c);
            } else
            {
                Console.WriteLine("{0} combinations", com);
                Console.WriteLine("Sum: {0}", sum);
            }
          
        }
    }
}
