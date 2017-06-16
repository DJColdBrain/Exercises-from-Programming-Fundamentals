using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _08.Logs_Aggregator
{
    class Program
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());

            SortedDictionary<string, SortedDictionary<string, int>>  users = new SortedDictionary<string, SortedDictionary<string, int>>();
            var sessions = new SortedDictionary<string, int>();
            for (int i = 0; i < n; i++)
            {
                string[] info = Console.ReadLine().Split(' ');

                int time = int.Parse(info[2]);
                string name = info[1];
                string ip = info[0];


                if (!users.ContainsKey(name))
                {
                    users[name] = new SortedDictionary<string, int>();
                }

                sessions = users[name];

                if (!sessions.ContainsKey(ip))
                {
                    sessions[ip] = time;
                }
                else
                {
                    sessions[ip]+=time;
                }
            }

            foreach (var user in users)
            {
                Console.WriteLine(user.Key + ": {0} [{1}]", user.Value.Values.Sum(), string.Join(", ", user.Value.Keys ));
                
            }


        }
    }
}
