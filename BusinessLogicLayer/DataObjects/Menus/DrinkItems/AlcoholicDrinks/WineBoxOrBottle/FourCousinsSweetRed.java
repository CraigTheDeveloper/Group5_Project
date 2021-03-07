package BusinessLogicLayer.DataObjects.Menus.DrinkItems.AlcoholicDrinks.WineBoxOrBottle;

import BusinessLogicLayer.Abstractions.WineBoxOrBottle;

public class FourCousinsSweetRed extends WineBoxOrBottle {
    
    @Override
    public String getItemName() {
        return "1.5l Four Cousins Sweet Red";
    }

    @Override
    public double getPrice() {
        return 90.0d;
    }
}
