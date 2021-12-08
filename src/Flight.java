public class Flight {
    private String flightNumber;
    private String airline;
    private int capacity;
    private static int seatsBooked = 0;//seats booked should be static since it is counting number of tickets sold

    public Flight() {//default constructor
    }

    public Flight(String flightNumber, String airline, int capacity) {//Parametrized Constructor
        this.flightNumber = flightNumber;
        this.airline = airline;
        this.capacity = capacity;
        ++seatsBooked;//incrementing seats booked when new seat is booked on flight
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public static int getSeatsBooked(){
        return seatsBooked;
    }
}
