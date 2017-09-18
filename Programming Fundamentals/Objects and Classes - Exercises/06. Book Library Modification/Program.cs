using System;
using System.Collections.Generic;
using System.Globalization;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Numerics;

namespace MyProgram
{
    class Program
    {
        static void Main(string[] args)
        {
            var lib = ReadAllBooks();
            var books = lib.Books;

            var dict = new Dictionary<string, DateTime>();
            string inn = Console.ReadLine();
            DateTime date = DateTime.ParseExact(inn, "d.M.yyyy", CultureInfo.InvariantCulture);

            foreach (var item in books)
            {
                var tit = item.title;
                var relD = item.relDate;
                if (!dict.ContainsKey(tit)) dict.Add(tit, relD);
                else dict[tit] = relD;
            }

            foreach (var item in dict.OrderBy(x => x.Value).ThenBy(y => y.Key))
            {
                var D = item.Value.Date;
                if (item.Value > date) Console.WriteLine("{0} -> {1:d.MM.yyyy}", item.Key, D);
            }
        }
        static Book ReadBook()
        {
            var book = new Book();
            string[] args = Console.ReadLine().Split(' ');
            book.title = args[0];
            book.relDate = DateTime.ParseExact(args[3], "d.M.yyyy", CultureInfo.InvariantCulture);
            return book;
        }
        static Library ReadAllBooks()
        {
            var libraray = new Library();
            libraray.Books = new List<Book>();
            int n = int.Parse(Console.ReadLine());
            for (int i = 0; i < n; i++)
            {
                var book = ReadBook();
                libraray.Books.Add(book);
            }
            return libraray;
        }
    }
    class Book
    {
        public string title { get; set; }
        public string author { get; set; }
        public string publisher { get; set; }
        public DateTime relDate { get; set; }
        public string ISBN { get; set; }
        public decimal price { get; set; }
    }
    class Library
    {
        public string Name { get; set; }
        public List<Book> Books { get; set; }
    }
}