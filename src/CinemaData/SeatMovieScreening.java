package CinemaData;

public class SeatMovieScreening {

    private Seat seat;
    private SeatStatus seatStatus;
    private double price;
    public SeatMovieScreening(Seat seat, double price) {
        this.seat = seat;
        this.price = price;
        this.seatStatus = SeatStatus.AVAILABLE;
    }

    public Seat getSeat() {
        return seat;
    }

    public SeatStatus getSeatStatus() {
        return seatStatus;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Change status to reserved after successful payment
    public void reserve() {

        this.seatStatus = SeatStatus.RESERVED;
    }

    // Temporary reservation while client is making payment
    public void temporarilyReserve() {

        this.seatStatus = SeatStatus.TEMPORARILY_RESERVED;
    }

    // Release the seat after cancellation
    public void cancelReservation() {

        this.seatStatus = SeatStatus.AVAILABLE;
    }
}
