using System;

namespace utspbo2
{
    class Program
    {
        static void Main(string[] args)
        {
            RetailItem [] item = new RetailItem[3];
            item[0] = new RetailItem("Jacket", 12, 59.95);
            item[1] = new RetailItem("Jeans", 40, 34.95);
            item[2] = new RetailItem("Shirt", 20, 24.95);
            Console.WriteLine("--------------------------------------------");
            Console.WriteLine("item\tDescription \tUnits of Hands\tPrice");
            Console.WriteLine("--------------------------------------------");
            for(int i=0; i < item.Length; i++)
            {
                Console.WriteLine("item " + (i+1) + "\t" + item[i].getDescription() + "\t\t" + item[i].getUnitofHands() + "\t\t" + item[i].getPrice());
            }
            Console.ReadLine();
        }
    }
}
