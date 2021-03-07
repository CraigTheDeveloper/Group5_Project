package BusinessLogicLayer.DataObjects.Menus.DrinkItems.AlcoholicDrinks.WineBoxOrBottle;

import BusinessLogicLayer.Abstractions.WineBoxOrBottle;

public class NamaquaWhite extends WineBoxOrBottle{
    
    @Override
    public String getItemName() {
        return "5l Namaqua Sweet White";
    }

    @Override
    public double getPrice() {
        return 159.0d;
    }
}
