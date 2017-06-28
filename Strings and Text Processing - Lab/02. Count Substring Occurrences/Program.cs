using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _02.Count_Substring_Occurrences
{
    class Program
    {
        static void Main(string[] args)
        {
            string text = Console.ReadLine().ToLower();
            string searcherText = Console.ReadLine().ToLower();
            int timesOccured = 0;
            int index = text.IndexOf(searcherText);
            while (index!=-1)
            {
                timesOccured++;
                index = text.IndexOf(searcherText, index+1);
            }
            Console.WriteLine(timesOccured);
        }
    }
}
