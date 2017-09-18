using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _09.Melrah_Shake
{
    class Program
    {
        static void Main(string[] args)
        {
            string test = Console.ReadLine();
            string key = Console.ReadLine();

            while (true)
            {


                //find match
                int lastindex = test.LastIndexOf(key);
                int firstindex = test.IndexOf(key);

                //shake it or not
                if (firstindex != -1 && lastindex != -1 && firstindex != lastindex
                   && key.Length > 0)
                {
                    Console.WriteLine("Shaked it.");
                    test = test.Remove(firstindex, key.Length);
                    lastindex = test.LastIndexOf(key);
                    test = test.Remove(lastindex, key.Length);
                }
                else
                {
                    Console.WriteLine("No shake.");
                    Console.WriteLine(test);
                    break;
                }
                //change key
                int indexToremove = key.Length / 2;
                key = key.Remove(indexToremove, 1);

            }
        }
    }
}
