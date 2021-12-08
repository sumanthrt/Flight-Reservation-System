public class Flight {
    private String flightNumber;
    private String airline;
    private int capacity;
    private int seatsBooked;//seats booked should be static since it is counting number of tickets sold

    public Flight() {//default constructor
    }

    public Flight(String flightNumber, String airline, int capacity){//Parametrized Constructor
        this.flightNumber = flightNumber;
        this.airline = airline;
        this.capacity = capacity;
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

    public int getSeatsBooked() {
        return seatsBooked;
    }

    public void setSeatsBooked(int seatsBooked) {
        this.seatsBooked = seatsBooked;
    }
}
