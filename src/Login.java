import java.util.Scanner;

public class Login {

    public void login() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Witaj! Zaloguj się. :D ");

        System.out.print("Nazwa użytkownika: ");
        String username = scanner.nextLine();

        System.out.print("Hasło: ");
        String password = scanner.nextLine();

        if (UserRepository.users.containsKey(username)) {
            if (UserRepository.users.get(username).equals(password)) {
                System.out.println("Logowanie udane! Witaj (nie)przyjacielu, " + username + "!");
            } else {
                System.out.println("Błędne hasło.");
            }
        } else {
            System.out.println("Użytkownik nie istnieje.");
        }
        scanner.close();
    }
}
