package BusinessLogicLayer.DataObjects.Menus.FoodItems.MainCourses.KiddiesMainCourses;

import BusinessLogicLayer.Abstractions.KiddiesMainCourse;

public class Burger extends KiddiesMainCourse {

    @Override
    public String getItemName() {
        return "Beef Burger with emmenthal cheese and Adobo sauce";
    }

    @Override
    public double getPrice() {
        return 89.99;
    }

}
