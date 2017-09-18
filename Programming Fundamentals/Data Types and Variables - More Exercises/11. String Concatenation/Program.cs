using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _11.String_Concatenation
{
    class Program
    {
        static void Main(string[] args)
        {
            char symbol = char.Parse(Console.ReadLine());
            String evenOrOdd = Console.ReadLine();
            int n = int.Parse(Console.ReadLine());

            String result = "";
            for (int i = 1; i <= n; i++)
            {
                String lineToRead = Console.ReadLine();
                if (evenOrOdd == "even")
                {
                    if (i%2 == 0)
                    {
                        result = result + lineToRead + symbol;
                    }


                }
                else
                {
                    if (i % 2 != 0)
                    {
                        result = result + lineToRead + symbol;
                    }



                }




            }
            result = result.Remove(result.Length - 1, 1);
            Console.WriteLine(result);


        }
    }
}
