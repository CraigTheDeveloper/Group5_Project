package BusinessLogicLayer.Abstractions;

public abstract class SpiritsBottle750ml implements IAlcoholicDrink {
    
    @Override
    public String getItemType() {
        return "750ml Bottle of Spirits";
    }
}
