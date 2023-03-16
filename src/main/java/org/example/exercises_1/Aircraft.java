package exercises_1;

/**
 * Airplane.
 * @author Ruben
 */
public class Aircraft {
    private final String name;
    private final int numSeatsPerRow;
    private final int numRows;
    private final Seat[][] seats;

    /**
     * Constructor with 3 params.
     * @param name .
     * @param numSeatsPerRow .
     * @param numRows .
     */
    public Aircraft(String name, int numSeatsPerRow, int numRows) {
        this.name = name;
        this.numSeatsPerRow = numSeatsPerRow;
        this.numRows = numRows;
        seats = new Seat[numRows][numSeatsPerRow];

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numSeatsPerRow; j++) {
                seats[i][j] = new Seat(i + 1 + "" + (char)('A' + j));
            }
        }
    }

    /**
     * Printed all seats.
     */
    public void printAllSeats() {
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numSeatsPerRow; j++) {
                System.out.print(seats[i][j].seatNumber + " ");
            }
            System.out.println();
        }
    }

    /**
     * Seat reservation.
     * @param seatNumber .
     */
    public void reserveSeat(String seatNumber) {
        int row = seatNumber.charAt(0) - '0';
        int col = seatNumber.charAt(1) - 'A';

        if (row < 0 || row >= numRows || col < 0 || col >= numSeatsPerRow) {
            System.out.println("Invalid seat number.");
        } else {
            seats[row][col].reserve();
        }
    }

    /**
     * Cancel seat reserve.
     * @param seatNumber .
     */
    public void cancelSeat(String seatNumber) {
        int row = seatNumber.charAt(0) - '0';
        int col = seatNumber.charAt(1) - 'A';

        if (row < 0 || row >= numRows || col < 0 || col >= numSeatsPerRow) {
            System.out.println("Invalid seat number.");
        } else {
            seats[row][col].cancel();
        }
    }
}

