package BusinessLogicLayer.Abstractions;

public abstract class BaptismDecoration implements IDecorationItem {
    @Override
    public String getItemType() {
        return "Baptism Decoration";
    }
}
