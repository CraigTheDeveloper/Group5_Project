package ServerSide.BusinessLogicLayer.DataObjects.Themes.Decorations.BirthdayDecorations;

import ServerSide.BusinessLogicLayer.Abstractions.BirthdayDecoration;

public class BirthdayBalloons extends BirthdayDecoration {

    @Override
    public String getItemName() {

        return "5 x Happy Birthday Balloons";
    }

    @Override
    public double getPrice() {

        return 3.99;
    }

}
