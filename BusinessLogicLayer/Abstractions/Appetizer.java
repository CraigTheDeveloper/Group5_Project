package BusinessLogicLayer.Abstractions;

public abstract class Appetizer implements IFoodItem {

    @Override
    public String getItemType() {
        return "Appetizer";
    }
}
