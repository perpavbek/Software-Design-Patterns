package Assignment5.Task1;

public class UserModel {
    private String username;
    private String password;

    public UserModel(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }
    public String getPassword() {
        return password;
    }

    public boolean isValid() {
        return username != null && password != null && password.length() >= 6;
    }
}