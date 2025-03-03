package Documents;

import CinemaData.MovieScreenig;
import CinemaData.ReservationSeatStatus;
import CinemaData.SeatMovieScreening;
import CompanyData.Client;

import java.util.ArrayList;

import static CinemaData.ReservationSeatStatus.*;
import static Documents.ReservationStatus.*;

public class Reservation {

    //private String reservationNumber;
    private MovieScreenig movieScreening;
    private Client client;
    private double valueToPay;
    private int reservationStatus;
    private ArrayList<SeatMovieScreening> seatsChosenByClient = new ArrayList<>();


    public Reservation(MovieScreenig movieScreenig) {
        this.movieScreening = movieScreenig;
        this.reservationStatus = ReservationStatus.getReservationStatus(RESERVATION_DURING_CREATION);
        this.valueToPay = 0;
    }

    public Reservation(MovieScreenig movieScreenig, String email) {
        this(movieScreenig);
        this.client = new Client(email); //one default client/ customer - database
        this.client.setClientFirstName("unregistered client/ customer");
    }

    public Reservation(MovieScreenig movieScreenig, Client client) {
        this(movieScreenig);
        this.client = client;
    }

    private void addClient(Client client) {
        this.client = client;
    }

    public Client getClient() {
        return this.client;
    }

    public double getValueToPay() {
        return this.valueToPay;
    }

    public void addChosenSeat(SeatMovieScreening seat) {
        this.seatsChosenByClient.add(seat);
        //setReservationData(); // update date -> UI, each time when user15
        this.movieScreening.getSeatMovieScreening(seat).setSeatKindOfReserved(ReservationSeatStatus.getReservationSeatStatus(NOT_RESERVED));
        this.valueToPay += Double.parseDouble(seat.getPrice());
    }

    public MovieScreenig getMovieScreenig() {
        return this.movieScreening;
    }

    public ArrayList<SeatMovieScreening> getSeatsChosenByClient() {
        return this.seatsChosenByClient;
    }

//    private void setReservationData() {
//        for (SeatMovieScreening seat : this.seatsChosenByClient) {
//            this.movieScreening.getSeatMovieScreening(seat).setSeatKindOfReserved(ReservationSeatStatus.getReservationSeatStatus(NOT_RESERVED));
//            //this.valueToPay = valueToPay + Double.parseDouble(seat.getPrice());
//            this.valueToPay += Double.parseDouble(seat.getPrice());
//            System.out.println("price: " + this.valueToPay);
//        }
//    }

    public void confirmReservationBeforePayment() {
        this.reservationStatus = ReservationStatus.getReservationStatus(CONFIRMED_RESERVATION_BEFORE_PAYMENT);
    }

    public void confirmReservationAfterPayment() {
        this.reservationStatus = ReservationStatus.getReservationStatus(CONFIRMED_RESERVATION_AFTER_PAYMENT);
        for (SeatMovieScreening seat : this.seatsChosenByClient) {
            this.movieScreening.getSeatMovieScreening(seat).setSeatKindOfReserved(ReservationSeatStatus.getReservationSeatStatus(TEMPORARILY_RESERVED));
        }
    }

    public void cancelReservation() {
        this.reservationStatus = ReservationStatus.getReservationStatus(CANCELLED_RESERVATION);
        for (SeatMovieScreening seat : this.seatsChosenByClient) {
            this.movieScreening.getSeatMovieScreening(seat).setSeatKindOfReserved(ReservationSeatStatus.getReservationSeatStatus(RESERVED));
        }
    }


}

