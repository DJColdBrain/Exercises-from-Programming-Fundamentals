using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _02.SoftUni_Karaoke
{
    class Program
    {
        static void Main(string[] args)
        {
            List<string> officialSingers = Console.ReadLine().Split(new char[] { ',' }, StringSplitOptions.RemoveEmptyEntries).Select(s => s.Trim()).ToList();
            List<string> officialSongs = Console.ReadLine().Split(new char[] { ',' }, StringSplitOptions.RemoveEmptyEntries).Select(s => s.Trim()).ToList();
            string[] songs  = Console.ReadLine().Split(new char[] { ',' }, StringSplitOptions.RemoveEmptyEntries).Select(s => s.Trim()).ToArray();
            Dictionary<string, List<string>> awards = new Dictionary<string, List<string>>();
            while (!songs[0].Equals("dawn"))
            {
                if (officialSingers.Contains(songs[0]) && officialSongs.Contains(songs[1]))
                {
                    if (awards.ContainsKey(songs[0]) && !awards[songs[0]].Contains(songs[2]))
                    {
                        awards[songs[0]].Add(songs[2]);
                        awards[songs[0]] = awards[songs[0]].OrderBy(x => x).ToList();
                    }
                    else if(!awards.ContainsKey(songs[0]))
                    {
                        awards.Add(songs[0], new List<string> { songs[2] });
                        awards[songs[0]] = awards[songs[0]].OrderBy(x => x).ToList();
                    }
                }


                songs = Console.ReadLine().Split(new char[] { ',' }, StringSplitOptions.RemoveEmptyEntries).Select(s => s.Trim()).ToArray();
            }
            
            awards = awards.OrderByDescending(x => x.Value.Count).ThenBy(x => x.Key).ToDictionary(x => x.Key,  x=> x.Value);


            if (awards.Count != 0)
            {
                foreach (var award in awards)
                {
                    Console.WriteLine($"{award.Key}: {award.Value.Count} awards");
                    foreach (var item in award.Value)
                    {
                        Console.WriteLine($"--{item}");
                    }
                }
            }
            else
            {
                Console.WriteLine("No awards");
            }


        }
    }
}
