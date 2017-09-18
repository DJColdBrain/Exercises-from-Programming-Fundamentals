using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _02.Manipulate_Array
{
    class Program
    {
        static void Main(string[] args)
        {
            string[] array = Console.ReadLine().Split(' ');
            string[] comand = { " " };
            while(comand[0] != "END")
            {
                comand = Console.ReadLine().Split(' ');
                if (comand[0] == "END")
                {
                    break;
                }
                if (comand[0].CompareTo("Reverse") == 0)
                {
                    Reverce(array);
                }else
                if (comand[0].CompareTo("Distinct") == 0)
                {
                    string[] newArr = new string[1];
                    array = (string[])DestructRepeatWords(array).Clone();

                }else
                if (comand[0].CompareTo("Replace") == 0)
                {
                    Replace(array, int.Parse(comand[1]), comand[2]);
                }
                else
                {
                    Console.WriteLine("Invalid input!");
                }
            }
            Console.WriteLine(string.Join(", ", array));
        }
        static void Reverce(string[] array)
        {

            for (int i = 0; i < array.Length / 2; i++)
            {
                string startItem = array[i];
                array[i] = array[array.Length - i - 1];
                array[array.Length - i - 1] = startItem;
            }
        }
        static string[] DestructRepeatWords(string[] array)
        {
            int count = 0;
            for (int i = 0; i < array.Length - 1; i++)
            {
                for (int j = 1 + i; j < array.Length; j++)
                {
                    if (array[i] == array[j] && array[i] != "")
                    {
                        array[j] = "";
                        count++;
                    }
                }
            }
            string[] newArray = new string[array.Length - count];
            int cont = 0;
            for (int i = 0; i < newArray.Length; i++)
            {

                for (int j = i + cont; j < array.Length; j++)
                {
                    if (array[j] != "")
                    {
                        newArray[i] = array[j];
                        break;
                    }
                    else cont++;

                }
            }
            return (string[])newArray.Clone();

        }

        static void Replace(string[] array, int index, string text)
        {
            if (index > array.Length-1 || index< 0)
            {
                Console.WriteLine("Invalid input!");
            }else
            array[index] = text;
        }
    }
}
