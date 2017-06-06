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
            MasterNumber(n);

        }


        //This is bad code
        //For REFRACTURING

        static void MasterNumber (int num)
        {

            for (int i = 1; i <= num; i++)
            {

                bool isMaster = false;
                int master = i;

                int sum = 0;
                while (master > 0)
                {
                    sum += master % 10;
                    master /= 10;
                }

                master = i;
                if (sum % 7 ==0)
                {
                    while (master > 0)
                    {
                        if((master % 10) % 2 == 0)
                        {
                            isMaster = true;
                            break;
                        }
                        else
                        {
                            master /= 10;
                        }
                    }
                    master = i;
                    if (isMaster)
                    {
                        string stringMaster = master.ToString();
                        for (int g = 1; g <= master.ToString().Length/2; g++)
                        {
                            
                            
                            if (stringMaster.Remove(1, stringMaster.Length-1).CompareTo(stringMaster.Remove(0, stringMaster.Length -1)) == 0)
                            {
                                stringMaster = stringMaster.Remove(stringMaster.Length - 1, 1);
                                stringMaster = stringMaster.Remove(0, 1);
                            }
                            else
                            {
                                isMaster = false;
                                break;
                            }
                            
                        }
                    }


                }
                if (isMaster)
                {
                    Console.WriteLine(i);
                }

            }


        } 
    }
}
