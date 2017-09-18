using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _05.Write_to_File
{
    class Program
    {
        static void Main(string[] args)
        {
            string text = File.ReadAllText("sample_text.txt");
            char[] marks = new char[] { '.', ',', '!', '?', ':' };

            string textToPrint = "";

            textToPrint = new string(text.Where(x => !marks.Contains(x)).ToArray());
            File.WriteAllText("output.txt", textToPrint);
        }
    }
}
