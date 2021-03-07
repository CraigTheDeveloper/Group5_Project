package BusinessLogicLayer.DataObjects.Menus.DrinkItems.NonAlcoholicDrinks.ColdDrink330ml;

import BusinessLogicLayer.Abstractions.ColdDrink330ml;

public class Sprite330ml extends ColdDrink330ml{
    
    @Override
    public String getItemName() {
        return "6 x 330ml Sprite Can";
    }

    @Override
    public double getPrice() {
        return 59.0d;
    }
}
