package BusinessLogicLayer.Abstractions;

public abstract class BottledWater500ml implements INonAlcoholicDrink {
    
    @Override
    public String getItemType() {
        return "500ml Bottled Water";
    }
}
