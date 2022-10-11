import java.util.ArrayList;

public class Bus {

    private String destination;
    private int capacity;
    private ArrayList<Person> passengers;

    public Bus (String destination, int capacity){
        this.destination = destination;
        this.capacity = capacity;
        this.passengers = new ArrayList<>();
    }

    public int getNumberOfPassengers(){
        return this.passengers.size();
    }

    public void addPassenger(Person person){
        if(this.getNumberOfPassengers() < this.capacity){
        this.passengers.add(person);}
    }

    public void removePassenger(Person person){
        this.passengers.remove(0);
    }

    public void pickupPassengerFromBusStop(Person person, BusStop busStop){
        busStop.removePersonFromQueue(person);
        this.addPassenger(person);
    }

}
