package ServerSide.BusinessLogicLayer.DataObjects.Menus.FoodItems.Appetizers;

import ServerSide.BusinessLogicLayer.Abstractions.Appetizer;

public class ChickenWings extends Appetizer {

    @Override
    public String getItemName() {
        return "Portion of 4 chicken wings";
    }

    @Override
    public double getPrice() {
        return 30.0d;
    }
    
}