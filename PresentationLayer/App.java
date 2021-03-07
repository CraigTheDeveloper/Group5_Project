package PresentationLayer;

import BusinessLogicLayer.DataObjects.UserProfile;

public class App {
    
    public static IPage activePage;

    // The entry point for our application

    public static UserProfile loggedInUser = null;

    public static UserProfile getLoggedInUser() {
        return loggedInUser;
    }

    public static void setLoggedInUser(UserProfile user) {
        loggedInUser = user;
    }

    public static void main(String[] args) {
        activePage = new SignInPage();
    }
}
