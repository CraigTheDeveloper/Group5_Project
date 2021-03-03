package ServerSide.BusinessLogicLayer.DataObjects.Menus.FoodItems.MainCourses.AdultMainCourses;

import ServerSide.BusinessLogicLayer.Abstractions.AdultMainCourse;

public class Ribs extends AdultMainCourse {

    @Override
    public String getItemName() {
        return "Short Ribs basted in a BBQ sauce";
    }

    @Override
    public double getPrice() {
        return 199.99;
    }

}
