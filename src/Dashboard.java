import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Dashboard {

    private List<String> loggedInUsers;

    private List<LocalDateTime> lastLoginTimes;

    private int totalLoggedInUsers;

    public Dashboard() {
        this.loggedInUsers = new ArrayList<>();
        this.lastLoginTimes = new ArrayList<>();
        this.totalLoggedInUsers = 0;
    }

    public void addLoggedInUser(String username) {
        if (UserRepository.users.containsKey(username)) {
            loggedInUsers.add(username);
            lastLoginTimes.add(LocalDateTime.now());
            totalLoggedInUsers++;
        } else {
            System.out.println("Użytkownik nie istnieje w repozytorium!");
        }
    }

    public void displayLoggedInUsers() {
        System.out.println("Zalogowani użytkownicy: ");
        for (int i = 0; i < loggedInUsers.size(); i++) {
            String username = loggedInUsers.get(i);
            LocalDateTime loginTime = lastLoginTimes.get(i);
            System.out.println("Użytkownik: " + username + ", Ostatnie logowanie: " + loginTime);
        }
        System.out.println("Łączna liczba zalogowanych użytkowników: " + totalLoggedInUsers);
    }

    public void resetDashboard() {
        loggedInUsers.clear();
        lastLoginTimes.clear();
        totalLoggedInUsers = 0;
        System.out.println("Dashboard został zresetowany.");
    }

    public static void main(String[] args) {
        UserRepository.users.put("JanKowalski", "pass123");
        UserRepository.users.put("AnnaNowak", "password456");

        Dashboard dashboard = new Dashboard();

        dashboard.addLoggedInUser("JanKowalski");
        dashboard.addLoggedInUser("AnnaNowak");

        dashboard.displayLoggedInUsers();
    }
}
