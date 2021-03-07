package BusinessLogicLayer.DataObjects.Themes.Decorations.YearEndDecorations;

import BusinessLogicLayer.Abstractions.YearEndDecoration;

public class Games extends YearEndDecoration {

    @Override
    public String getItemName() {

        return "Board Games";
    }

    @Override
    public double getPrice() {

        return 49.99;
    }

}
