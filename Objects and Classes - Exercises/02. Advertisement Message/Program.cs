using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _02.Advertisement_Message
{
    class Program
    {
        static void Main(string[] args)
        {
            string[] phrases = 
            {
                "Excellent product.",
                "Such a great product.",
                "I always use that product.",
                "Best product of its category.",
                "Exceptional product.",
                "I can’t live without this product."
            };
            string[] events = 
            {
                "Now I feel good.",
                "I have succeeded with this product.",
                "Makes miracles. I am happy of the results!",
                "I cannot believe but now I feel awesome.",
                "Try it yourself, I am very satisfied.",
                "I feel great!"
            };
            string[] authors = 
           {
               "Diana",
               "Petya",
               "Stella",
               "Elena",
               "Katya",
               "Iva",
               "Annie",
               "Eva"
           };
            string[] cities = 
            {
                "Burgas",
                "Sofia",
                "Plovdiv",
                "Varna",
                "Ruse"
            };



            int n = int.Parse(Console.ReadLine());

            Random rnd = new Random();
            int d = rnd.Next(5);
            for (int i = 0; i < n; i++)
            {
                string s = phrases[rnd.Next(phrases.Length)] + " " + events[rnd.Next(events.Length)] + " "
                    + authors[rnd.Next(authors.Length)] + " - " + cities[rnd.Next(cities.Length)];

                Console.WriteLine(s);
            }
        }
    }
}
