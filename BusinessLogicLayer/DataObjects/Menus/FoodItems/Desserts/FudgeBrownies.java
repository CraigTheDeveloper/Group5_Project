package BusinessLogicLayer.DataObjects.Menus.FoodItems.Desserts;

import BusinessLogicLayer.Abstractions.Dessert;

public class FudgeBrownies extends Dessert {

    @Override
    public String getItemName() {
        return "Fudge Brownie";
    }

    @Override
    public double getPrice() {
        return 24.99;
    }

}
