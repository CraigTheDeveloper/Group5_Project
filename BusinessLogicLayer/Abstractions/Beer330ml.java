package BusinessLogicLayer.Abstractions;

public abstract class Beer330ml implements IAlcoholicDrink {
    
    @Override
    public String getItemType() {
        return "330ml Bottle of Beer";
    }
}
