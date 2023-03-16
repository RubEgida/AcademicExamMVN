package exercises_1;

/**
 * For test.
 * @author Ruben
 */
public class Main {
    /**
     * Working method.
     * @param args .
     */
    public static void main(String[] args) {
        Aircraft aircraft = new Aircraft("Boeing 747", 6, 4);
        aircraft.printAllSeats();
        aircraft.reserveSeat("2B");
        aircraft.cancelSeat("2B");
        aircraft.cancelSeat("2B");
    }
}