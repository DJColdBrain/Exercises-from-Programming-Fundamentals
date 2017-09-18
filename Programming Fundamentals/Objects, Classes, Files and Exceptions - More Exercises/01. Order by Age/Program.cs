using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _01.Order_by_Age
{
    class Student
    {
        public string Name { get; set; }
        public string Id { get; set; }
        public int Age { get; set; }

        public Student(string name, string id ,string age)
        {
            this.Name = name;
            this.Id = id;
            this.Age = int.Parse(age);
        }
    }
    class Program
    {
        static void Main(string[] args)
        {
            
            List<Student> students = new List<Student>();
            string[] info = Console.ReadLine().Split(' ');
            while (!info[0].Equals("End"))
            {
                Student student = new Student(info[0], info[1], info[2]);
                students.Add(student);

                students = students.OrderBy(x => x.Age).ToList();
                info = Console.ReadLine().Split(' ');
            }
            
            foreach (var student in students)
            {
                Console.WriteLine($"{student.Name} with ID: {student.Id} is {student.Age} years old.");
            }
        }
    }
}
