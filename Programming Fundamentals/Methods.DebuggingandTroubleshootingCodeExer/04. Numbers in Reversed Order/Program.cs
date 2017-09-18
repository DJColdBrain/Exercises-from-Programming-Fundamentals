using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _04.Numbers_in_Reversed_Order
{
    class Program
    {
        static void Main(string[] args)
        {

            string textToBeReverced = Console.ReadLine();
            Console.WriteLine(ReverceText(textToBeReverced));

        }
        static string ReverceText (string s)
        {
            string revercedText= "";

            while (s .Length > 0)
            {
                revercedText = revercedText + s.Remove(0, s.Length - 1);
                s = s.Remove(s.Length - 1, 1);
            }


            return revercedText;
        }
    }
}
