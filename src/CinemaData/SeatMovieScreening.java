package CinemaData;

public class SeatMovieScreening {

    private String seatType;
    private String price;
    private int seatKindOfReserved;
    private Seat movieSeat;

    public SeatMovieScreening(Seat seat, String seatType, String price) {
        this.movieSeat = seat;
        this.seatType = seatType;
        this.price = price;
        this.seatKindOfReserved = 0;
    }

    public Seat getMovieSeat() {
        return this.movieSeat;
    }

    public String getSeatType() {
        return this.seatType;
    }

    public String getPrice() {
        return this.price;
    }

    public int getSeatKindOfReserved() {
        return this.seatKindOfReserved;
    }

    public void setSeatKindOfReserved(int seatKindOfReserved) {
        this.seatKindOfReserved = seatKindOfReserved;
    }



}
