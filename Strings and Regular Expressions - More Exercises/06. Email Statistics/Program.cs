using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Text.RegularExpressions;
using System.Threading.Tasks;

namespace _06.Email_Statistics
{
    class Program
    {
        static void Main(string[] args)
        {
            var emails = new Dictionary<string, HashSet<string>>();

            var emailsCount = int.Parse(Console.ReadLine());

            for (int i = 0; i < emailsCount; i++)
            {
                var email = Console.ReadLine();

                var emailPattern = @"^(?<username>[a-zA-Z]{5,})@(?<domain>(?<mailServer>[a-z]{3,})(?<topDomain>\.com|\.bg|\.org))$";
                var match = Regex.Match(email, emailPattern);

                if (match.Success)
                {
                    var domain = match.Groups["domain"].Value;
                    var username = match.Groups["username"].Value;

                    if (!emails.ContainsKey(domain))
                    {
                        emails[domain] = new HashSet<string>();
                    }

                    if (!emails[domain].Contains(username))
                    {
                        emails[domain].Add(username);
                    }
                }
            }

            foreach (var email in emails.OrderByDescending(x => x.Value.Count))
            {
                var domain = email.Key;
                var usernames = email.Value;

                Console.WriteLine($"{domain}:");

                foreach (var username in usernames)
                {
                    Console.WriteLine($"### {username}");
                }
            }
        }
    }
}
