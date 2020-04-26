using System;
using System.Collections.Generic;
using System.Text;

namespace utspbo2
{
    class RetailItem
    {
        private string Description;
        private int UnitOfHands;
        private double Price;
        public void setDescription(string description)
        {
            this.Description = description;
        }
        public string getDescription()
        {
            return this.Description;
        }
        public void setUnitofHands(int unitofhands)
        {
            this.UnitOfHands = unitofhands;
        }
        public int getUnitofHands()
        {
            return this.UnitOfHands;
        }
        public void serPrice(double price)
        {
            this.Price = price;
        }
        public double getPrice()
        {
            return this.Price;
        }
        public RetailItem(string description, int unit, double price)
        {
            this.Description = description;
            this.UnitOfHands = unit;
            this.Price = price;
        }
    }
}
