public class Main {
    public static void main(String[] args) {
        Dashboard dashboard = new Dashboard();

        dashboard.addLoggedInUser("JanKowalski");
        dashboard.addLoggedInUser("AnnaNowak");

        dashboard.displayLoggedInUsers();

        dashboard.resetDashboard();
    }
}
