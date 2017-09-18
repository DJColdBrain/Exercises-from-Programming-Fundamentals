using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _02.Vehicle_Catalogue
{   class Vehicles
    {
        public string Type { get; set; }
        public string Model { get; set; }
        public string Color { get; set; }
        public int Horsepowers { get; set; }

        public Vehicles(string type, string model, string color, string horsepowers)
        {
            if (type.ToLower().Equals("car"))
            {
                this.Type = "Car";
            }
            if (type.ToLower().Equals("truck"))
            {
                this.Type = "Truck";
            }

            this.Model = model;
            this.Color = color;
            this.Horsepowers = int.Parse(horsepowers);
        }
    }
    class Program
    {
        static void Main(string[] args)
        {
            List<Vehicles> vehicles = new List<Vehicles>();
            string[] info = Console.ReadLine().Split(' ');
            while (!info[0].Equals("End"))
            {
                Vehicles vehicle = new Vehicles(info[0], info[1], info[2], info[3]);
                vehicles.Add(vehicle);

                info = Console.ReadLine().Split(' ');
            }
            string model = Console.ReadLine();
            while (!model.Equals("Close the Catalogue"))
            {
                List<Vehicles> vehiclesToPrint = vehicles.Where(x => x.Model == model).ToList();
                Console.WriteLine($"Type: {vehiclesToPrint[0].Type}");
                Console.WriteLine($"Model: {vehiclesToPrint[0].Model}");
                Console.WriteLine($"Color: {vehiclesToPrint[0].Color}");
                Console.WriteLine($"Horsepower: {vehiclesToPrint[0].Horsepowers}");
                model = Console.ReadLine();
            }
            List<Vehicles> carsHorsepowersToPrin = vehicles.Where(x => x.Type == "Car").ToList();
            List<Vehicles> trucsHorsepowersToPrin = vehicles.Where(x => x.Type == "Truck").ToList();

            if (carsHorsepowersToPrin.Count>0)
            {
                Console.WriteLine("Cars have average horsepower of: {0:f2}.", carsHorsepowersToPrin.Average(x => x.Horsepowers));
            }
            else
            {
                Console.WriteLine("Cars have average horsepower of: 0.00.");
            }
            if (trucsHorsepowersToPrin.Count > 0)
            {
                Console.WriteLine("Trucks have average horsepower of: {0:f2}.", trucsHorsepowersToPrin.Average(x => x.Horsepowers));
            }
            else
            {
                Console.WriteLine("Trucks have average horsepower of: 0.00.");
            }
           
        }
    }
}
