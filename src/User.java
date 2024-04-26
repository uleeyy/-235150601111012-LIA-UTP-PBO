public class User {
    private String email;
    private String password;
    private String fullname;
    private double balance;
    private String[] ticketList;
    private int maxTicket;

    public void User (String a, String b, String c, double d) {
        System.out.println();
    }
    public void addTicket (boolean a) {
        System.out.println();
    }
    public void displayAllTickets () {
        System.out.println();
    }
    public void isMatch (String a, String b, boolean c) {
        System.out.println();
    }
    public void getEmail (String a) {
        email = a;
    }
    public void getPassword (String a) {
        password = a;
    }
    public void getFullname (String a) {
        fullname = a;
    }
    public void getBalance (double a) {
        balance = a;
    }
    public void setBalance (double a) {
        balance = a;
    }
}