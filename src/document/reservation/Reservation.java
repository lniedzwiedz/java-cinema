package document.reservation;

import cinema.MovieScreening;
import cinema.seat.SeatMovieScreening;
import company.Client;

import java.util.HashMap;
import java.util.Map;

public class Reservation {

    private MovieScreening movieScreening;
    private Client client;
    private double valueToPay;
    private ReservationStatus reservationStatus;
    private Map<Integer, SeatMovieScreening> seatsChosenByClient = new HashMap<>();

    public Reservation(MovieScreening movieScreening) {
        this.movieScreening = movieScreening;
        this.reservationStatus = ReservationStatus.RESERVATION_DURING_CREATION;
        this.valueToPay = 0;
    }

    public Reservation(MovieScreening movieScreening, String email) {
        this(movieScreening);
        this.client = new Client(email);
        this.client.setClientFirstName("unregistered client/customer");
    }

    public Reservation(MovieScreening movieScreening, Client client) {
        this(movieScreening);
        this.client = client;
    }

    public Client getClient() {
        return client;
    }

    public double getValueToPay() {
        return valueToPay;
    }

    public MovieScreening getMovieScreening() {
        return movieScreening;
    }

    public ReservationStatus getReservationStatus() {
        return reservationStatus;
    }

    public Map<Integer, SeatMovieScreening> getSeatsChosenByClient() {
        return seatsChosenByClient;
    }

    public void addChosenSeat(SeatMovieScreening seatMovieScreening) {
        int seatNumber = seatMovieScreening.getSeat().getSeatNumber();
        if (!seatsChosenByClient.containsKey(seatNumber)) {
            seatsChosenByClient.put(seatNumber, seatMovieScreening);
            seatMovieScreening.temporarilyReserve();
            valueToPay += seatMovieScreening.getPrice();
        }
    }

    public void confirmReservationBeforePayment() {
        reservationStatus = ReservationStatus.CONFIRMED_RESERVATION_BEFORE_PAYMENT;
    }

    public void confirmReservationAfterPayment() {
        reservationStatus = ReservationStatus.CONFIRMED_RESERVATION_AFTER_PAYMENT;
        for (SeatMovieScreening seatMovieScreening : seatsChosenByClient.values()) {
            seatMovieScreening.reserve();
        }
    }

    public void cancelReservation() {
        reservationStatus = ReservationStatus.CANCELLED_RESERVATION;
        for (SeatMovieScreening seatMovieScreening : seatsChosenByClient.values()) {
            seatMovieScreening.cancelReservation();
        }
        valueToPay = 0;
    }

    public void printReservationStatus() {
        System.out.println("Reservation status: " + reservationStatus);
    }
}