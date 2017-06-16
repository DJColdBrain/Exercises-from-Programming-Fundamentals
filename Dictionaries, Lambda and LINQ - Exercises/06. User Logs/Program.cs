using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _06.User_Logs
{
    class Program
    {
        static void Main(string[] args)
        {
            string[] log = Console.ReadLine().Split('=', ' ').ToArray();
            SortedDictionary<string, Dictionary<string, int>> person = new SortedDictionary<string, Dictionary<string, int>>();

            while (!log[0].Equals("end"))
            {
                
                string name = log.Last();
                string ip = log[1];


                if (!person.ContainsKey(name))
                {
                    person[name] = new Dictionary<string, int>();
                }

                var ipTracker = person[name];

                if (!ipTracker.ContainsKey(ip))
                {
                    ipTracker[ip] = 1;
                }
                else
                {
                    ipTracker[ip]++;
                }

                log = Console.ReadLine().Split('=', ' ').ToArray();
            }

            foreach (var name in person)
            {
       
               
                Console.WriteLine(name.Key+": ");
                foreach (var ip in name.Value)
                {
                    var last = name.Value.Last();
                    Console.Write("{0} => {1}", ip.Key, ip.Value);
                    if (last.Equals(ip))
                    {
                        Console.WriteLine(".");
                    }
                    else
                    {
                        Console.Write(", ");
                    }
                }
            }

        }
    }
}
