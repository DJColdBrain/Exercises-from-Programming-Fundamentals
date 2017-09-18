using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApplication1
{
    class Program
    {
        static void Main(string[] args)
        {
            double money = double.Parse(Console.ReadLine());
            String s;
            double Start_Money = money;
            do
            {
                s = Console.ReadLine();


                if (s == "Game Time")
                    break;

                else if (s == "OutFall 4")
                {
                    if (money < 39.99)
                    {
                        Console.WriteLine("Too Expensive");
                    }
                    else
                    {
                        Console.WriteLine("Bought OutFall 4");
                        money -= 39.99;
                    }

                }
                else if (s == "CS: OG")
                {
                    if (money < 15.99)
                    {
                        Console.WriteLine("Too Expensive");
                    }
                    else
                    {
                        Console.WriteLine("Bought CS: OG");
                        money -= 15.99;
                    }

                }
                else if (s == "Zplinter Zell")
                {
                    if (money < 19.99)
                    {
                        Console.WriteLine("Too Expensive");
                    }
                    else
                    {
                        Console.WriteLine("Bought Zplinter Zell");
                        money -= 19.99;
                    }

                }
                else if (s == "Honored 2")
                {
                    if (money < 59.99)
                    {
                        Console.WriteLine("Too Expensive");
                    }
                    else
                    {
                        Console.WriteLine("Bought Honored 2");
                        money -= 59.99;
                    }

                }
                else if (s == "RoverWatch")
                {
                    if (money < 29.99)
                    {
                        Console.WriteLine("Too Expensive");
                    }
                    else
                    {
                        Console.WriteLine("Bought RoverWatch");
                        money -= 29.99;
                    }

                }
                else if (s == "RoverWatch Origins Edition")
                {
                    if (money < 39.99)
                    {
                        Console.WriteLine("Too Expensive");
                    }
                    else
                    {
                        Console.WriteLine("Bought RoverWatch Origins Edition");
                        money -= 39.99;
                    }

                }
                else { Console.WriteLine("Not Found"); }







            }
            while (s != "Game Time");


            if (money == 0)
                Console.WriteLine("Out of money!");
            else
            {
                Console.WriteLine($"Total spent: ${Start_Money - money:f2}. Remaining: ${money:f2}");
            }

        }
    }
}
