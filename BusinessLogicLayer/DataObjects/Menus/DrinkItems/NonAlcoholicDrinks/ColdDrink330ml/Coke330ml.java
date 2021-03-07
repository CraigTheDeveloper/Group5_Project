package BusinessLogicLayer.DataObjects.Menus.DrinkItems.NonAlcoholicDrinks.ColdDrink330ml;

import BusinessLogicLayer.Abstractions.ColdDrink330ml;

public class Coke330ml extends ColdDrink330ml{
    
    @Override
    public String getItemName() {
        return "6 x 330ml Coca Cola Soft Drink Can";
    }

    @Override
    public double getPrice() {
        return 52.0d;
    }
}
