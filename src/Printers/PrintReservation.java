package Printer;

import CinemaData.SeatMovieScreening;
import Documents.Reservation;

public class PrintReservation {

    public void printReservationDetails(Reservation reservation) {
        System.out.println("------------------------------------------------------");
        System.out.println("   RESERVATION DETAILS   ");
        System.out.println();
        System.out.println("Company.Company.Cinema: " + reservation.getMovieScreenig().getSeatMovieScreening().getMovieSeat().getCinemaRoom().getCinema().getCinemaName());
        System.out.println("Address: " + reservation.getMovieScreenig().getSeatMovieScreening().getMovieSeat().getCinemaRoom().getCinema().getCinemaAddress());
        System.out.println();
        System.out.println("movie title: " + reservation.getMovieScreenig().getMovieData().getTitle());
        System.out.println("date: " + reservation.getMovieScreenig().getDate() + ", " + reservation.getMovieScreenig().getTime());
        System.out.println();
        System.out.println("room name: " + reservation.getMovieScreenig().getSeatMovieScreening().getMovieSeat());

        for (SeatMovieScreening seat : reservation.getSeatsChosenByClient()) {
            System.out.println("ROW: " + seat.getMovieSeat().getRow() + ", ");
            System.out.print("seat: " +  seat.getMovieSeat().getSeatNumber() + ", ");
            System.out.print("testtttttttt: " +  seat.getSeatKindOfReserved() + ", ");
            System.out.print(seat.getSeatType()+ ", ");
            System.out.print(seat.getPrice() + ", ");
            System.out.println();

            System.out.println();
        }
        System.out.println("client name: " + reservation.getClient().getClientEmail());
        System.out.println("email: " + reservation.getClient().getClientFirstName());
        System.out.println();
        System.out.println("to pay: " + reservation.getClient().getClientEmail());

        System.out.println("------------------------------------------------------");
        System.out.println();
    }

}
