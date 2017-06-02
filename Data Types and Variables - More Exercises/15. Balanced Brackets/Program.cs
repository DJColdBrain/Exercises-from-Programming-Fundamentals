using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _15.Balanced_Brackets
{
    class Program
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());
            String lastBracket = "";
            bool isBalanced = false ;


            string b1 = "";
            string b2 = "";
          
            bool k = true;
            for (int i = 0; i < n; i++)

                
            {
                String str = Console.ReadLine();
                

                if (str != "(" && str != ")")
                {

                }else
                {
                   
                    if (str == lastBracket)
                    {
                        isBalanced = false;
                        break;
                    }
                    if (k)
                    {
                       // b1 = str;
                       // if (b1 == "(") b2 = ")";
                      //  else b2 = "(";
                        k = false;
                        isBalanced = false;
                    }
                    else
                    {
                        k = true;
                        isBalanced = true;
                    }
                    lastBracket = str;

                }


            }

            if (isBalanced)
            {
                Console.WriteLine("BALANCED");
            }
            else Console.WriteLine("UNBALANCED");

        }
    }
}
