using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _05.Hands_of_Cards
{
    class Program
    {
        static void Main(string[] args)
        {

            List<string> playerAndHand = Console.ReadLine().Split(':', ',').ToList();

            Dictionary<string, List<string>> cards = new Dictionary<string, List<string>>();

            while (!playerAndHand[0].Equals("JOKER")) {


                
                string playerName = playerAndHand[0];
                List<string> playerHand = new List<string>();
                for (int i = 1; i < playerAndHand.Count; i++)
                {
                    playerHand.Add(playerAndHand[i]);
                }

                if (cards.ContainsKey(playerName))
                {
                    cards[playerName].AddRange(playerHand);
                }
                else
                {
                    cards.Add(playerName, playerHand);
                }
                playerAndHand = Console.ReadLine().Split(':', ',').ToList();
            }
            Dictionary<string, List<string>> temporaryCardHolder = new Dictionary<string, List<string>>();
            foreach (var pairs in cards)
            {
                temporaryCardHolder.Add(pairs.Key, cards[pairs.Key].Distinct().ToList());
            }
            cards = temporaryCardHolder;
            foreach (var cardTypes in cards)
            {
                List<string> card = cards[cardTypes.Key];
                int value = 0;
                for (int i = 0; i < card.Count; i++)
                {
                    int multiplyer = 0;
                    int power = 0;
                    string typedCard = card[i];
                    typedCard = typedCard.ToCharArray().Last().ToString();
                    string powerOfCard = card[i];
                    powerOfCard = powerOfCard.Remove(powerOfCard.Length - 1);
                    switch (typedCard)
                    {
                        case "S":
                            multiplyer = 4;
                            break;
                        case "H":
                            multiplyer = 3;
                            break;
                        case "D":
                            multiplyer = 2;
                            break;
                        case "C":
                            multiplyer = 1;
                            break;

                    }
                    switch (powerOfCard)
                    {
                        case " 1":
                            power = 1;
                            break;
                        case " 2":
                            power = 2;
                            break;
                        case " 3":
                            power = 3;
                            break;
                        case " 4":
                            power = 4;
                            break;
                        case " 5":
                            power = 5;
                            break;
                        case " 6":
                            power = 6;
                            break;
                        case " 7":
                            power = 7;
                            break;
                        case " 8":
                            power = 8;
                            break;
                        case " 9":
                            power = 9;
                            break;
                        case " 10":
                            power = 10;
                            break;
                        case " J":
                            power = 11;
                            break;
                        case " Q":
                            power = 12;
                            break;
                        case " K":
                            power = 13;
                            break;
                        case " A":
                            power = 14;
                            break;

                    }

                    value += multiplyer * power;


                }
                Console.WriteLine("{0}: {1}", cardTypes.Key, value);


            }



        }
    }
}
