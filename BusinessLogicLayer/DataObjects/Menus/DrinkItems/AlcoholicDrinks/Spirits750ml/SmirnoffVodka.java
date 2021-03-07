package BusinessLogicLayer.DataObjects.Menus.DrinkItems.AlcoholicDrinks.Spirits750ml;

import BusinessLogicLayer.Abstractions.SpiritsBottle750ml;

public class SmirnoffVodka extends SpiritsBottle750ml {
  
    @Override
    public String getItemName() {
        return "1 x 750ml Smirnoff 1818 Vodka Bottle";
    }

    @Override
    public double getPrice() {
        return 139.0d;
    }
}
