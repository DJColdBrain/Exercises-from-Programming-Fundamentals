using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _03.Immune_System
{
    class Program
    {
        static void Main(string[] args)
        {
            int HELAT = int.Parse(Console.ReadLine());
            int immuneSystemHealt = HELAT;
            string virusName = Console.ReadLine();
            List<string> virusList = new List<string>();
            while (!virusName.Equals("end"))
            {
                
                int strenght  = CalculatePower(virusName, virusList);
                int timeToDefeat = virusName.Length * strenght;
                
                
                if (virusList.Contains(virusName))
                {
                    timeToDefeat = timeToDefeat / 3;
                }
                else
                {
                    virusList.Add(virusName);
                }
                TimeSpan time = TimeSpan.FromSeconds(timeToDefeat);
                int mins = time.Minutes + time.Hours * 60;
                immuneSystemHealt -= timeToDefeat;
                if (immuneSystemHealt > 0)
                {
                    Console.WriteLine("{0} defeated in {1}m {2}s.", virusName, mins, time.Seconds);
                    Console.WriteLine("Remaining health: {0}", immuneSystemHealt);
                }
                else
                {
                    Console.WriteLine("Immune System Defeated.");
                    break;
                }
                immuneSystemHealt += immuneSystemHealt  * 20/100;
                if (immuneSystemHealt > HELAT)
                {
                    immuneSystemHealt = HELAT;
                }

                virusName = Console.ReadLine();

            }
            if (virusName.Equals("end"))
            {
                Console.WriteLine("Final Health: {0}", immuneSystemHealt);
            }
           
        }
        static int CalculatePower(string name, List<string> virusList)
        {
            char[] powerCalculator = name.ToCharArray();
            int strenght = 0;
            for (int i = 0; i < name.Length; i++)
            {
                strenght += powerCalculator[i];
            }
            strenght = strenght / 3;
            int timeToDefeat = strenght * name.Length;

            if (virusList.Contains(name))
            {
                timeToDefeat = timeToDefeat / 3;
            }

            
            Console.WriteLine("Virus {0}: {1} => {2} seconds", name, strenght,timeToDefeat );
            return strenght;
        }
    }
}
