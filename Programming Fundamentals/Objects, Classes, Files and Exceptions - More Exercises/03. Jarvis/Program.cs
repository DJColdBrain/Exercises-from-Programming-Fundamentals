using System;
using System.Collections.Generic;
using System.Linq;
using System.Numerics;
using System.Text;
using System.Threading.Tasks;

namespace _03.Jarvis
{   class Arm
    {
        public long EnergyConsumption { get; set; }
        public int ArmReachDistance { get; set; }
        public int CountOfFingers { get; set; }

        public Arm (string energy, string armReach , string fingerCount)
        {
            this.EnergyConsumption = long.Parse(energy);
            this.ArmReachDistance = int.Parse(armReach);
            this.CountOfFingers = int.Parse(fingerCount);
        }
    }
    class Leg
    {
        public long EnergyConsumption { get; set; }
        public int Strenght { get; set; }
        public int Speed { get; set; }

        public Leg(string energy, string strenght, string speed)
        {
            this.EnergyConsumption = long.Parse(energy);
            this.Strenght = int.Parse(strenght);
            this.Speed = int.Parse(speed);
        }
    }
    class Torso
    {
        public long EnergyConsumption { get; set; }
        public double ProcessorSize { get; set; }
        public string HousingMatherial { get; set; }

        public Torso(string energy, string proccesorSize, string matherial)
        {
            this.EnergyConsumption = long.Parse(energy);
            this.ProcessorSize = double.Parse(proccesorSize);
            this.HousingMatherial = matherial;
        }
    }
    class Head
    {
        public long EnergyConsumption { get; set; }
        public int Iq { get; set; }
        public string SkinMatherial { get; set; }

        public Head(string energy, string iq, string matherial)
        {
            this.EnergyConsumption = long.Parse(energy);
            this.Iq = int.Parse(iq);
            this.SkinMatherial = matherial;
        }
    }
    class Program
    {
        static void Main(string[] args)
        {

            BigInteger maxEnergy = BigInteger.Parse(Console.ReadLine());

            string[] parts = Console.ReadLine().Split(' ');

            Head[] head = new Head[1];
            Torso[] torso = new Torso[1];
            Arm[] arms = new Arm[2];
            Leg[] legs = new Leg[2];

            while (!parts[0].Equals("Assemble!"))
            {
                switch (parts[0])
                {
                    case "Head":
                        Head newHead = new Head(parts[1], parts[2], parts[3]);
                        if (head[0] == null || head[0].EnergyConsumption > newHead.EnergyConsumption)
                        {
                            head[0] = newHead;
                        }

                        break;
                    case "Torso":
                        Torso newTorso = new Torso(parts[1], parts[2], parts[3]);
                        if (torso[0] == null || torso[0].EnergyConsumption > newTorso.EnergyConsumption)
                        {
                            torso[0] = newTorso;
                        }
                        break;
                    case "Arm":
                        Arm newArm = new Arm(parts[1], parts[2], parts[3]);
                        if (arms[0] == null)
                        {
                            arms[0] = newArm;

                        }
                        else if (arms[1] == null)
                        {
                            arms[1] = newArm;
                        }
                        else
                            for (int i = 0; i < arms.Length; i++)
                            {
                                if (arms[i].EnergyConsumption > newArm.EnergyConsumption)
                                {
                                    arms[i] = newArm;
                                    break;
                                }
                            }
                        break;
                    case "Leg":
                        Leg newLeg = new Leg(parts[1], parts[2], parts[3]);

                        if (legs[0] == null)
                        {
                            legs[0] = newLeg;

                        }
                        else if (legs[1] == null)
                        {
                            legs[1] = newLeg;
                        }
                        else
                            for (int i = 0; i < legs.Length; i++)
                            {
                                if (legs[i].EnergyConsumption > newLeg.EnergyConsumption)
                                {
                                    legs[i] = newLeg;
                                    break;
                                }
                            }

                        break;
                }
                parts = Console.ReadLine().Split(' ');
            }

            if (arms[1] == null || legs[1] == null || head[0] == null || torso[0] == null)
            {
                Console.WriteLine("We need more parts!");
            }
            else {
                BigInteger energy = arms.Sum(x => x.EnergyConsumption) + legs.Sum(x => x.EnergyConsumption)
                    + torso[0].EnergyConsumption + head[0].EnergyConsumption;
            if (maxEnergy <  energy)
            {
                Console.WriteLine("We need more power!");
            }
            else
            {
                arms = arms.OrderBy(x => x.EnergyConsumption).ToArray();
                legs = legs.OrderBy(x => x.EnergyConsumption).ToArray();
                Console.WriteLine($@"Jarvis:
#Head:
###Energy consumption: {head[0].EnergyConsumption}
###IQ: {head[0].Iq}
###Skin material: {head[0].SkinMatherial}
#Torso:
###Energy consumption: {torso[0].EnergyConsumption}
###Processor size: {torso[0].ProcessorSize:f1}
###Corpus material: {torso[0].HousingMatherial}
#Arm:
###Energy consumption: {arms[0].EnergyConsumption}
###Reach: {arms[0].ArmReachDistance}
###Fingers: {arms[0].CountOfFingers}
#Arm:
###Energy consumption: {arms[1].EnergyConsumption}
###Reach: {arms[1].ArmReachDistance}
###Fingers: {arms[1].CountOfFingers}
#Leg:
###Energy consumption: {legs[0].EnergyConsumption}
###Strength: {legs[0].Strenght}
###Speed: {legs[0].Speed}
#Leg:
###Energy consumption: {legs[1].EnergyConsumption}
###Strength: {legs[1].Strenght}
###Speed: {legs[1].Speed}");
            }

        }

        }
    }
}
