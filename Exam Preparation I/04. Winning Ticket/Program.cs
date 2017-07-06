using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _04.Winning_Ticket
{
    class Program
    {
        static void Main(string[] args)
        {
            string[] tickets = Console.ReadLine().Split(
                new char[] { ',' }, StringSplitOptions.RemoveEmptyEntries).Select(x => x.Trim()).ToArray();

            for (int i = 0; i < tickets.Length; i++)
            {
                if (tickets[i].Length != 20)
                {
                    Console.WriteLine("invalid ticket");
                }
                else
                {
                    string leftSide = tickets[i].Substring(0, 10);
                    string rightSide = tickets[i].Substring(10);

                    
                    string leftSideWining = LoteryCharacters(leftSide);
                    string rightSideWining = LoteryCharacters(rightSide);


                    if (leftSideWining.Length < 6 || rightSideWining.Length < 6 || !leftSideWining[0].Equals(rightSideWining[0]) || !"@#$^".Contains(leftSideWining[0]))
                    {
                        Console.WriteLine("ticket \"{0}\" - no match",  tickets[i]);
                    }
                    else if (leftSideWining.Length < 10 || rightSideWining.Length<10)
                    {
                        Console.WriteLine("ticket \"{0}\" - {1}{2}", tickets[i], Math.Min(leftSideWining.Length,rightSideWining.Length), leftSideWining[0]);
                    }
                    else
                    {
                        Console.WriteLine("ticket \"{0}\" - 10{1} Jackpot!", tickets[i], leftSideWining[0]);
                    }



                }
            }

        }

        private static string LoteryCharacters(string side)
        {
            
            string que = new string(side[0], 1);
            string biggesQue = "";
            for (int j = 1; j < 10; j++)
            {
                if (side[j-1] == side[j])
                {
                    que += side[j];
                }
                else
                {
                    if (que.Length > biggesQue.Length)
                    {
                        biggesQue = que;
                    }
                    que = new string(side[j], 1);
                }


            }
            if (que.Length > biggesQue.Length)
            {
                biggesQue = que;
            }
            return new string(biggesQue[0], biggesQue.Length);
            }
        
    }
}
