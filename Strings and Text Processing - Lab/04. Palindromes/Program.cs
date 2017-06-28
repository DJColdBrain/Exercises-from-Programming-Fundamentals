using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _04.Palindromes
{
    class Program
    {
        static void Main(string[] args)
        {
            string[] words = Console.ReadLine().Split(new char[] { ',', ' ', '.', '?', '!' } , StringSplitOptions.RemoveEmptyEntries);
            List<string> polindroms = new List<string>();
            foreach (var word in words)
            {
                bool t = false;
                for (int i = 0; i < word.Length/2; i++)
                {
                    if (!word[i].Equals(word[word.Length-i-1]))
                    {
                        t = true;
                    }
                }
                if (!t && !polindroms.Contains(word))
                {
                    polindroms.Add(word);
                }

            }
            polindroms = polindroms.OrderBy(x => x).ToList();
            Console.WriteLine(string.Join(", " , polindroms));
        }
    }
}
