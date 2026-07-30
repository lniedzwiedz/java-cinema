package Printers;

import CinemaData.MovieScreening;
import CinemaData.Seat;
import CinemaData.SeatMovieScreening;
import Documents.Reservation;

public class PrintReservation {

    public void printReservationData(Reservation reservation) {

        System.out.println();
        System.out.println("------------------------------------------------------");
        System.out.println("              RESERVATION DETAILS");
        System.out.println("------------------------------------------------------");

        MovieScreening movieScreening = reservation.getMovieScreening();

        SeatMovieScreening firstSeat = reservation.getSeatsChosenByClient()
                .values()
                .stream()
                .findFirst()
                .orElse(null);

        if (firstSeat != null) {
            System.out.println("Cinema: " + firstSeat.getSeat().getCinemaHall().getCinema().getName());
            System.out.println("Address: " + firstSeat.getSeat().getCinemaHall().getCinema().getAddress());
        }

        System.out.println();
        System.out.println("Movie title: " + movieScreening.getMovie().getTitle());
        System.out.println("Date: " + movieScreening.getDate() + ", " + movieScreening.getTime());
        System.out.println();

        if (firstSeat != null) {
            System.out.println("cinema hall name: " + firstSeat.getSeat().getCinemaHall().getName());
        }

        System.out.println();
        System.out.println("SEATS:");

        for (SeatMovieScreening seatMovieScreening : reservation.getSeatsChosenByClient().values()) {
            Seat seat = seatMovieScreening.getSeat();
            System.out.println("Row: " + seat.getRowNumber());
            System.out.println("Seat number: " + seat.getSeatNumber());
            System.out.println("Type: " + seat.getSeatType());
            System.out.println("Status: " + seatMovieScreening.getSeatStatus());
            System.out.println("Price: " + seatMovieScreening.getPrice());
            System.out.println();
        }

        System.out.println("Client name: " + reservation.getClient().getClientFirstName());
        System.out.println("Email: " + reservation.getClient().getClientEmail());
        System.out.println();
        System.out.println("To pay: " + reservation.getValueToPay());
        System.out.println("------------------------------------------------------");
        System.out.println();
    }
}
