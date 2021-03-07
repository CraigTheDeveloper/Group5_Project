package BusinessLogicLayer.DataObjects.Menus.DrinkItems.AlcoholicDrinks.Beer330ml;

import BusinessLogicLayer.Abstractions.Beer330ml;

public class BlackLabel extends Beer330ml {
 
    // If we need to be concerned about copyrights, we might want
    // to change some names/descriptions.
    @Override
    public String getItemName() {
        return "6 x Black Label 330ml beer";
    }

    @Override
    public double getPrice() {
        return 80.0d;
    }
   
}
