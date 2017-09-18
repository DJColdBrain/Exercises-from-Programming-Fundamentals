using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Text.RegularExpressions;
using System.Threading.Tasks;

namespace Problem_3
{
    class Program
    {
        static void Main(string[] args)
        {
            List<string> didimon = new List<string>();
            List<string> bojomon = new List<string>();

            string pokeword = Console.ReadLine();
            Regex boji = new Regex(@"[a-zA-Z]+[-][A-Za-z]+");
            Regex did = new Regex(@"[^-a-zA-Z]+");

            
            while (pokeword .Length > 0)
            {
                var word = did.Match(pokeword).ToString();
                
                if (word != "")
                {
                    pokeword = pokeword.Remove(0, pokeword.IndexOf(word) + word.Length);
                    didimon.Add(word);
                }
                else
                {
                    break;
                }
                word = boji.Match(pokeword).ToString();
               
                if (word != "")
                {
                    pokeword = pokeword.Remove(0, pokeword.IndexOf(word) + word.Length);
                    bojomon.Add(word);
                }
                else 
                {
                    break;
                }
            }
            for (int i = 0; i < Math.Max(bojomon.Count, didimon.Count); i++)
            {
                if (i < didimon.Count && didimon[i]!= "")
                {
                    Console.WriteLine(didimon[i]);
                }
                if (i< bojomon.Count && bojomon[i] != "")
                {
                    Console.WriteLine(bojomon[i]);
                }
            }
            
        }
    }
}
