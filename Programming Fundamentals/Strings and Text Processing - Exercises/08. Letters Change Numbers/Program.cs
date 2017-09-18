using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _08.Letters_Change_Numbers
{
   
    class Program
    {
        static bool IsUpper( string value)
        {
            // Consider string to be uppercase if it has no lowercase letters.
            for (int i = 0; i < value.Length; i++)
            {
                if (char.IsLower(value[i]))
                {
                    return false;
                }
            }
            return true;
        }

        static bool IsLower( string value)
        {
            // Consider string to be lowercase if it has no uppercase letters.
            for (int i = 0; i < value.Length; i++)
            {
                if (char.IsUpper(value[i]))
                {
                    return false;
                }
            }
            return true;
        }
        static void Main(string[] args)
        {
            string[] lettersAndNumbers = Console.ReadLine().Split(new char[] { ' ' , '\t' }, StringSplitOptions.RemoveEmptyEntries);

            decimal sum = 0 ;
            for (int i = 0; i < lettersAndNumbers.Length; i++)
            {
                decimal num = 0;
                string word = lettersAndNumbers[i];
                string number = "";
                for (int j = 1; j < word.Length-1; j++)
                {
                    number += word[j];
                }
                num = decimal.Parse(number);
                if (IsUpper(word[0].ToString()))
                {
                    int l = Math.Abs('A' - word[0] ) + 1;
                    num /= l;
                }
                else
                {
                    int l = Math.Abs('a' - word[0] ) + 1;
                    num *= l;
                }
                if (IsUpper(word[word.Length-1].ToString()))
                {
                    int l = Math.Abs('A' - word[word.Length - 1]) + 1;
                    num -= l;
                }
                else
                {
                    int l = Math.Abs('a' - word[word.Length - 1]) +1;
                    num += l;
                }
                sum += num;
            }
            Console.WriteLine("{0:f2}", sum);

        }
    }
}
