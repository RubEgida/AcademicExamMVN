package exercises_1;

/**
 * Seats management in Airplane.
 * @author Ruben
 */
public class Seat {
    String seatNumber;
    private boolean reserved;

    /**
     * Constructor with seatNumber param.
     * @param seatNumber .
     */
    public Seat(String seatNumber) {
        this.seatNumber = seatNumber;
        this.reserved = false;
    }

    /**
     * Give message seat reserved or no.
     */
    public void reserve() {
        if (!reserved) {
            reserved = true;
            System.out.println("Seat " + seatNumber + " is now reserved.");
        } else {
            System.out.println("Seat " + seatNumber + " is already reserved.");
        }
    }

    /**
     * Reserve canceling.
     */
    public void cancel() {
        if (reserved) {
            reserved = false;
            System.out.println("Seat " + seatNumber + " is now cancelled.");
        } else {
            System.out.println("Seat " + seatNumber + " was not reserved.");
        }
    }

}
