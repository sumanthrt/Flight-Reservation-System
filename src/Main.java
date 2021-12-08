public class Main {
    public static void main(String[] args){
        Address a = new Address("M.G. Road","Bangalore","Karnataka");
        Contact c = new Contact("Sumanth","1234567890","sumanthrt@gmail.com");
        Flight f = new Flight("AIR123","Air India",250);
        RegularTicket rt = new RegularTicket("KMLPID","Bangalore","Mumbai","08-12-2021 00:00:00", "08-12-2021 01:00:00",true,1,1.0,15000.0);
        TouristTicket tt = new TouristTicket("ABDLFG","Bangalore","Mumbai","08-12-2021 00:00:00", "08-12-2021 01:00:00",true,1,1.0,20000.0);
        System.out.println(a.street);
        System.out.println(c.name);
        System.out.println(f.flightNumber);
        System.out.println(rt.pnr);
        System.out.println(tt.pnr);
    }
}
