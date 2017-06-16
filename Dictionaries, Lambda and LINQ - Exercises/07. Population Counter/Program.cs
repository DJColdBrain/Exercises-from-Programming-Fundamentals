
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
namespace _7.Population_Counter
{
    class Program
    {
        static void Main(string[] args)
        {
            var countries = new Dictionary<string, List<string>>();
            var cityData = new Dictionary<string, long>();
            var countryTotalPopulation = new Dictionary<string, long>();
            while (true)
            {
                var inputedInfo = Console.ReadLine()
                    .Split(new char[] { '|' }, StringSplitOptions.RemoveEmptyEntries)
                    .ToArray();
                if (inputedInfo[0] == "report")
                {
                    //call method or break your life your choise
                    break;
                }
                var city = inputedInfo[0];
                var country = inputedInfo[1];
                var cityPopulation = int.Parse(inputedInfo[2]);

                if (!countries.ContainsKey(country))
                {
                    countries.Add(country, new List<string>());
                }
                if (!cityData.ContainsKey(city))
                {
                    cityData.Add(city, 0);
                }
                if (!countryTotalPopulation.ContainsKey(country))
                {
                    countryTotalPopulation.Add(country, 0);
                }
                countryTotalPopulation[country] += cityPopulation; // total population of country
                countries[country].Add(city); //index country value city in list
                cityData[city] += cityPopulation; //index city value population
            }
            var countryTotalPopList = countryTotalPopulation.OrderByDescending(key => key.Value).ToList();


            foreach (var item in countryTotalPopList)
            {
                var country = item.Key;
                var countryPopulation = item.Value;
                Console.WriteLine($"{country} (total population: {countryPopulation})");
                var cityDataList = cityData.OrderByDescending(key => key.Value).ToList();
                foreach (var allCitiesCity in cityDataList)
                {
                    var citiesCity = allCitiesCity.Key;
                    foreach (var city in countries[country])
                    {
                        if (city == citiesCity)
                        {
                            Console.WriteLine($"=>{city}: {allCitiesCity.Value}");
                        }
                    }
                }

            }

        }
    }
}