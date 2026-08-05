package cinema.seat;

import cinema.CinemaHall;

public class Seat {

    private CinemaHall cinemaHall;
    private int seatNumber;
    private int rowNumber;
    private int colNumber;
    private SeatType seatType;

    public Seat(CinemaHall cinemaHall, int seatNumber, int rowNumber, int colNumber, SeatType seatType) {
        this.cinemaHall = cinemaHall;
        this.seatNumber = seatNumber;
        this.rowNumber = rowNumber;
        this.colNumber = colNumber;
        this.seatType = seatType;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public int getRowNumber() {
        return rowNumber;
    }

    public int getColNumber() {
        return colNumber;
    }

    public SeatType getSeatType() {
        return seatType;
    }

    public CinemaHall getCinemaHall() {
        return cinemaHall;
    }

    public void setCinemaHall(CinemaHall cinemaHall) {
        this.cinemaHall = cinemaHall;
    }
}