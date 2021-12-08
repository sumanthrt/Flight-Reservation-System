public class Passenger {
    private static int idCounter = 0;//to assign unique ids to passengers

    private static class Contact {// static nested class Contact
        private String name;
        private String phoneNumber;
        private String email;
    }

    private static class Address {// static nested class Address
        private String street;
        private String city;
        private String state;
    }

    private Contact contact;
    private Address address;

    public Passenger() {
    }

    public Passenger(String name, String phoneNumber, String email, String street, String city, String state) {
        this.contact.name = name;
        this.contact.phoneNumber = phoneNumber;
        this.contact.email = email;
        this.address.street = street;
        this.address.city = city;
        this.address.state = state;
        ++idCounter;//incrementing id to ensure all ids are unique
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public static int getPassengerCount() {
        return idCounter;
    }
}
