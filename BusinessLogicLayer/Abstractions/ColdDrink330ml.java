package BusinessLogicLayer.Abstractions;

public abstract class ColdDrink330ml implements INonAlcoholicDrink {
    
    @Override
    public String getItemType() {
        return "330ml Cold Drink";
    }
}
