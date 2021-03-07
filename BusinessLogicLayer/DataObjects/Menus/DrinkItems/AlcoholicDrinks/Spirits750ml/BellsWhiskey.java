package BusinessLogicLayer.DataObjects.Menus.DrinkItems.AlcoholicDrinks.Spirits750ml;

import BusinessLogicLayer.Abstractions.SpiritsBottle750ml;

public class BellsWhiskey extends SpiritsBottle750ml {

    @Override
    public String getItemName() {
        return "1 x 750ml Bell's Blended Scotch Whisky";
    }

    @Override
    public double getPrice() {
        return 229.0d;
    }
    
}
