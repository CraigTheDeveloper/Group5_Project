package BusinessLogicLayer.DataObjects.Menus.FoodItems.Appetizers;

import BusinessLogicLayer.Abstractions.Appetizer;

public class GarlicBread extends Appetizer {

    @Override
    public String getItemName() {
        return "Garlic Bread";
    }

    @Override
    public double getPrice() {
        return 25.0d;
    }
    
}
