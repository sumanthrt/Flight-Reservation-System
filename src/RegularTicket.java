import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RegularTicket extends Ticket {
    private List<String> serviceList = new ArrayList<String>();//Array list of services

    public RegularTicket() {//default constructor
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
