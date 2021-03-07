package DataAccessLayer.FileHandlers;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

import BusinessLogicLayer.DataObjects.UserProfile;

public class UserProfileFileHandler extends FileHandler {
    
    public UserProfileFileHandler() {
        basePath += "UserProfiles/";
    }

    public boolean doesAccountExist(UserProfile user) {     
        String tempPath = basePath + user.getEmailAddress() + ".ser";
        return Files.exists(Paths.get(tempPath));
    }

    public boolean writeUserProfile(UserProfile user) {
        try 
        (
            FileOutputStream fos = new FileOutputStream(basePath + user.getEmailAddress() + ".ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
        ) {
            oos.writeObject(user);
            return true;            
        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
            return false;
        }
    }

    public UserProfile readUserProfile(UserProfile user) {
        try 
        (
            FileInputStream fis = new FileInputStream(basePath + user.getEmailAddress() + ".ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
        ) {
            UserProfile profile = (UserProfile) ois.readObject();
            return profile;            
        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
            return null;
        }
    }

}
