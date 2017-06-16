using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _06.Byte_Flip
{
    class Program
    {
        static void Main(string[] args)
        {
            List<string> codedMessage = Console.ReadLine().Split(' ').ToList();
            codedMessage = codedMessage.Where(x => x.Length == 2).ToList();
            string message = "";
            for (int i = 0; i < codedMessage.Count; i++)
            {
                char[] hex = codedMessage[i].ToCharArray();
                char last = hex.Last();
                hex[1] = hex[0];
                hex[0] = last;
                
                codedMessage[i] = string.Join("",hex);
            }
            codedMessage.Reverse();
            for (int i = 0; i < codedMessage.Count; i++)
            {
                int character = Convert.ToInt32(codedMessage[i], 16);

                message = message + (char)character;
            }
            Console.WriteLine(message);
        }
    }
}
