package PresentationLayer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import BusinessLogicLayer.DataObjects.UserProfile;
import BusinessLogicLayer.Enums.MainMenuOptions;
import Helpers.ScreenClearer;

public class SignInPage implements IPage {
    
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public SignInPage() {
        try {
            runSignInPage();
        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
        }
    }

    public static void runSignInPage() throws IOException {
        ScreenClearer.clearScreen();
        System.out.println("Ms. Rachael welcomes you to Delicious Catering!");
        System.out.println("*************************************************************");
        System.out.println("1. Sign in");
        System.out.println("2. Sign up");
        System.out.println("3. Exit");
        System.out.println("*************************************************************");

        MainMenuOptions choice;

        int userChoice;
        userChoice = Integer.parseInt(reader.readLine());
        choice = MainMenuOptions.values()[userChoice - 1];

        if (choice == MainMenuOptions.EXIT) {
            System.exit(0);
        }

        UserProfile userProfile = getUserProfileInput();

        switch (choice) {
            case SIGN_IN: {
                runSignInProcess(userProfile);
            }       
                break;
            case SIGN_UP: {
                runSignUpProcess(userProfile);
            }
                break;
            default: {
                ScreenClearer.clearScreen();
                System.out.println("Invalid choice");
            }
                break;
        }
    } 

    public static void runSignInProcess(UserProfile userProfile) throws IOException {
        if (userProfile.signIn()) {
            ScreenClearer.clearScreen();
            System.out.println("Signed in successfully! Press Enter to continue.");
            reader.readLine();
            App.activePage = new BookingPage();
        } else {
            ScreenClearer.clearScreen();
            System.out.println("Error signing in. Press Enter to continue.");
            reader.readLine();
            runSignInPage();
        }
    }

    public static void runSignUpProcess(UserProfile userProfile) throws IOException {
        if (userProfile.signUp()) {
            ScreenClearer.clearScreen();
            System.out.println("Account created successfully! Press Enter to continue.");
            reader.readLine();
            App.activePage = new BookingPage();
        } else {
            ScreenClearer.clearScreen();
            System.out.println("Error creating account. Press Enter to continue.");
            reader.readLine();
            runSignInPage();
        }
    }

    public static UserProfile getUserProfileInput() throws IOException {
        ScreenClearer.clearScreen();
        System.out.println("Enter your email address:");
        String email = reader.readLine();

        ScreenClearer.clearScreen();
        System.out.println("Enter your password:");
        String password = reader.readLine();

        return new UserProfile(email, password);
    }
}
