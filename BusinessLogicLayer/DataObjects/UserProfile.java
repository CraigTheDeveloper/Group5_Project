package BusinessLogicLayer.DataObjects;

import java.io.Serializable;

import BusinessLogicLayer.Enums.UserAccountTypes;
import DataAccessLayer.FileHandlers.UserProfileFileHandler;
import PresentationLayer.App;

public class UserProfile implements Serializable {
    String emailAddress;
    String password;
    UserAccountTypes accountType;

    

    public UserProfile(String emailAddress, String password) {
        this.emailAddress = emailAddress;
        this.password = password;
    }

    public String getEmailAddress() {
        return this.emailAddress;
    }

    public String getPassword() {
        return this.password;
    }

    public UserAccountTypes getUserAccountType() {
        return accountType;
    }

    public boolean signIn() {
        UserProfileFileHandler userFileHandler = new UserProfileFileHandler();
        if (userFileHandler.doesAccountExist(this)) {
            UserProfile matchingAccount = userFileHandler.readUserProfile(this);
            
            if (matchingAccount.getPassword().equals(this.password)) {
                App.setLoggedInUser(matchingAccount);
                return true;
            }
        }

        return false;
    }

    public boolean signUp() {
        UserProfileFileHandler userFileHandler = new UserProfileFileHandler();
        if (!userFileHandler.doesAccountExist(this) && userFileHandler.writeUserProfile(this)) {     
            App.setLoggedInUser(this);
            return true;
        }

        return false;
    }
}
