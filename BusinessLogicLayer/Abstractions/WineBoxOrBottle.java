package BusinessLogicLayer.Abstractions;

public abstract class WineBoxOrBottle implements IAlcoholicDrink {
    
    @Override
    public String getItemType() {
        return "Bottled or Boxed Wine.";
    }
}
