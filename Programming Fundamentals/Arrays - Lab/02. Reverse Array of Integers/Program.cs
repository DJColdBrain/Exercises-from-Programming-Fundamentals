using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _02.Reverse_Array_of_Integers
{
    class Program
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());
            int[] arrayToBeReverced = new int[n];
            for (int i = 0; i < n; i++)
            {
                int num = int.Parse(Console.ReadLine());
                arrayToBeReverced[i] = num;

            }
            for (int i = n-1; i >= 0; i--)
            {
                Console.Write(arrayToBeReverced[i]+" ");
            }

        }
    }
}
