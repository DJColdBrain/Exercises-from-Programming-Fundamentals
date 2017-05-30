using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApplication6
{
    class Program
    {
        static void Main(string[] args)
        {
            int magic_number = int.Parse(Console.ReadLine());

            int A = 1;
            int T = 4;

            int count = 0;

            for (int i = A; i <= T; i++)
            {
                for (int j = A; j <= T; j++)
                {
                    for (int g = A; g <= T; g++)
                    {
                        if (i + j + g < magic_number)
                        {
                            Console.Write("X");
                            switch (i)
                            {
                                case 1:
                                    Console.Write("A");
                                    break;
                                case 2:
                                    Console.Write("C");
                                    break;
                                case 3:
                                    Console.Write("G");
                                    break;
                                case 4:
                                    Console.Write("T");
                                    break;


                            }
                            switch (j)
                            {
                                case 1:
                                    Console.Write("A");
                                    break;
                                case 2:
                                    Console.Write("C");
                                    break;
                                case 3:
                                    Console.Write("G");
                                    break;
                                case 4:
                                    Console.Write("T");
                                    break;


                            }
                            switch (g)
                            {
                                case 1:
                                    Console.Write("A");
                                    break;
                                case 2:
                                    Console.Write("C");
                                    break;
                                case 3:
                                    Console.Write("G");
                                    break;
                                case 4:
                                    Console.Write("T");
                                    break;


                            }






                            Console.Write("X");
                            Console.Write(" ");
                        }
                        else
                        {
                            Console.Write("O");
                            switch (i)
                            {
                                case 1:
                                    Console.Write("A");
                                    break;
                                case 2:
                                    Console.Write("C");
                                    break;
                                case 3:
                                    Console.Write("G");
                                    break;
                                case 4:
                                    Console.Write("T");
                                    break;


                            }
                            switch (j)
                            {
                                case 1:
                                    Console.Write("A");
                                    break;
                                case 2:
                                    Console.Write("C");
                                    break;
                                case 3:
                                    Console.Write("G");
                                    break;
                                case 4:
                                    Console.Write("T");
                                    break;


                            }
                            switch (g)
                            {
                                case 1:
                                    Console.Write("A");
                                    break;
                                case 2:
                                    Console.Write("C");
                                    break;
                                case 3:
                                    Console.Write("G");
                                    break;
                                case 4:
                                    Console.Write("T");
                                    break;


                            }






                            Console.Write("O");
                            Console.Write(" ");
                        }

                        if (count < 3)
                            count++;
                        else
                        {
                            Console.WriteLine();
                            count = 0;
                        }


                    }
                }
            }

        }
    }
}
