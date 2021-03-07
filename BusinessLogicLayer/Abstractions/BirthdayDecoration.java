package BusinessLogicLayer.Abstractions;

public abstract class BirthdayDecoration implements IDecorationItem {
    @Override
    public String getItemType() {
        return "Birthday Decoration";
    }
}
