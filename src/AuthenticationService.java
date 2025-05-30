import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

public class AuthenticationService implements IAuthenticationService {
    private ArrayList<User> users;

    // TODO Now: Add a constructor to initialize the users list with the default user
    public AuthenticationService() {
        users = new ArrayList<User>();
        users.add(new User("test", "test"));
    }

    // TODO Now: Implement the signUp method to add a new user to the list if the username is not taken and return the user; returns null otherwise
    public User signUp(String username, String password) {
        Iterator i = users.iterator();
        while (i.hasNext()) {
            User existsAlready = (User) i.next();
            if (Objects.equals(username, existsAlready.getUsername())) {
                return null;
            }
        }
        User newUser = new User(username, password);
        users.add(newUser);
        return newUser;
    }

    // TODO Now: Implement the logIn method to return the user if the username and password match, and null otherwise
    public User logIn(String username, String password) {
        Iterator i = users.iterator();
        while (i.hasNext()) {
            User currentUser = (User) i.next();
            if (username.equals(currentUser.getUsername()) && password.equals(currentUser.getPassword())) {
                return currentUser;
            }
        }
        return null;
    }

}

