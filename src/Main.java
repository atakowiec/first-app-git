public class Main {
    public static void main(String[] args) {
        RegisterService registerService = new RegisterService();
        registerService.register();
        System.out.println("Hello world!");

        Login login = new Login();
        login.login();
        Dashboard dashboard = new Dashboard();

        dashboard.addLoggedInUser("JanKowalski");
        dashboard.addLoggedInUser("AnnaNowak");

        dashboard.displayLoggedInUsers();

        dashboard.resetDashboard();
    }
}
