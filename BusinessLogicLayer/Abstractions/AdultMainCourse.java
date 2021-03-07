package BusinessLogicLayer.Abstractions;

public abstract class AdultMainCourse implements IMainCourse {

    @Override
    public String getItemType() {
        return "Adult Main Course";
    }
}
