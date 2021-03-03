package ServerSide.BusinessLogicLayer.DataObjects.Menus.FoodItems.Desserts;

import ServerSide.BusinessLogicLayer.Abstractions.Dessert;

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
