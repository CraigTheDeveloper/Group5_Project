package BusinessLogicLayer.DataObjects.Menus.DrinkItems.NonAlcoholicDrinks.ColdDrink2Litre;

import BusinessLogicLayer.Abstractions.ColdDrink2Litre;

public class CokeZero2Litre extends ColdDrink2Litre{
 
    @Override
    public String getItemName() {
        return "1 x 2.25l Coca-cola Zero";
    }

    @Override
    public double getPrice() {
        return 21.0d;
    }
}
