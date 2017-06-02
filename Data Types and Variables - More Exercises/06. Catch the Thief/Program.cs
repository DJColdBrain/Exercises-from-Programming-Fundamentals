﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _06.Catch_the_Thief
{
    class Program
    {
        static void Main(string[] args)
        {
            String type = Console.ReadLine();
            int n = int.Parse(Console.ReadLine());

            long thiefID = long.MinValue;

            for (int i = 0; i < n; i++)
            {
                long ID = long.Parse(Console.ReadLine());

                switch (type)
                {
                    case "sbyte":
                        if (ID > thiefID && ID <= sbyte.MaxValue && ID >= sbyte.MinValue)
                            thiefID = ID;

                        break;
                    case "int":
                        if (ID > thiefID && ID <= int.MaxValue && ID >= int.MinValue)
                            thiefID = ID;
                        break;
                    case "long":
                        if (ID > thiefID && ID <= long.MaxValue && ID >= long.MinValue)
                            thiefID = ID;
                        break;

                }
                
            }
            Console.WriteLine(thiefID);


        }
    }
}
