package DataAccessLayer.FileHandlers;

import java.nio.file.Path;
import java.nio.file.Paths;

import BusinessLogicLayer.DataObjects.UserProfile;

public abstract class FileHandler {
    
    String basePath = "./DataAccessLayer/TextFiles/";
    Path filePath = Paths.get(basePath);

}
