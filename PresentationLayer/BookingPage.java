package PresentationLayer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import BusinessLogicLayer.DataObjects.Booking;
import BusinessLogicLayer.DataObjects.UserProfile;
import BusinessLogicLayer.DataObjects.Menus.FoodItems.Appetizers.ChickenWings;
import BusinessLogicLayer.DataObjects.Menus.FoodItems.Appetizers.GarlicBread;
import BusinessLogicLayer.DataObjects.Menus.FoodItems.Appetizers.MiniSausages;
import BusinessLogicLayer.DataObjects.Menus.FoodItems.Appetizers.Samosas;
import BusinessLogicLayer.DataObjects.Menus.FoodItems.Desserts.Cake;
import BusinessLogicLayer.DataObjects.Menus.FoodItems.Desserts.CremeCaramel;
import BusinessLogicLayer.DataObjects.Menus.FoodItems.Desserts.FudgeBrownies;
import BusinessLogicLayer.DataObjects.Menus.FoodItems.Desserts.IceCreamAndChocolateSauce;
import BusinessLogicLayer.Enums.AppetizersMenuOptions;
import BusinessLogicLayer.Enums.BookingMenuOptions;
import BusinessLogicLayer.Enums.DessertsMenuOptions;
import BusinessLogicLayer.Enums.MainMenuOptions;
import Helpers.ScreenClearer;

public class BookingPage implements IPage {
    
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public BookingPage() {
        try {
            runBookingPage();
        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
        }
    }

    public static void runBookingPage() throws IOException, ParseException {
        ScreenClearer.clearScreen();
        System.out.println("Logged in as: " + App.getLoggedInUser().getEmailAddress());
        System.out.println("*************************************************************");
        System.out.println("1. Create new booking");
        System.out.println("2. View all bookings");
        System.out.println("3. Modify existing booking");
        System.out.println("4. Sign out");
        System.out.println("*************************************************************");

        BookingMenuOptions choice;

        int userChoice;
        userChoice = Integer.parseInt(reader.readLine());
        choice = BookingMenuOptions.values()[userChoice - 1];

        if (choice == BookingMenuOptions.BACK_TO_SIGN_IN) {
            App.activePage = new SignInPage();
        }

        switch (choice) {
            case NEW_BOOKING: {
                Booking booking = buildBooking();
            }       
                break;
            case VIEW_ALL: {
                
            }
                break;
            default:
            System.out.println("Invalid choice");
                break;
        }
    } 

    public static void runNewBookingProcess() {
        //
    }


    static Booking buildBooking() throws IOException, ParseException {
        Booking booking = new Booking();

        ScreenClearer.clearScreen();
        System.out.println("Booking details:");
        System.out.println("*************************************************************");
        System.out.println("Enter the date of the booking: YYYY/MM/DD");
        String dateInput= reader.readLine();
        Date bookingDate = new SimpleDateFormat("yyyy/MM/dd").parse(dateInput);  
        booking.setBookingDate(bookingDate);
        
        ScreenClearer.clearScreen();
        System.out.println("Booking details:");
        System.out.println("*************************************************************");
        System.out.println(booking.getBookingDate());
        System.out.println("Choose your Appetizer: ");
        System.out.println("1. Chicken Wings");
        System.out.println("2. Garlic Bread");
        System.out.println("3. Mini Sausages");
        System.out.println("4. Samosas");

        AppetizersMenuOptions choice;

        int userChoice;
        userChoice = Integer.parseInt(reader.readLine());
        choice = AppetizersMenuOptions.values()[userChoice - 1];        

        switch (choice) {
            case CHICKEN_WINGS:
                booking.bookingMenu.addItem(new ChickenWings());
                break;
                case GARLIC_BREAD:
                booking.bookingMenu.addItem(new GarlicBread());
                break;
                case MINI_SAUSAGES:
                booking.bookingMenu.addItem(new MiniSausages());
                break;
                case SAMOSAS:
                booking.bookingMenu.addItem(new Samosas());
                break;

            default:
                break;
        }

        ScreenClearer.clearScreen();
        System.out.println("Booking details:");
        System.out.println("*************************************************************");
        System.out.println(booking.getBookingDate());
        System.out.println("Appetizer choice: " + booking.bookingMenu.getAllFoodItems().get(0).getItemName());
        System.out.println("Choose your Dessert: ");
        System.out.println("1. Cake");
        System.out.println("2. Creme Caramel");
        System.out.println("3. Fudge Brownies");
        System.out.println("4. Ice Cream and Chocolate Sauce");


        DessertsMenuOptions dessertChoice;

        userChoice = Integer.parseInt(reader.readLine());
        dessertChoice = DessertsMenuOptions.values()[userChoice - 1];        

        switch (dessertChoice) {
            case CAKE:
                booking.bookingMenu.addItem(new Cake());
                break;
                case CREME_CARAMEL:
                booking.bookingMenu.addItem(new CremeCaramel());
                break;
                case FUDGE_BROWNIES:
                booking.bookingMenu.addItem(new FudgeBrownies());
                break;
                case ICE_SCREAM_CHOCOLATE_SAUCE:
                booking.bookingMenu.addItem(new IceCreamAndChocolateSauce());
                break;

            default:
                break;
        }

        reader.readLine();
        
        return booking;
    }

}
