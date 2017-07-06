using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _02.Array_Manipulator
{
    class Program
    {
        static void Main(string[] args)
        {
            int[] array = Console.ReadLine().Split(' ').Select(int.Parse).ToArray();
            while (true)
            {
                string[] comands = Console.ReadLine().Split(' ');
                if (comands[0].Equals("end"))
                {
                    break;
                }

                switch (comands[0])
                {
                    case "exchange":
                        int index = int.Parse(comands[1]);
                        if (index<0 || index >= array.Length)
                        {
                            Console.WriteLine("Invalid index");
                            continue;
                        }
                        index++;

                        int[] newArr = new int[index ];
                        for (int i = 0; i < newArr.Length; i++)
                        {
                            newArr[i] = array[i];
                        }
                        int[] backArr = new int[array.Length];
                        for (int i = 0; i < array.Length- index; i++)
                        {
                            backArr[i] = array[i+index];
                        }
                        for (int i = array.Length - index; i < array.Length; i++)
                        {
                            backArr[i] = newArr[i - (array.Length - index)];
                        }
                        backArr.CopyTo(array, 0);

                        break;
                    case "max":
                        if (comands[1].Equals("odd"))
                        {
                            int odd = -1;
                            int lastOdd = int.MinValue;
                            for (int i = 0; i < array.Length; i++)
                            {
                                int num = array[i];
                                if (num% 2 ==1 && num >= lastOdd)
                                {
                                    lastOdd = num;
                                    odd = i;
                                }
                            }
                            if (odd != -1)
                            {
                                Console.WriteLine(odd);

                            }
                            else
                            {
                                Console.WriteLine("No matches");
                            }
                            
                        }
                        else if (comands[1].Equals("even"))
                        {
                            int even = -1;
                            int lastEven = int.MinValue;
                            for (int i = 0; i < array.Length; i++)
                            {
                                int num = array[i];
                                if (num % 2 == 0 && num >= lastEven)
                                {
                                    lastEven = num;
                                    even = i;
                                }
                            }
                            if (even != -1)
                            {
                                Console.WriteLine(even);

                            }
                            else
                            {
                                Console.WriteLine("No matches");
                            }
                        }
                        break;
                    case "min":
                        if (comands[1].Equals("odd"))
                        {
                            int odd = -1;
                            int lastOdd = int.MaxValue;
                            for (int i = 0; i < array.Length; i++)
                            {
                                int num = array[i];
                                if (num % 2 == 1 && num <= lastOdd)
                                {
                                    lastOdd = num;
                                    odd = i;
                                }
                            }
                            if (odd != -1)
                            {
                                Console.WriteLine(odd);

                            }
                            else
                            {
                                Console.WriteLine("No matches");
                            }

                        }
                        else if (comands[1].Equals("even"))
                        {
                            int even = -1;
                            int lastEven = int.MaxValue;
                            for (int i = 0; i < array.Length; i++)
                            {
                                int num = array[i];
                                if (num % 2 == 0 && num <= lastEven)
                                {
                                    lastEven = num;
                                    even = i;
                                }
                            }
                            if (even != -1)
                            {
                                Console.WriteLine(even);

                            }
                            else
                            {
                                Console.WriteLine("No matches");
                            }
                        }
                        break;
                    case "first":
                        int cout = int.Parse(comands[1]);
                        if (cout <= 0 || cout > array.Length)
                        {
                            Console.WriteLine("Invalid count");
                            continue;
                        }
                        int c = 0;
                        List<int> numbers = new List<int>();
                        if (comands[2].Equals("odd"))
                        {
                            for (int i = 0; i < array.Length; i++)
                            {
                                if (array[i] % 2 == 1)
                                {
                                    c++;
                                    numbers.Add(array[i]);
                                }
                                if (c == cout)
                                {
                                    break;
                                }
                            }
                        }
                        if (comands[2].Equals("even"))
                        {
                            for (int i = 0; i < array.Length; i++)
                            {
                                if (array[i] % 2 == 0)
                                {
                                    c++;
                                    numbers.Add(array[i]);
                                }
                                if (c == cout)
                                {
                                    break;
                                }
                            }
                        }


                        Console.WriteLine("[{0}]", string.Join(", ", numbers));


                        break;
                    case "last":
                        int count = int.Parse(comands[1]);
                        if (count <= 0 || count > array.Length)
                        {
                            Console.WriteLine("Invalid count");
                            continue;
                        }
                        int n = 0;
                        List<int> lasts = new List<int>();
                        if (comands[2].Equals("odd"))
                        {
                            for (int i = array.Length-1; i >= 0; i--)
                            {
                                if (array[i] % 2 == 1)
                                {
                                    n++;
                                    lasts.Add(array[i]);
                                }
                                if (n == count)
                                {
                                    break;
                                }
                            }
                        }
                        else if (comands[2].Equals("even"))
                        {
                            for (int i = 0; i < array.Length; i++)
                            {
                                if (array[i] % 2 == 0)
                                {
                                    n++;
                                    lasts.Add(array[i]);
                                }
                                if (n == count)
                                {
                                    break;
                                }
                            }
                        }
                        lasts.Reverse();
                        Console.WriteLine("[{0}]", string.Join(", ", lasts));
                        break;

                }
            }
            Console.WriteLine("[{0}]",string.Join(", ", array));
        }
    }
}
