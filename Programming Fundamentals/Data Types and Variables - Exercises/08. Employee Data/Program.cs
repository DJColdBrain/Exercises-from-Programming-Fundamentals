using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _08.Employee_Data
{
    class Program
    {
        static void Main(string[] args)
        {
            String firstName = Console.ReadLine();
            String lastName = Console.ReadLine();
            byte age = byte.Parse(Console.ReadLine());
            char gender = char.Parse(Console.ReadLine());
            long personalID = long.Parse(Console.ReadLine());
            int unicEmployeeID = int.Parse(Console.ReadLine());


            Console.WriteLine(
$@"First name: {firstName }
Last name: {lastName }
Age: {age}
Gender: {gender }
Personal ID: {personalID }
Unique Employee number: {unicEmployeeID }"
);


        }
    }
}
