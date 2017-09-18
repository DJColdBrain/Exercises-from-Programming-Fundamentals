
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Problem_2._1
{
    class Pokemon
    {
        public string Type { get; set; }
        public long Index { get; set; }
        public Pokemon (string type, long index)
        {
            this.Type = type;
            this.Index = index;
        }
    }
    class Program
    {
        static void Main(string[] args)
        {
            Dictionary<string, List<Pokemon>> pokemons = new Dictionary<string, List<Pokemon>>();
            while (true)
            {
                string[] comands = Console.ReadLine().Split(new char[] { ' ', '-', '>' }, StringSplitOptions.RemoveEmptyEntries).ToArray();

                if (comands[0].Equals("wubbalubbadubdub"))
                {
                    break;
                }
                if (comands.Length < 3)
                {
                    if (pokemons.ContainsKey(comands[0]))
                    {
                        Console.WriteLine("# " + comands[0]);
                        foreach (var type in pokemons[comands[0]])
                        {
                            
                                Console.WriteLine(type.Type + " <-> " + type.Index);
                            
                        }
                    }
                }
                else
                {
                    string name = comands[0];
                    string type = comands[1];
                    long index = long.Parse(comands[2]);

                    if (pokemons.ContainsKey(name))
                    {
                        pokemons[name].Add(new Pokemon(type, index));
                    }
                    else
                    {
                        List<Pokemon> temp = new List<Pokemon>();
                        temp.Add(new Pokemon(type, index));
                        pokemons.Add(name, temp);
                    }


                }


            }
            List<Pokemon> temp1 = new List<Pokemon>();
            Dictionary<string, List<Pokemon>> temp2 = new Dictionary<string, List<Pokemon>>();

            foreach (var pokemon in pokemons)
            {
                temp1 = pokemon.Value.OrderByDescending(x => x.Index).ToList();
                temp2.Add(pokemon.Key, temp1);
            }
            pokemons = temp2;

            foreach (var pokemon in pokemons)
            {
                Console.WriteLine("# " +pokemon.Key);
                foreach (var item in pokemon.Value)
                {
                    Console.WriteLine($"{item.Type} <-> {item.Index}");
                }
            }
        }
    }
}
