public class Passenger {
    private static int idCounter = 0;//to assign unique ids to passengers

    private static class Contact {// static nested class Contact
        private String name;
        private String phoneNumber;
        private String email;

        public Contact(String name, String phoneNumber, String email) {
            this.name = name;
            this.phoneNumber = phoneNumber;
            this.email = email;
        }
    }

    private static class Address {// static nested class Address
        private String street;
        private String city;
        private String state;

        public Address(String street, String city, String state) {
            this.street = street;
            this.city = city;
            this.state = state;
        }
    }

    private Contact contact;
    private Address address;

    public Passenger() {
    }

    public Passenger(String name, String phoneNumber, String email, String street, String city, String state) {
        this.contact = new Contact(name, phoneNumber, email);
        this.address = new Address(street, city, state);
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
