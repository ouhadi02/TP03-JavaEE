package models;

import java.util.HashMap;
import java.util.Map;

public class User {

    private static Map<String, String> users = new HashMap<>();

    public static boolean addUser(String username, String password) {
    	
        if (users.containsKey(username)) {
        	
            return false;
            
        }
        
        users.put(username, password);
        return true;
        
    }

    
    public static boolean authenticate(String username, String password) {
        return users.containsKey(username)
                && users.get(username).equals(password);
        
        
    }
    
}