package BusinessLogicLayer.DataObjects.Menus.FoodItems.MainCourses.AdultMainCourses;

import BusinessLogicLayer.Abstractions.AdultMainCourse;

public class BunnyChow extends AdultMainCourse {

    @Override
    public String getItemName() {
        return "Chicken/Beef Bunny Chow with fries and coleslaw";
    }

    @Override
    public double getPrice() {
        return 25.50;
    }

}
