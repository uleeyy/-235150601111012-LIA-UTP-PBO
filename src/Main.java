public class Main {
    public static void main(String[] args) {
        Cinema cm = new Cinema();
        Movie mv = new Movie();
        Studio st = new Studio();
        Ticket tc = new Ticket();
        User ur = new User();

        cm.registerUser();
        cm.displayListStudio();
        cm.bookTicket();
        st.setSeats();
        tc.getMovie();
        ur.displayAllTickets();
    }
}