import java.util.function.Predicate;

public record User(String username, String password, String email) {
    public boolean hasEmail(Predicate<String> emailTester) {
        return emailTester.test(email);
    }
}
