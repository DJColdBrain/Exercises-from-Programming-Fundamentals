using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _04.Average_Grades
{
    class Student
    {

        public string Name { get; set; }
        public double[] Grades { get; set; }
        public double Average { get {
                return Grades.Average();
            }
        }

       

    }
    class Program
    {
        static void Main(string[] args)
        {

            List<Student> students = new List<Student>();
            int n = int.Parse(Console.ReadLine());
            for (int i = 0; i < n; i++)
            {
                string[] student = Console.ReadLine().Split(' ').ToArray();
                string name = student[0];
                double[] grades = new double[student.Length-1];
                for (int j = 1; j < student.Length ; j++)
                {
                    grades[j-1] = double.Parse(student[j]);
                }
                Student person = new Student {Name = name, Grades = grades };
                students.Add(person);
            }

           students =  students.Where(x => x.Average >=5).OrderBy(x => x.Name).ThenBy(x => -x.Average).ToList();
            foreach (var student in students)
            {
                
                    Console.WriteLine("{0} -> {1:f2}", student.Name, student.Average);
                
               
            }

        }
    }
}
    


