package BusinessLogicLayer.DataObjects.Menus.FoodItems.Appetizers;

import BusinessLogicLayer.Abstractions.Appetizer;

public class MiniSausages extends Appetizer {

    @Override
    public String getItemName() {
        return " 6 Mini Sausages with Miss Rachael's secret sauce.";
    }

    @Override
    public double getPrice() {
        return 15.0d;
    }
    
}