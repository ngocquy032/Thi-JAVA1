package Thi;

public class Flight {
    private int number;
    private  String destination;

    public Flight(int number, String destination) {
        if(number > 0){
            this.number = number;

        }else{
            this.number = 0;
        }

        if(destination == null){
            this.destination = "";

        }else{
            this.destination = destination;
        }
    }

    public int getNumber() {
        return number;
    }

    public String getDestination() {
        return destination;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }



    public void display(){
        System.out.println("Flight: " +
                "number=" + number +
                ", destination='" + destination + '\''
                );
    }
}
