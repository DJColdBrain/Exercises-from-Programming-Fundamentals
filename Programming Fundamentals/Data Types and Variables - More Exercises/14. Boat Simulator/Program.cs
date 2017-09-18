using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _14.Boat_Simulator
{
    class Program
    {
        static void Main(string[] args)
        {
            char oddBoat = char.Parse(Console.ReadLine());
            char evenBoat = char.Parse(Console.ReadLine());
            int n = int.Parse(Console.ReadLine());

            int oddMovesMade = 0;
            int evenMovesMade = 0;

            for (int i = 1; i <= n; i++)
            {
                String comand = Console.ReadLine();

                if (comand == "UPGRADE")
                {
                    oddBoat = (char)((int)oddBoat + 3);
                    evenBoat = (char)((int)evenBoat + 3);
                } else if ( i % 2 == 0) {
                    evenMovesMade += comand.Length;
                    if (evenMovesMade >= 50)
                        break;

                }
                else
                {
                    oddMovesMade += comand.Length;
                    if (oddMovesMade >= 50)
                        break;

                }

               

            }
            if (evenMovesMade > oddMovesMade)
            {
                Console.WriteLine(evenBoat);
            }
            else Console.WriteLine(oddBoat);


        }
    }
}
