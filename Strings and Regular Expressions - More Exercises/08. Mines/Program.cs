using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Text.RegularExpressions;
using System.Threading.Tasks;

namespace _08.Mines
{
    class Program
    {
        static void Main(string[] args)
        {
            var input = Console.ReadLine();

            var pattern = @"(\<(?<firstCharacter>\w)(?<secondCharacter>\w)\>)";
            var matches = Regex.Matches(input, pattern);

            var afterExplosions = new StringBuilder(input);

            foreach (Match match in matches)
            {
                var firstCharacter = char.Parse(match.Groups["firstCharacter"].Value);
                var secondCharacter = char.Parse(match.Groups["secondCharacter"].Value);

                var minePower = Math.Abs(firstCharacter - secondCharacter);

                var minefirstIndex = match.Groups["firstCharacter"].Index - 1;
                var mineSecondIndex = match.Groups["secondCharacter"].Index + 1;

                var leftFromMine = Math.Max(0, minefirstIndex - minePower);
                var rightFromMine = Math.Min(input.Length - 1, mineSecondIndex + minePower);

                for (int i = leftFromMine; i <= rightFromMine; i++)
                {
                    afterExplosions[i] = '_';
                }
            }

            Console.WriteLine(afterExplosions.ToString());
        }
    }
}
