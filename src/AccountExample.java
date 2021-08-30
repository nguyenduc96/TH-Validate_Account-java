import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AccountExample {
    private static final String ACCOUNT = "^[a-z0-9_]{6,}$";

    public AccountExample() {
    }

    public boolean validate(String regex) {
        Pattern pattern = Pattern.compile(ACCOUNT);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
