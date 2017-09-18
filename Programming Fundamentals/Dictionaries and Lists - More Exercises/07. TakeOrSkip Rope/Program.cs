using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _07.TakeOrSkip_Rope
{
    class Program
    {
        static void Main(string[] args)
        {
            string code = Console.ReadLine();
            char[] codeArray = code.ToCharArray();

            List<int> codeKey = new List<int>();
            List<string> codeMessage = new List<string>();

            for (int i = 0; i < codeArray.Length; i++)
            {
                int n;
                if (int.TryParse(codeArray[i].ToString(), out n))
                {
                    codeKey.Add(n);
                }
                else
                {
                    codeMessage.Add(codeArray[i].ToString());
                }
            }
            List<int> takeCode = new List<int>();
            List<int> skipCode = new List<int>();
            for (int i = 0; i < codeKey.Count; i++)
            {
                if (i%2 == 0)
                {
                    takeCode.Add(codeKey[i]);
                }
                else
                {
                    skipCode.Add(codeKey[i]);
                }
            }

            int skip = 0;
            string messsage = "";
            for (int i = 0; i < takeCode.Count; i++)
            {

                for (int j = skip; j < takeCode[i] + skip; j++)
                {
                    if (j< codeMessage.Count)
                    {
                        messsage = messsage + codeMessage[j];
                    }
                    else
                    {
                        break;
                    }
                    
                }
                
                
                skip += skipCode[i];
                skip += takeCode[i];
            }
            Console.WriteLine(messsage);
        }
    }
}
