using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApplication4
{
    class Program
    {
        static void Main(string[] args)
        {

            string a = int.Parse(Console.ReadLine()).ToString("0000");
            string b = int.Parse(Console.ReadLine()).ToString("00");
            string c = int.Parse(Console.ReadLine()).ToString("00");
            string d = int.Parse(Console.ReadLine()).ToString();
            string e = int.Parse(Console.ReadLine()).ToString("00");
            string f = int.Parse(Console.ReadLine()).ToString("00");
            int g = int.Parse(Console.ReadLine());
            int h = int.Parse(Console.ReadLine());
            int j = int.Parse(Console.ReadLine());


            string s = "B";
            string km = "";
            if (h < j)
                km = "portrait";
            else if (h > j)
                km = "landscape";
            else km = "square";
            if (g > 999)
            {
                g /= 1000;
                s = "KB";
            }
            if (g > 999)
            {
                g /= 1000;
                s = "MB";
            }
            if (g > 999)
            {
                g /= 1000;
                s = "GB";
            }


            Console.WriteLine($"Name: DSC_{a}.jpg");
            Console.WriteLine($"Date Taken: {b}/{c}/{d} {e}:{f}");
            Console.WriteLine($"Size: {g}{s}");
            Console.WriteLine($"Resolution: {h}x{j} ({km})");
        }
    }
}
