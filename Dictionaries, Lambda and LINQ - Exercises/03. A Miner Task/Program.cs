using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _03.A_Miner_Task
{
    class Program
    {
        static void Main(string[] args)
        {
            string comand = Console.ReadLine();
            int n = 1;
            var resources =new Dictionary<string, int>();
            string resource = "";
            int quantity = 0;
            while (!comand.Equals("stop"))
            {
                if (n % 2 ==1)
                {
                        resource = comand;
                }
                else
                {
                    quantity = int.Parse(comand);

                    if (resources.ContainsKey(resource))
                    {
                        resources[resource] += quantity;
                    }
                    else
                    {
                        resources.Add(resource, quantity);
                    }
                }
                n++;
                comand = Console.ReadLine();
            }
            foreach (var pairs in resources)
            {
                Console.WriteLine("{0} -> {1}", pairs.Key,pairs.Value);
            }

        }
    }
}
