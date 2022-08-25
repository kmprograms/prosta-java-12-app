import java.util.List;
import java.util.function.Predicate;

public class UsersService {
    private final List<User> users;

    public UsersService(List<User> users) {
        this.users = users;
    }

    public List<User> getUserByEmail(Predicate<String> emailTester) {
        if (emailTester == null) {
            throw new IllegalArgumentException("Email tester is null");
        }

        return users
                .stream()
                .filter(u -> u.hasEmail(emailTester))
                .toList();
    }
}
