using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _12.Master_Number
{
    class Program
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());
            for (int i = 1; i <= n; i++)
            {
                if (IsHavingEvenNum(i) && IsSumEqualSeven(i))
                {
                    if (IsPolynom(i))
                    {
                        Console.WriteLine(i);
                    }
                    
                }
            }

        }         
        static bool IsSumEqualSeven (int num)
        {
            int sum = 0;
            while (num > 0)
            {
                sum += num % 10;
                num /= 10;
            }            
            if (sum % 7 == 0)
            {
                return true;
            }else
                return false;
        }
        static bool  IsHavingEvenNum (int num)
        {
            while (num > 0)
            {
                if ((num % 10) % 2 == 0)
                {
                    return true;
                }
                else
                {
                    num /= 10;
                }                
            }
            return false;
        }
        static bool IsPolynom (int num)
        {
            string stringMaster = num.ToString();
            for (int g = 1; g <= num.ToString().Length / 2; g++)
            {
                if (stringMaster.Remove(1, stringMaster.Length - 1).CompareTo(stringMaster.Remove(0, stringMaster.Length - 1)) == 0)
                {
                    stringMaster = stringMaster.Remove(stringMaster.Length - 1, 1);
                    stringMaster = stringMaster.Remove(0, 1);
                }
                else
                {
                    return false;
                }
            }
            return true;
        }
    }
}
