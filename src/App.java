import java.util.List;

/*
    Spośród przykładowej listy użytkowników wybierz tych, którzy posiadają email
    w domenie gmail.com.
*/

public class App {
    public static void main(String[] args) {
        var users = List.of(
                new User("u", "1234", "u@gmail.com"),
                new User("a", "1234", "a@km-programs.pl"),
                new User("e", "1234", "e@gmail.com"),
                new User("g", "1234", "g@km-progeams.pl")
        );

        var usersService = new UsersService(users);
        var gmailUsers = usersService.getUserByEmail(e  -> e.endsWith("gmail.com"));
        gmailUsers.forEach(System.out::println);
    }
}
