package Thi;

public class TestFlight {
    public static void main(String[] args) {
        Flight g1 = new Flight(1, "A00");
        System.out.println("number:" + g1.getNumber());
        System.out.println( "destination: " + g1.getDestination());

        g1.display();

    }
}

