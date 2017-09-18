using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _02.Email_me
{
    class Program
    {
        static void Main(string[] args)
        {
            var email = Console.ReadLine()
            .Split(new[] { '@' }, StringSplitOptions.RemoveEmptyEntries);

            var firstPartSum = email
                .First()
                .Sum(c => c);

            var secondPartSum = email
                .Last()
                .Sum(c => c);

            var subtraction = secondPartSum - firstPartSum;

            Console.WriteLine(subtraction <= 0 ? "Call her!" : "She is not the one.");
        }
    }
}
