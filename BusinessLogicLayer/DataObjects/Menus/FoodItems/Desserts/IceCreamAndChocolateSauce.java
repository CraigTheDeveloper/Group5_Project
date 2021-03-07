package BusinessLogicLayer.DataObjects.Menus.FoodItems.Desserts;

import BusinessLogicLayer.Abstractions.Dessert;

public class IceCreamAndChocolateSauce extends Dessert {

    @Override
    public String getItemName() {
        return "Ice Creame and Chocolate Sauce";
    }

    @Override
    public double getPrice() {
        return 12.99;
    }

}
