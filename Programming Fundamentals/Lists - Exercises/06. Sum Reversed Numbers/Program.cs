using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _06.Sum_Reversed_Numbers
{
    class Program
    {
        static void Main(string[] args)
        {

            int[] arr = Console.ReadLine().Split(' ').Select(int.Parse).ToArray();

            for (int i = 0; i < arr.Length; i++)
            {
                int currentNum = arr[i];
                var reversedNumStr = currentNum.ToString();
                var reversedNumArr = reversedNumStr.Reverse().ToArray();
                var reversedNum = new string(reversedNumArr);

                arr[i] = int.Parse(reversedNum);
            }
            Console.WriteLine(arr.Sum());
        }
    }
}
