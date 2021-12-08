public class Flight {
    String flightNumber;
    String airline;
    int capacity;
    int seatsBooked;//seats booked should be static since it is counting number of tickets sold
    public Flight(String flightNumber, String airline, int capacity){//Constructor to initialise Flight Class
        this.flightNumber = flightNumber;
        this.airline = airline;
        this.capacity = capacity;
    }

}
