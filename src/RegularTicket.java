
public class RegularTicket {
    String pnr;
    String departure;
    String destination;
    String departureDateTime;
    String arrivalDateTime;
    boolean status;
    int seatNumber;
    double duration;
    double price;
    String[] service;
    public RegularTicket(String pnr, String departure, String destination, String departureDateTime, String arrivalDateTime, boolean status, int seatNumber, double duration, double price){
        this.pnr = pnr;
        this.departure = departure;
        this.destination = destination;
        this.departureDateTime = departureDateTime;
        this.arrivalDateTime = arrivalDateTime;
        this.status = status;
        this.seatNumber = seatNumber;
        this.duration = duration;
        this.price = price;
    }
}
