package BusinessLogicLayer.DataObjects.Menus.DrinkItems.NonAlcoholicDrinks.ColdDrink2Litre;

import BusinessLogicLayer.Abstractions.ColdDrink2Litre;

public class FantaOrange2Litre extends ColdDrink2Litre{
    
    @Override
    public String getItemName() {
        return "1 x 2l Fanta Orange Plastic Bottle";
    }

    @Override
    public double getPrice() {
        return 21.0d;
    }
}
