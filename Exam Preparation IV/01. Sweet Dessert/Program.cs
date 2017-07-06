using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _01.Sweet_Dessert
{
    class Program
    {
        static void Main(string[] args)
        {
            decimal initialMoney = decimal.Parse(Console.ReadLine());
            long guests = long.Parse(Console.ReadLine());
            decimal bananasPrice = decimal.Parse(Console.ReadLine());
            decimal eggsPrice = decimal.Parse(Console.ReadLine());
            decimal beriesPricePerKilo = decimal.Parse(Console.ReadLine());

            decimal setOfSixPrice = (4 * eggsPrice) + (2 * bananasPrice) + (beriesPricePerKilo / 5);
            long numberOfSets = guests / 6;
            if (guests% 6 != 0)
            {
                numberOfSets++;
            }

            decimal price = numberOfSets * setOfSixPrice;

            if (price <= initialMoney)
            {
                Console.WriteLine("Ivancho has enough money - it would cost {0:f2}lv.", price);
            }
            else
            {
                Console.WriteLine("Ivancho will have to withdraw money - he will need {0:f2}lv more.", price - initialMoney);
            }
        }
    }
}
