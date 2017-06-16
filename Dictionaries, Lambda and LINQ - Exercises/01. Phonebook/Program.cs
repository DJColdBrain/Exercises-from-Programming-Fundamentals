using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _01.Phonebook
{
    class Program
    {
        static void Main(string[] args)
        {
            string[] comands = Console.ReadLine().Split(' ');
            Dictionary<string, string> phonebook = new Dictionary<string, string>();
            while (comands[0] != "END")
            {
                if (comands[0] == "A")
                {
                    if (phonebook.ContainsKey(comands[1]))
                    {
                        phonebook[comands[1]] = comands[2];
                    }
                    else
                    { 
                    phonebook.Add(comands[1], comands[2]);
                    }
                }
                else if(comands[0] == "S"){
                    if (phonebook.ContainsKey(comands[1]))
                    {
                        Console.WriteLine("{0} -> {1}", comands[1], phonebook[comands[1]]);
                    }
                    else
                    {
                        Console.WriteLine("Contact {0} does not exist.", comands[1]);
                    }

                }
                comands = Console.ReadLine().Split(' ');
            }

        }
    }
}
