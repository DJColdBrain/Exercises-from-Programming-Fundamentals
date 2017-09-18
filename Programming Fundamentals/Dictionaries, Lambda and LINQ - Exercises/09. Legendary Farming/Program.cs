using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _09.Legendary_Farming
{
    class Program
    {
        static void Main(string[] args)
        {
            Dictionary<string, int> materials = new Dictionary<string, int>
            {{"shards" , 0 },
            { "fragments" , 0 },
            { "motes" , 0 }
              };
            Dictionary<string, int> junk = new Dictionary<string, int>();

            while (true)
            {
                string itemName = "";
                int itemQuantity = 0;
                string[] items = Console.ReadLine().Split(new char[] {' '}, StringSplitOptions.RemoveEmptyEntries);
                for (int i = 0; i < items.Length; i++)
                {
                    
                    if (i % 2 == 0)
                    {
                        itemQuantity = int.Parse(items[i]);
                    }
                    else
                    {
                        itemName = items[i].ToLower();


                        if (materials.ContainsKey(itemName))
                        {
                            materials[itemName] += itemQuantity;
                        }
                        else if (junk.ContainsKey(itemName))
                        {
                            junk[itemName]+= itemQuantity;
                        }else
                        {
                            junk.Add(itemName, itemQuantity);
                        }
                        if (materials["shards"] >= 250 || materials["motes"] >= 250 || materials["fragments"] >= 250)
                        {
                            break;
                        }


                    }
                }
                if (materials["shards"] >= 250 || materials["motes"] >= 250 || materials["fragments"] >= 250)
                {
                    break;
                }




            }
            if (materials["shards"] >= 250)
            {
                Console.WriteLine("Shadowmourne obtained!");
                materials["shards"] -= 250;
            }
            else if (materials["motes"] >= 250)
            {
                Console.WriteLine("Dragonwrath obtained!");
                materials["motes"] -= 250;
            }
            else
            {
                Console.WriteLine("Valanyr obtained!");
                materials["fragments"] -= 250;
            }
            materials = materials.OrderByDescending(x => x.Value).ThenBy(x => x.Key).ToDictionary(x => x.Key, x => x.Value);
            junk = junk.OrderBy(x => x.Key).ToDictionary(x => x.Key, x => x.Value);

            foreach (var material in materials)
            {
                Console.WriteLine($"{material.Key}: {material.Value}");
            }
            foreach (var junc in junk)
            {
                Console.WriteLine($"{junc.Key}: {junc.Value}");
            }


        }
    }
}
