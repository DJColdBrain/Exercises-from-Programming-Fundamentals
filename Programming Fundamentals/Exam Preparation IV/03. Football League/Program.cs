using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Text.RegularExpressions;
using System.Threading.Tasks;

namespace _03.Football_League
{
    class Program
    {
        static void Main(string[] args)
        {


            string code = Console.ReadLine();
            string coded = "[" +string.Join(@"\", code) + "]{"+code.Length +"}[\\w]*[" + string.Join(@"\", code) + "]{" + code.Length + "}";
            Regex steam = new Regex(
                coded
                );
            Dictionary<string, long> league = new Dictionary<string, long>();
            Dictionary<string, long> goals = new Dictionary<string, long>();
            while (true)
            {
                
            
            string match = Console.ReadLine();
                if (match.Equals("final"))
                {
                    break;
                }
            string result = Regex.Match(match, @"[\d][:][\d]").ToString();
                
            long[] scores = result.Split(':').Select(long.Parse).ToArray();
            var teams = steam.Matches(match);
            
                int n ;
            if (scores[0] > scores[1])
            {
                 n = 0;
            }
            else if (scores[0] < scores[1])
            {
                 n = 1;
            }
            else
            {
                 n = -1;
            }
            for (int i = 0; i < 2; i++)
            {
                int  score = 0;
                if (n != -1)
                {
                    if (n == i)
                    {
                        score = 3;
                    }                    
                }
                else
                {
                    score = 1;
                }
                    string teamName = teams[i]
                            .ToString()
                            .Substring(code.Length, teams[i].Length - (2 * code.Length));
                    teamName = new string(teamName.Reverse().ToArray()).ToUpper();
                if (!league.ContainsKey(teamName))
                {
                    league.Add(teamName, score);
                        goals.Add(teamName, scores[i]);
                }
                else
                {
                    league[teamName] += score;
                        goals[teamName] += scores[i];
                }
            }
            }
            league = league.OrderByDescending(x => x.Value).ThenBy(x=> x.Key).ToDictionary(x=> x.Key,x=>x.Value);
            goals = goals.OrderByDescending(x => x.Value).ThenBy(x=>x.Key).Take(3).ToDictionary(x => x.Key, x => x.Value);

            


            Console.WriteLine("League standings:");
            int r = 1;
            foreach (var tem in league)
            {
                Console.WriteLine($"{r}. {tem.Key} {tem.Value}");
                r++;
            }
            Console.WriteLine("Top 3 scored goals:");
            foreach (var goal in goals)
            {
                Console.WriteLine($"- {goal.Key} -> {goal.Value}");
            }
        }
    }
}
