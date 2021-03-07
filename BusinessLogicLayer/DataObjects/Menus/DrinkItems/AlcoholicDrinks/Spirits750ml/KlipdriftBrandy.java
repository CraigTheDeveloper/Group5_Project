package BusinessLogicLayer.DataObjects.Menus.DrinkItems.AlcoholicDrinks.Spirits750ml;

import BusinessLogicLayer.Abstractions.SpiritsBottle750ml;

public class KlipdriftBrandy extends SpiritsBottle750ml{

    @Override
    public String getItemName() {
        return "1 x 750ml Klipdrift Brandy Bottle";
    }

    @Override
    public double getPrice() {
        return 150.0d;
    }
    
}
