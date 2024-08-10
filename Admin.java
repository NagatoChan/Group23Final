package oopFinalProject;

public class Admin extends Manager {

    public Admin(String userID, String username, String password) {
        super(userID, username, password);
    }

    public void addUser(User user) {
        System.out.println("Adding user: " + user.getUsername());
        // TODO: Implement logic to add a new user
    }

    public void deleteUser(User user) {
        System.out.println("Deleting user: " + user.getUsername());
        // TODO: Implement logic to delete a user
    }
}
