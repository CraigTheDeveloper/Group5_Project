package Helpers;

public class ScreenClearer {
    
    private ScreenClearer() {

    }

    // In java there is no simple "console.clear()" but this is a neat little trick I found
    
    public static void clearScreen() {  
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
     }
}
