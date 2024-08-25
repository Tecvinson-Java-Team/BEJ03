package controls;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public interface UserValidation {
    //    boolean validateUsername(String username);
    default boolean validateUsername(String username) {
        Pattern UsernamePattern = Pattern.compile("[a-zA-Z_0-9]+", Pattern.CASE_INSENSITIVE);
        Matcher matcher = UsernamePattern.matcher(username);
        return matcher.matches() && username.length() >= 8;
    }

    //    boolean validatePassword(String password);
    default boolean validatePassword(String password) {
        Pattern PasswordPattern = Pattern.compile("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d).+$");
        Matcher matcher = PasswordPattern.matcher(password);
        return matcher.matches() && password.length() >= 8;
    }

    void feedbackMessage(String username, String password);
}