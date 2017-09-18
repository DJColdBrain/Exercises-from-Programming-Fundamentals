using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _20.Dragon_Army
{
    class Program
    {
        static void Main(string[] args)
        {
            var count = int.Parse(Console.ReadLine());
            Dictionary<string, Dictionary<string, List<double>>> dragons = new Dictionary<string, Dictionary<string, List<double>>>();

            for (int i = 0; i < count; i++)
            {
                var input = Console.ReadLine().Split(' ').ToArray();
                var type = input[0];
                var name = input[1];
                var damage = ReturnPoints(input[2], 2);
                var health = ReturnPoints(input[3], 3);
                var armor = ReturnPoints(input[4], 4);

                if (dragons.ContainsKey(type))
                {
                    if (dragons[type].ContainsKey(name))
                    {
                        List<double> attributes = new List<double>();
                        attributes.Add(damage);
                        attributes.Add(health);
                        attributes.Add(armor);
                        dragons[type][name] = attributes;
                    }
                    else
                    {
                        List<double> attributes = new List<double>();
                        attributes.Add(damage);
                        attributes.Add(health);
                        attributes.Add(armor);
                        dragons[type].Add(name, attributes);
                    }
                }
                else
                {
                    Dictionary<string, List<double>> dragon = new Dictionary<string, List<double>>();
                    List<double> attributes = new List<double>();
                    attributes.Add(damage);
                    attributes.Add(health);
                    attributes.Add(armor);
                    dragon.Add(name, attributes);
                    dragons.Add(type, dragon);
                }


            }

            foreach (KeyValuePair<string, Dictionary<string, List<double>>> dragonType in dragons)
            {
                var damage = 0.0;
                var health = 0.0;
                var shield = 0.0;
                foreach (KeyValuePair<string, List<double>> dragon in dragonType.Value)
                {
                    damage += dragon.Value[0];
                    health += dragon.Value[1];
                    shield += dragon.Value[2];
                }
                var length = dragonType.Value.Values.Count();
                Console.WriteLine("{0}::({1:F2}/{2:F2}/{3:F2})", dragonType.Key, damage / length, health / length, shield / length);
                foreach (KeyValuePair<string, List<double>> dragon in dragonType.Value.OrderBy(c => c.Key))
                {
                    Console.WriteLine("-{0} -> damage: {1}, health: {2}, armor: {3}", dragon.Key, dragon.Value[0],
                        dragon.Value[1], dragon.Value[2]);

                }
            }
        }

        public static double ReturnPoints(string points, int pos)
        {
            var score = 0.0;
            if (points == "null" && pos == 2)
            {
                score = 45;
            }
            else if (points == "null" && pos == 3)
            {
                score = 250;
            }
            else if (points == "null" && pos == 4)
            {
                score = 10;
            }
            else
            {
                score = Convert.ToDouble(points);
            }

            return score;
        }
    }
}