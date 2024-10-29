package Assignment5.Task1;

public class LoginPresenter {
    private final LoginView view;

    public LoginPresenter(LoginView view) {
        this.view = view;
    }

    public void login(String username, String password) {
        UserModel user = new UserModel(username, password);

        if (user.isValid()) {
            view.showLoginSuccess();
        } else {
            view.showLoginError("Invalid username or password.");
        }
    }
}
