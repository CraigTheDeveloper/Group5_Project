package BusinessLogicLayer.DataObjects.Menus.FoodItems.Desserts;

import BusinessLogicLayer.Abstractions.Dessert;

public class Cake extends Dessert {

    @Override
    public String getItemName() {
        return "Cake";
    }

    @Override
    public double getPrice() {
        return 49.99;
    }

}
