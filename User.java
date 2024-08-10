package oopFinalProject;
public abstract class User {
    protected String userID;
    protected String username;
    protected String password;

    public User(String userID, String username, String password) {
        this.userID = userID;
        this.username = username;
        this.password = password;
    }

    public String getUserID() {
        return userID;
    }

    public String getUsername() {
        return username;
    }

    public boolean authenticate(String password) {
        return this.password.equals(password);
    }

    public abstract void viewTasks();
}
