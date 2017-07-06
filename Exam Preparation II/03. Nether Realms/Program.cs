using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Text.RegularExpressions;
using System.Threading.Tasks;

namespace _03.Nether_Realms
{
    class Demon
    {
        public string Name { get; set; }
        public long Healt { get {
                
                //var healt = Regex.Matches(Name, "[^0-9-+*/.]");
                var healt = Regex.Matches(Name, @"[^\d\.\+\-\*\/\s\,]");
                long h = 0;
                char[] hel = new char[healt.Count];
                for (int i = 0; i < healt.Count; i++)
                {
                    hel[i] = healt[i].ToString().ToCharArray()[0];
                }
                for (int i = 0; i < hel.Length; i++)
                {
                    h += hel[i];
                }
                return h;
            }
        }
        public double Dmg { get {
                 Regex lineSplitter = new Regex(@"([+-]?[\d]*[.]*[\d]*)");
               // Regex lineSplitter = new Regex(@"[\+\-]*[0-9.]+[0-9]*");
                var dmg = lineSplitter.Matches(Name);
                List<double> doubles = new List<double>();
                string[] ddd = new string[dmg.Count];
                for (int i = 0; i < dmg.Count; i++)
                {
                    ddd[i] = dmg[i].ToString();
                }
                ddd = ddd.Where(x => x != string.Empty).ToArray();
                for (int i = 0; i < ddd.Length; i++)
                {
                    doubles.Add(double.Parse(ddd[i]));
                }


                var multiplayers =Regex.Matches(Name, "[*/]");
                double damage = doubles.Sum();
                for (int i = 0; i < multiplayers.Count; i++)
                {
                    if (multiplayers[i].ToString() == "*")
                    {
                        damage *= 2;
                    }
                    else if(multiplayers[i].ToString() == "/")
                    {
                        damage /= 2;
                    }
                }
                return damage;
            }
        }


        public Demon (string name)
        {
            this.Name = name;
        }
        
        

    }

    class Program
    {
        static void Main(string[] args)
        {
            string[] demons = Console.ReadLine().Split(',').Select(x => x.Trim()).OrderBy(x => x).ToArray();
            for (int i = 0; i < demons.Length; i++)
            {
                Demon demon = new Demon(demons[i]);
                Console.WriteLine("{0} - {1} health, {2:f2} damage", demon.Name, demon.Healt, demon.Dmg);
            }
        }
    }
}
