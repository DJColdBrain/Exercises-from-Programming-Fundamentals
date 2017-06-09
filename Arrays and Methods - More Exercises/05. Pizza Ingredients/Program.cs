using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _05.Pizza_Ingredients
{
    class Program
    {
        static void Main(string[] args)
        { string[] ingredients = Console.ReadLine().Split(' ');
            int maxLenght = int.Parse(Console.ReadLine());

            int count = 0;
            List<string> goodIngredients = new List<string>();
            for (int i = 0; i < ingredients.Length; i++)
            {
                if (ingredients[i].Length == maxLenght)
                {
                    Console.WriteLine($"Adding {ingredients[i]}." );
                    count++;
                    goodIngredients.Add(ingredients[i]);
                }
                if (count == 10)
                {
                    break;
                }
            }
            Console.WriteLine($"Made pizza with total of {count} ingredients.");
            Console.WriteLine($"The ingredients are: " + string.Join(", ",goodIngredients) + ".");
        }
    }
}
