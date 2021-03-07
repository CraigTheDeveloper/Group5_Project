package BusinessLogicLayer.DataObjects.Menus.DrinkItems.AlcoholicDrinks.Spirits750ml;

import BusinessLogicLayer.Abstractions.SpiritsBottle750ml;

public class CaptainMorganRum extends SpiritsBottle750ml {

    @Override
    public String getItemName() {
        return "1 x 750ml Captain Morgan Black Jamaica Rum";
    }

    @Override
    public double getPrice() {
        return 179.0d;
    }
    
}
