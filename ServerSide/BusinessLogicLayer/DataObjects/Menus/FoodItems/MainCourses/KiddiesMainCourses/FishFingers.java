package ServerSide.BusinessLogicLayer.DataObjects.Menus.FoodItems.MainCourses.KiddiesMainCourses;

import ServerSide.BusinessLogicLayer.Abstractions.KiddiesMainCourse;

public class FishFingers extends KiddiesMainCourse{

    @Override
    public String getItemName() {
        return "Fish Fingers";
    }

    @Override
    public double getPrice() {
        return 19.95d;
    }
    
}
