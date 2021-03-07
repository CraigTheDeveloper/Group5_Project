package BusinessLogicLayer.DataObjects.Menus.DrinkItems.AlcoholicDrinks.Beer330ml;

import BusinessLogicLayer.Abstractions.Beer330ml;

public class FlyingFish extends Beer330ml {
    
    @Override
    public String getItemName() {
        return "6 x 330ml Flying Fish Beer";
    }

    @Override
    public double getPrice() {
        return 79.0d;
    }
}
