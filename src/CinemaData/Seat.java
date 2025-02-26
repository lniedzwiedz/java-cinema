package CinemaData;

public class Seat {

    private String seatNumber;
    private String rowNumber;
    private String colNumber;
    private CinemaRoom cinemaRoom;


    public Seat(String seatNumber, String rowNumber, String colNumber, CinemaRoom cinemaRoom) {
        this.seatNumber = seatNumber;
        this.rowNumber = rowNumber;
        this.colNumber = colNumber;
        this.cinemaRoom = cinemaRoom;
    }

    public String getSeatNumber() {
        return this.seatNumber;
    }


    public String getRow() {
        return this.rowNumber;
    }

    public CinemaRoom getCinemaRoom() {
        return this.cinemaRoom;
    }



}
