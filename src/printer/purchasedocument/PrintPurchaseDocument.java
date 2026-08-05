package printer.purchasedocument;

import cinema.MovieScreening;
import cinema.seat.Seat;
import cinema.seat.SeatMovieScreening;
import document.PurchaseDocument;
import payments.Payment;

public class PrintPurchaseDocument {

    public void printPurchaseDocumentData(PurchaseDocument purchaseDocument, Payment payment) {

        System.out.println();
        System.out.println("------------------------------------------------------");
        System.out.println("            PURCHASE DOCUMENT DETAILS");
        System.out.println("------------------------------------------------------");

        MovieScreening movieScreening = purchaseDocument.getReservation().getMovieScreening();

        SeatMovieScreening firstSeat = purchaseDocument.getReservation().getSeatsChosenByClient().values().stream().findFirst().orElse(null);

        if (firstSeat != null) {
            System.out.println("Cinema: " + firstSeat.getSeat().getCinemaHall().getCinema().getName());
            System.out.println("Address: " + firstSeat.getSeat().getCinemaHall().getCinema().getAddress());
        }

        System.out.println();
        System.out.println("Movie title: " + movieScreening.getMovie().getTitle());

        System.out.println("Date: " + movieScreening.getDate() + ", " + movieScreening.getTime());
        System.out.println();

        if (firstSeat != null)
            System.out.println("Cinema hall: " + firstSeat.getSeat().getCinemaHall().getName());

        System.out.println();
        System.out.println("SEATS:");

        for (SeatMovieScreening seatMovieScreening : purchaseDocument.getReservation().getSeatsChosenByClient().values()) {
            Seat seat = seatMovieScreening.getSeat();
            System.out.println("Row: " + seat.getRowNumber());
            System.out.println("Seat number: " + seat.getSeatNumber());
            System.out.println("Type: " + seat.getSeatType());
            System.out.println("Status: " + seatMovieScreening.getSeatStatus());
            System.out.println("Price: " + seatMovieScreening.getPrice());
            System.out.println();
        }

        System.out.println("Client name: " + purchaseDocument.getReservation().getClient().getClientFirstName());
        System.out.println("Email: " + purchaseDocument.getReservation().getClient().getClientEmail());
        System.out.println();

        System.out.println("Payment status: " + payment.getPaymentStatus());
        System.out.println("Amount to pay: " + purchaseDocument.getReservation().getValueToPay());
        System.out.println("------------------------------------------------------");
        System.out.println();
    }
}