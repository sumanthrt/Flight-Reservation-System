import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class TouristTicket extends Ticket {

    private List<String> touristLocation = new ArrayList<String>();//Array list of services
    private String hotelAddress;

    public TouristTicket() {//default constructor
    }

    public TouristTicket(List<String> touristLocation, String hotelAddress) {
        this.touristLocation = touristLocation;
        this.hotelAddress = hotelAddress;
    }

    public TouristTicket(String pnr, String departure, String destination, String departureDateTime, String arrivalDateTime, Status status, int seatNumber, double duration, double price, Flight flight, Passenger passenger, List<String> touristLocation, String hotelAddress) {
        super(pnr, departure, destination, departureDateTime, arrivalDateTime, status, seatNumber, duration, price, flight, passenger);
        this.touristLocation = touristLocation;
        this.hotelAddress = hotelAddress;
    }

    public void addLocation(String location) {
        if (touristLocation.size() < 5) {
            touristLocation.add(location);
        } else
            System.out.println("Maximum 5 locations selected");
    }

    public void deleteLocation(int index) {
        touristLocation.remove(index - 1);
    }

    public void listLocation() {
        Iterator itr = touristLocation.iterator();//getting the Iterator
        int i = 0;
        while (itr.hasNext()) {//check if iterator has the element
            System.out.println(++i + ": " + itr.next());//printing the element and move to next
        }
    }
}
