using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _04.Tourist_Information
{
    class Program
    {
        static void Main(string[] args)
        {
            String type = Console.ReadLine();
            double initialValue = double.Parse(Console.ReadLine());
            String convertedUnit = "";
            double value = initialValue;
            switch (type){
                case "miles":
                    value *= 1.6;
                    convertedUnit = "kilometers";
                    break;
                case "inches":
                    value *= 2.54;
                    convertedUnit = "centimeters";
                    break;
                case "feet":
                    value *= 30;
                    convertedUnit = "centimeters";
                    break;
                case "yards":
                    value *= 0.91;
                    convertedUnit = "meters";
                    break;
                case "gallons":
                    value *= 3.8;
                    convertedUnit = "liters";
                    break;



            }
            Console.WriteLine($"{initialValue} {type} = {value:f2} {convertedUnit}");
        }
    }
}
