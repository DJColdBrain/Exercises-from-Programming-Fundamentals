using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.IO;
using Microsoft.Office.Interop.Excel;


namespace _06.EXCELlent_Knowledge
{
    class Program
    {
        static void Main(string[] args)
        {
            Application xlApp = new Application();
            Workbook xlWorkbook = xlApp.Workbooks.Open(@"D:\GIT\Exercises-from-Programming-Fundamentals\Objects, Classes, Files and Exceptions - More Exercises\06. EXCELlent Knowledge\bin\Debug\sample_table.xlsx");
            _Worksheet worksheet = xlWorkbook.Sheets[1];
            Range xlRange = worksheet.UsedRange;

            for (int i = 1; i <= 5; i++)
            {
                for (int j = 1; j <= 5; j++)
                {
                    if (j == 1 && i!= 1)
                    {
                        Console.WriteLine();
                    }
                    Console.Write(xlRange.Cells[i,j].Value + "|");
                    
                }
            }
            Console.WriteLine();


            
        }
    }
}
