package BusinessLogicLayer.DataObjects.Menus.FoodItems.Desserts;

import BusinessLogicLayer.Abstractions.Dessert;

public class CremeCaramel extends Dessert {

    @Override
    public String getItemName() {
        return "Creme Caramel";
    }

    @Override
    public double getPrice() {
        return 35.99;
    }

}
