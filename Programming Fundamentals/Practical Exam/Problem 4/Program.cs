using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Problem_4
{
    
    class Program
    {
        static void Main(string[] args)
        {
           // Dictionary<string, int> evolution = new Dictionary<string, int>();
            Dictionary<string, List<Dictionary<string, int>>> pokemons = new Dictionary<string, List<Dictionary<string, int>>>();
            while (true)
            {
                string[] comands = Console.ReadLine().Split(new char[] { ' ', '-', '>' }, StringSplitOptions.RemoveEmptyEntries).ToArray();

                if (comands[0].Equals("wubbalubbadubdub"))
                {
                    break;
                }
                if (comands.Length == 1)
                {
                    if (pokemons.ContainsKey(comands[0]))
                    {
                        foreach (var  type in pokemons[comands[0]])
                        {
                            foreach (var item in type)
                            {
                                Console.WriteLine(item.Key +" <->"+ item.Value);
                            }
                        }
                    }
                }
                else
                {
                    string name = comands[0];
                    string type = comands[1];
                    int index = int.Parse(comands[2]);

                    if (pokemons.ContainsKey(name))
                    {
                        Dictionary<string, int> temporary = new Dictionary<string, int>();
                        temporary.Add(type, index);
                          pokemons[name].Add(temporary);
                    }
                    else
                    {
                        Dictionary<string, int> temporary = new Dictionary<string, int>();
                        temporary.Add(type, index);
                        List<Dictionary<string, int>> temp = new List<Dictionary<string, int>>();
                        temp.Add(temporary);
                        pokemons.Add(name, temp);
                    }


                }
                

            }
           
            Dictionary<string, List<Dictionary<string, int>>> temporary1 = new Dictionary<string, List<Dictionary<string, int>>>();

            foreach (var pokemon in pokemons)
            {
                
                List<Dictionary<string, int>> temp1 = new List<Dictionary<string, int>>();
                SortedList<Dictionary<string, int>, int> temp2 = new SortedList<Dictionary<string, int>, int>();
                foreach (var type in pokemon.Value)
                {
                    Dictionary<string, int> meh = new Dictionary<string, int>();
                    foreach (var item in type)
                    {
                        meh.Add(item.Key, item.Value);
                        temp2.Add(meh, item.Value);
                    }



                }
                foreach (var item in temp2)
                {
                    temp1.Add(item.Key);
                }

                temporary1.Add(pokemon.Key, temp1);
            }
            pokemons = temporary1;

            foreach (var pokemon in pokemons)
            {
                Console.WriteLine(pokemon.Key);
                foreach (var type in pokemon.Value)
                {
                    foreach (var item in type)
                    {
                        Console.WriteLine(item.Key + " <-> " + item.Value);
                    }
                }
            }
        }
    }
}
