using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _04.Roli_The_Coder
{
    class Program
    {
        static void Main(string[] args)
        {
            //понеже ID-то се ползва само като уникален ключ към даден евент може да ползваш и string.
            //но и така е ок.
            var dicIdAndEventName = new Dictionary<int, string>();
            Dictionary<string, List<string>> data =
               new Dictionary<string, List<string>>();
            while (true)
            {
                var text = Console.ReadLine()
                    .Split(new[] { ' ', '\t', '\n', '\r' }, StringSplitOptions.RemoveEmptyEntries).ToList();
                text.RemoveAll(x => x == "");

                if (text[0] == "Time")
                {
                    break;
                }

                var id = int.Parse(text[0]);
                var eventName = text[1];
                var listParticipant = new List<string>();


                if (eventName[0] == '#')
                {
                    eventName = eventName.Remove(0, 1);
                    for (int i = 2; i < text.Count; i++)
                    {
                        if (text[i][0] == '@')
                        {
                            listParticipant.Add(text[i]);
                        }
                    }
                    if (dicIdAndEventName.ContainsKey(id) && dicIdAndEventName[id] != eventName)
                    {
                        continue;
                    }
                    if (!dicIdAndEventName.ContainsKey(id))
                    {
                        dicIdAndEventName[id] = eventName;

                        if (!data.ContainsKey(eventName))
                        {
                            data[eventName] = new List<string>();
                        }

                        foreach (var participant in listParticipant)
                        {
                            if (!data[eventName].Contains(participant))
                            {
                                data[eventName].Add(participant);
                            }
                        }
                    }
                    if (dicIdAndEventName.ContainsKey(id) && data.ContainsKey(eventName))
                    {
                        foreach (var participant in listParticipant)
                        {
                            if (!data[eventName].Contains(participant))
                            {
                                data[eventName].Add(participant);
                            }
                        }
                    }
                }
            }
            data = data.OrderByDescending(x => x.Value.Count).ThenBy(x => x.Key)
                .ToDictionary(x => x.Key, x => x.Value);
                foreach (var item in data)
                {
                    var participants = item.Value;
                    participants.Sort();
                    Console.WriteLine($"{item.Key} - {participants.Count}");
                    for (int i = 0; i < participants.Count; i++)
                    {
                        Console.WriteLine($"{participants[i]}");
                    }
                }

            }
        
    }
}
