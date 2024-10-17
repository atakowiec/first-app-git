import java.util.Scanner;

public class RegisterService {
    public void register() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter username:");
        String username = scanner.nextLine();

        System.out.println("Enter password:");
        String password = scanner.nextLine();

        if(UserRepository.users.containsKey(username))
            throw new IllegalArgumentException("User exists :(");

        UserRepository.users.put(username, password);

        System.out.println("User registered successfully");
    }
}
