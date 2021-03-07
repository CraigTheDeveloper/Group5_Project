package BusinessLogicLayer.DataObjects.Menus.DrinkItems.AlcoholicDrinks.WineBoxOrBottle;

import BusinessLogicLayer.Abstractions.WineBoxOrBottle;

public class NederbergRose extends WineBoxOrBottle {
    
    @Override
    public String getItemName() {
        return "1 x 750ml Nederburg Rosé Wine Bottle";
    }

    @Override
    public double getPrice() {
        return 49.0d;
    }
}
