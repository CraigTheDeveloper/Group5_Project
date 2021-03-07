package BusinessLogicLayer.DataObjects.Menus.DrinkItems.NonAlcoholicDrinks.BottledWater500ml;

import BusinessLogicLayer.Abstractions.BottledWater500ml;

public class Bonaqua extends BottledWater500ml {
    
    @Override
    public String getItemName() {
        return "1 x 500ml Bonaqua Still Water Bottle";
    }

    @Override
    public double getPrice() {
        return 7.0d;
    }
}
