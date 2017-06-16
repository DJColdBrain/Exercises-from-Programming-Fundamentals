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
            var emailBook = new Dictionary<string, string>();
            string name = "";
            string email = "";
            while (!comand.Equals("stop"))
            {
                if (n % 2 == 1)
                {
                    name = comand;
                }
                else
                {
                    email = comand;

                    if (emailBook.ContainsKey(name))
                    {
                        emailBook[name] += email;
                    }
                    else
                    {
                        emailBook.Add(name, email);
                    }
                }
                n++;
                comand = Console.ReadLine();
            }
            List<string> emailsToRemove = new List<string>();
            foreach (var pairs in emailBook)

            {
                string[] emailFinisher = pairs.Value.Split('.').ToArray();
                if (emailFinisher[1].ToLower().Equals("uk") || emailFinisher[1].ToLower().Equals("us"))
                {
                    emailsToRemove.Add(pairs.Key);
                }

            }
            foreach (var emails in emailsToRemove)
            {
                emailBook.Remove(emails);
            }
            foreach (var pairs in emailBook)
            {
                Console.WriteLine("{0} -> {1}", pairs.Key, pairs.Value);
            }

        }
    }
}
