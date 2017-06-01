using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _19.Thea_The_Photographer
{
    class Program
    {
        static void Main(string[] args)
        {

            long numberOfPictures = int.Parse(Console.ReadLine());
            long filterTimeSec = int.Parse(Console.ReadLine());
                byte percentegeGood = byte.Parse(Console.ReadLine());
            long secToUpload = int.Parse(Console.ReadLine());
            
                
                long usefulPictures = (long)Math.Ceiling((decimal)(numberOfPictures * percentegeGood / 100.0f));
                long totalTime = (numberOfPictures * filterTimeSec) + (usefulPictures * secToUpload);
            
                TimeSpan time = TimeSpan.FromSeconds(totalTime);
                string timeInString = string.Format("{0:d\\:hh\\:mm\\:ss}", time);

                Console.WriteLine(timeInString);
            
        }
    }
}
