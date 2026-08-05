package printer.reservation;

import cinema.seat.Seat;
import cinema.seat.SeatMovieScreening;
import company.Client;
import document.reservation.Reservation;

public class PrintClientReservations {

    public void printClientReservations(Client client) {

        System.out.println();
        System.out.println("---------------------------------------------------------------");
        System.out.println("                 CLIENT RESERVATIONS");
        System.out.println("---------------------------------------------------------------");

        System.out.println("Client: " + client.getClientFirstName());
        System.out.println("Email : " + client.getClientEmail());
        System.out.println();

        if (client.getReservations().isEmpty()) {
            System.out.println("No reservations found.");
            System.out.println("---------------------------------------------------------------");
            return;
        }

        String format =
                "%-12s %-35s %-12s %-8s %-10s %-10s %-25s%n";

        System.out.printf(format,
                "Cinema",
                "Movie",
                "Date",
                "Time",
                "Status",
                "Price",
                "Seats");

        System.out.println("-------------------------------------------------------------------------------------------------------------------------");

        for (Reservation reservation : client.getReservations()) {

            StringBuilder seats = new StringBuilder();

            for (SeatMovieScreening seatMovieScreening :
                    reservation.getSeatsChosenByClient().values()) {

                Seat seat = seatMovieScreening.getSeat();
                seats.append("[R")
                        .append(seat.getRowNumber())
                        .append(" S")
                        .append(seat.getSeatNumber())
                        .append("] ");
            }

            SeatMovieScreening firstSeat =
                    reservation.getSeatsChosenByClient()
                            .values()
                            .stream()
                            .findFirst()
                            .orElse(null);

            String cinemaName = "";

            if (firstSeat != null) {
                cinemaName = firstSeat.getSeat()
                        .getCinemaHall()
                        .getCinema()
                        .getName();
            }

            System.out.printf(format,
                    cinemaName,
                    reservation.getMovieScreening().getMovie().getTitle(),
                    reservation.getMovieScreening().getDate(),
                    reservation.getMovieScreening().getTime(),
                    reservation.getReservationStatus(),
                    reservation.getValueToPay(),
                    seats.toString());
        }

        System.out.println("-------------------------------------------------------------------------------------------------------------------------");
        System.out.println();
    }
}
