package solutions;

import java.util.regex.Pattern;
import violations.User;

public class UserValidator {
    private User user;

    public UserValidator(User user) {
        this.user = user;
    }
  
    // Responsabilidad 1: Validación de usuario
    public boolean validateUser() {
        if (user.name == null || user.name.trim().isEmpty()) {
            return false;
        }
        if (user.email == null || !isValidEmail(user.email)) {
            return false;
        }
        return user.userType != null && (user.userType.equals("PREMIUM")
                || user.userType.equals("REGULAR") || user.userType.equals("VIP"));
    }

    private boolean isValidEmail(String email) {
        return Pattern.compile("^[A-Za-z0-9+_.-]+@(.+)$").matcher(email).matches();
    }
}
