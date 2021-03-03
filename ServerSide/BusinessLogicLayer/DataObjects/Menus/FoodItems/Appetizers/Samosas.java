package ServerSide.BusinessLogicLayer.DataObjects.Menus.FoodItems.Appetizers;

import ServerSide.BusinessLogicLayer.Abstractions.Appetizer;

public class Samosas extends Appetizer {

    @Override
    public String getItemName() {
        return "4 Surprise Samosas";
    }

    @Override
    public double getPrice() {
        return 20.0d;
    }
    
}