import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

public class AuthenticationService implements IAuthenticationService {
    private ArrayList<User> users;

    public AuthenticationService(ArrayList<User> users) {
        this.users = users;
    }


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

    public User logIn(String username, String password) {
        Iterator i = users.iterator();
        while (i.hasNext()) {
            User currentUser = (User) i.next();
            if (Objects.equals(username, currentUser.getUsername()) && Objects.equals(password, currentUser.getPassword())) {
                return currentUser;
            }
        }
        return null;
    }
    // TODO Now: Add a constructor to initialize the users list with the default user

    // TODO Now: Implement the signUp method to add a new user to the list if the username is not taken and return the user; returns null otherwise

    // TODO Now: Implement the logIn method to return the user if the username and password match, and null otherwise
}

