package BusinessLogicLayer.DataObjects.Menus.DrinkItems.NonAlcoholicDrinks.BottledWater500ml;

import BusinessLogicLayer.Abstractions.BottledWater500ml;

public class Valpre extends BottledWater500ml{
    
    @Override
    public String getItemName() {
        return "1 x 500ml Valpre Sparkling Water";
    }

    @Override
    public double getPrice() {
        return 9.0d;
    }
}
