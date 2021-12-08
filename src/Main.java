import java.util.ArrayList;

public class Main {
    public void printTicketDetails(Ticket ticket) {
        System.out.println(ticket.getPnr());
    }

    public static void main(String[] args) {
        Flight flight = new Flight("AIR123", "Air India", 250);
        Passenger passenger = new Passenger("Sumanth", "1234567890", "sumanthrt@gmail.com", "M.G. Road", "Bangalore", "Karnataka");
        ArrayList<String> serviceList = new ArrayList<String>() {
            {
                add("Add food");
                add("Add water");
                add("Add express boarding");
            }
        };
        ArrayList<String> touristLocation = new ArrayList<String>() {
            {
                add("Juhu Beach");
                add("Marine Drive");
                add("CST");
            }
        };
        String hotelAddress = "Taj Hotel";
        RegularTicket regularTicket = new RegularTicket("AIR123", "Bangalore", "Mumbai", "08-12-2021 00:00:00", "08-12-2021 01:00:00", Ticket.Status.CONFIRMED, 20, 1.0, 15000.0, flight, passenger, serviceList);
        TouristTicket touristTicket = new TouristTicket("AIR456", "Bangalore", "Mumbai", "08-12-2021 00:00:00", "08-12-2021 01:00:00", Ticket.Status.CONFIRMED, 20, 1.0, 15000.0, flight, passenger, touristLocation, hotelAddress);
        System.out.println(regularTicket.getPnr());
        System.out.println(touristTicket.getPnr());
    }
}
