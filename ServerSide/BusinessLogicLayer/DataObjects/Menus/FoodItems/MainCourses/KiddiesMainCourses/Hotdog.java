package ServerSide.BusinessLogicLayer.DataObjects.Menus.FoodItems.MainCourses.KiddiesMainCourses;

import ServerSide.BusinessLogicLayer.Abstractions.KiddiesMainCourse;

public class Hotdog extends KiddiesMainCourse {

    @Override
    public String getItemName() {
        return "Frankfurter/boerewors on a hotdog roll.";
    }

    @Override
    public double getPrice() {
        return 20.0;
    }
    
}
