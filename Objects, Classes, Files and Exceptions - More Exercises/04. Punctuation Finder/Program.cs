using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _04.Punctuation_Finder
{
    class Program
    {
        static void Main(string[] args)
        {
            string text = File.ReadAllText("sample_text.txt");
            List<char> ponctuationMarks = new List<char>();
            //“.”, “,”, “!”, “?” and “:”.
            char[] marks = new char[] { '.',',', '!', '?', ':' };
            ponctuationMarks = text.Where(x => marks.Contains(x)).ToList();

            File.WriteAllText("output.txt", string.Join(", ", ponctuationMarks));
        }
    }
}
