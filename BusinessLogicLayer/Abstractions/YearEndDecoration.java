package BusinessLogicLayer.Abstractions;

public abstract class YearEndDecoration implements IDecorationItem {

    @Override
    public String getItemType() {
        return "Year-End Decoration";
    }
}
