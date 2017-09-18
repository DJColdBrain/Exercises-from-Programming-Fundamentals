using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _05.Parking_Validation
{
    class Program
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());
            Dictionary<string, string> server = new Dictionary<string, string>();

            for (int i = 0; i < n; i++)
            {
                string[] comands = Console.ReadLine().Split(' ');
                
                
                if (comands[0].ToLower().Equals("register"))
                {
                    string plate = comands[2];
                    string name = comands[1];
                    // 
                    // 
                    //
                    //
                    if (server.ContainsKey(name))
                    {
                        Console.WriteLine("ERROR: already registered with plate number {0}", server[name]);
                    }
                    else if (!CheckPlateLetters(plate))
                    {
                        Console.WriteLine("ERROR: invalid license plate {0}", comands[2]);
                    }
                    else if (server.ContainsValue(plate))
                    {
                        Console.WriteLine("ERROR: license plate {0} is busy", plate);
                    }
                    else
                    {
                        server.Add(name, plate);
                        Console.WriteLine($"{name} registered {plate} successfully");
                    }
                }else
                if (comands[0].ToLower().Equals("unregister"))
                {
                    string name = comands[1];
                    if (server.ContainsKey(name))
                    {
                        server.Remove(name);
                        Console.WriteLine("user {0} unregistered successfully", name);
                    }
                    else
                    {
                        Console.WriteLine("ERROR: user {0} not found",name);
                    }
                }
            }
            foreach (var pair in server)
            {
                Console.WriteLine($"{pair.Key} => {pair.Value}");
            }


        }
        
        
        static bool CheckPlateLetters(string plateNumber)
        {
            bool isValidNumbers = plateNumber.ToCharArray().Skip(2).Take(4).All(d => char.IsDigit(d));

            bool isValidLetter = plateNumber.ToCharArray().Take(2).Concat(plateNumber.ToCharArray().Skip(6).Take(2)).All(x => char.IsUpper(x));

            return plateNumber.Length == 8 && isValidLetter && isValidNumbers;

        }
    }
}
