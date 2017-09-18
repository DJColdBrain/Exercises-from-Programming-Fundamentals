using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Problem_2
{
    class Program
    {
        static void Main(string[] args)
        {
            List<int> pokemons = Console.ReadLine().Split(' ').Select(int.Parse).ToList();
            List<int> catcheedPokemons = new List<int>();

            while (pokemons.Count >0)
            {
                int index = int.Parse(Console.ReadLine());

                if (index < 0)
                {
                    int removed = pokemons[0];
                    pokemons[0] = pokemons.Last();
                    for (int i = 0; i < pokemons.Count; i++)
                    {
                        if (pokemons[i] > removed)
                        {
                            pokemons[i] -= removed;
                        }
                        else if (pokemons[i] <= removed)
                        {
                            pokemons[i] += removed;
                        }
                    }
                    catcheedPokemons.Add(removed);
                    continue;
                }
                if (index >= pokemons.Count)
                {
                    int removed = pokemons[pokemons.LastIndexOf(pokemons.Last())];
                    pokemons[pokemons.LastIndexOf(pokemons.Last())] = pokemons[0];
                    for (int i = 0; i < pokemons.Count; i++)
                    {
                        if (pokemons[i] > removed)
                        {
                            pokemons[i] -= removed;
                        }
                        else if (pokemons[i] <= removed)
                        {
                            pokemons[i] += removed;
                        }
                    }
                    catcheedPokemons.Add(removed);
                    continue;
                }
                int element = pokemons[index];
                pokemons.RemoveAt(index);
                catcheedPokemons.Add(element);
                for (int i = 0; i < pokemons.Count; i++)
                {
                    if (pokemons[i]>element)
                    {
                        pokemons[i] -= element;
                    }
                    else if (pokemons[i] <= element)
                    {
                        pokemons[i] += element;
                    }
                }
            }
            Console.WriteLine(catcheedPokemons.Sum());
        }
    }
}
