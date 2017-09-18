using _08.Personal_Exception;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.Serialization;
using System.Text;
using System.Threading.Tasks;

namespace _08.Personal_Exception
{   [Serializable]
    public class NegativeNumberException : Exception
    {
       
        public NegativeNumberException()
          : base("My first exception is awesome!!!")
        {
            
        }
        protected NegativeNumberException(SerializationInfo info, StreamingContext ctxt) 
        : base(info, ctxt)
        { }

        

    }
}
    class Program
    {
        static void Main(string[] args)
        {
            while (true)
            {
            try
            {
                GetNumber();
            }
            catch (NegativeNumberException)
            {
                Console.WriteLine("My first exception is awesome!!!");
                break;
            }
            }
        }

    private static void GetNumber()
    {
       int x = int.Parse(Console.ReadLine());

        if (x< 0)
        {
            throw  new NegativeNumberException();
        }
        else
        {
            Console.WriteLine(x);
        }
    }
}

