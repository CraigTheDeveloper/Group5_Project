package BusinessLogicLayer.Abstractions;

public abstract class ColdDrink2Litre implements INonAlcoholicDrink {
    
    @Override
    public String getItemType() {
        return "2 Litre Cold Drink";
    }
}
