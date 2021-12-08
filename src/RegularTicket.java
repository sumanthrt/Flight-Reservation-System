import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RegularTicket extends Ticket {
    private List<String> serviceList = new ArrayList<String>();//Array list of services

    public RegularTicket() {//default constructor
    }

    public RegularTicket(List<String> serviceList) {
        this.serviceList = serviceList;
    }

    public RegularTicket(String pnr, String departure, String destination, String departureDateTime, String arrivalDateTime, Status status, int seatNumber, double duration, double price, Flight flight, Passenger passenger, List<String> serviceList) {
        super(pnr, departure, destination, departureDateTime, arrivalDateTime, status, seatNumber, duration, price, flight, passenger);
        this.serviceList = serviceList;
    }

    public void addService(String service) {
        serviceList.add(service);
    }

    public void deleteService(int index) {
        serviceList.remove(index-1);
    }

    public void listService() {
        Iterator itr = serviceList.iterator();//getting the Iterator
        int i = 0;
        while (itr.hasNext()) {//check if iterator has the element
            System.out.println(++i + ": " + itr.next());//printing the element and move to next
        }
    }
}
