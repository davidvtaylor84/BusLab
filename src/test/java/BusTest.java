import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {

    private Bus bus;
    private Person person;

    private BusStop busStop;

    @Before
    public void before() {
        bus = new Bus("Leith", 10);
        person = new Person();
        busStop = new BusStop("Easter Road");
    }

    @Test
    public void canGetNumberOfPassengers() {
//        bus.addPassenger(person);
        assertEquals(0, bus.getNumberOfPassengers());
    }

    @Test
    public void canAddPassengersToBus() {
        bus.addPassenger(person);
        assertEquals(1, bus.getNumberOfPassengers());
    }

    @Test
    public void canCheckIfBusIsOverCapacity() {
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        assertEquals(10, bus.getNumberOfPassengers());
    }

    @Test
    public void canRemovePassenger(){
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.removePassenger(person);
        assertEquals(2, bus.getNumberOfPassengers());
    }

    @Test
    public void canPickUpPassengers(){
        busStop.addPersonToQueue(person);
        bus.pickupPassengerFromBusStop(person, busStop);
        assertEquals(0, busStop.getQueueLength());
        assertEquals(1, bus.getNumberOfPassengers());
    }
}
