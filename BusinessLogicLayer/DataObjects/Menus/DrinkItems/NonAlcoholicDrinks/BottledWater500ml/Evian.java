package BusinessLogicLayer.DataObjects.Menus.DrinkItems.NonAlcoholicDrinks.BottledWater500ml;

import BusinessLogicLayer.Abstractions.BottledWater500ml;

public class Evian extends BottledWater500ml{
    
    @Override
    public String getItemName() {
        return "1 x 500ml Evian Natural Spring Water";
    }

    @Override
    public double getPrice() {
        return 23.0d;
    }
}
