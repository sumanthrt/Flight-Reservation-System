import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class TouristTicket extends Ticket {

    private List<String> touristLocation = new ArrayList<String>();//Array list of services
    private String hotelAddress;

    public TouristTicket() {//default constructor
    }
    public void addLocation(String location) {
        if(touristLocation.size()<5) {
            touristLocation.add(location);
        }
        else
            System.out.println("Maximum 5 locations selected");
    }

    public void deleteLocation(int index) {
        touristLocation.remove(index-1);
    }

    public void listLocation() {
        Iterator itr = touristLocation.iterator();//getting the Iterator
        int i = 0;
        while (itr.hasNext()) {//check if iterator has the element
            System.out.println(++i + ": " + itr.next());//printing the element and move to next
        }
    }
}
