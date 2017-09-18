using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _18.Different_Integers_Size
{
    class Program
    {
        static void Main(string[] args)
        {
            decimal n = decimal.Parse(Console.ReadLine());
           
            if (n < 0)
            {
                if (n >= long.MinValue ){
                    Console.WriteLine($"{n} can fit in:");
                    if (n >= sbyte.MinValue ) {
                        Console.WriteLine("* sbyte");
                    }
                    if (n >= short .MinValue )
                    {
                        Console.WriteLine("* short");
                    }
                    if (n >= int.MinValue )
                    {
                        Console.WriteLine("* int");
                    }
                    if (n >= long.MinValue )
                    {
                        Console.WriteLine("* long");
                    }
                }
                else Console.WriteLine($"{n} can't fit in any type");
            }
            else {
                if (n <= long.MaxValue)
                {
                    Console.WriteLine($"{n} can fit in:");
                    if (n <= sbyte.MaxValue)
                    {
                        Console.WriteLine("* sbyte");
                    }
                    if (n <= byte.MaxValue)
                    {
                        Console.WriteLine("* byte");
                    }                   
                    if (n <= short.MaxValue)
                    {
                        Console.WriteLine("* short");
                    }
                    if (n <= ushort.MaxValue)
                    {
                        Console.WriteLine("* ushort");
                    }
                    if (n <= int.MaxValue)
                    {
                        Console.WriteLine("* int");
                    }
                    if (n <= uint.MaxValue)
                    {
                        Console.WriteLine("* uint");
                    }
                    if (n <= long.MaxValue)
                    {
                        Console.WriteLine("* long");
                    }
                   
                }
                else Console.WriteLine($"{n} can't fit in any type");

            }


        }
    }
}
