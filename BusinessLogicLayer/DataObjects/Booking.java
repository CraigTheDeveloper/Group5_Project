package BusinessLogicLayer.DataObjects;

import java.io.Serializable;
import java.util.Date;

import BusinessLogicLayer.DataObjects.Menus.Menu;

public class Booking implements Serializable {
    Date bookingDate;
    boolean isConfirmed;
    public static Menu bookingMenu = new Menu();
    
    public void setBookingDate(Date date) {
        this.bookingDate = date;
    }

    public Date getBookingDate() {
        return bookingDate;
    }

}
