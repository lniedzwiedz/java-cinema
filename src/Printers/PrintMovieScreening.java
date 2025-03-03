package Printers;

import CinemaData.MovieScreenig;
import CinemaData.SeatMovieScreening;
import CompanyData.Client;
import Documents.Reservation;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import static Printers.PrinterColour.*;

public class PrintMovieScreening {

    private PrinterColour printerColour;

    public void printMovieScreeningData(MovieScreenig movieScreenig) {
        System.out.println(" ");
        System.out.println("------------------------------------------------------");
        System.out.println("--------------- Print Movie Screening ---------------");
        System.out.println("* CINEMA *");
        System.out.println("  " + movieScreenig.getSeatMovieScreening().getMovieSeat().getCinemaRoom().getCinema().getCinemaName());
        System.out.println("  " + movieScreenig.getSeatMovieScreening().getMovieSeat().getCinemaRoom().getCinema().getCinemaAddress());

        System.out.println("* MOVIE *");
        System.out.println("  " + movieScreenig.getMovieData().getTitle());
        System.out.println("  " + movieScreenig.getMovieData().getKind() + ", "
                + movieScreenig.getMovieData().getLanguage());

        String movieStartMinute = (movieScreenig.getTime().getMinute() < 10) ? ("0" + movieScreenig.getTime().getMinute()) : Integer.toString(movieScreenig.getTime().getMinute());
        System.out.println("  " + movieScreenig.getDate().getDayOfWeek() + ", " + movieScreenig.getDate().getDayOfMonth() + " " + movieScreenig.getDate().getMonth()
                + ", " + movieScreenig.getTime().getHour() + ":" + movieStartMinute);

        System.out.print("      |  SEATS");
        String currentRow = "";
        for (SeatMovieScreening sms : movieScreenig.getMovieSeats()) {

            if (!currentRow.equals(sms.getMovieSeat().getRow())) {
                currentRow = sms.getMovieSeat().getRow();
                System.out.print("\nROW  " + sms.getMovieSeat().getRow() + "   |");
            }

            if (sms.getSeatKindOfReserved() == 0) {
                System.out.print("  "
                        + getPrinterColour(GREEN)
                        + sms.getMovieSeat().getColNumber() + sms.getSeatKindOfReserved()
                        + getPrinterColour(RESET) + "  |  ");

            } else if (sms.getSeatKindOfReserved() == 1) {
                System.out.print("  "
                        + getPrinterColour(YELLOW)
                        + sms.getSeatKindOfReserved() + sms.getSeatKindOfReserved()
                        + getPrinterColour(RESET) + "  |  ");

            } else if (sms.getSeatKindOfReserved() == 2) {
                System.out.print("  "
                        + getPrinterColour(RED)
                        + sms.getSeatKindOfReserved() + sms.getSeatKindOfReserved()
                        + getPrinterColour(RESET) + "  |  ");

            } else {
                System.out.print("  "
                        + sms.getSeatKindOfReserved()
                        + "  |  ");
            }
        }

        System.out.println();
        System.out.println("------------------------------------------------------");
    }

    private String printSeats(Reservation reservation) {
        String seats = "";

        for (SeatMovieScreening sms : reservation.getSeatsChosenByClient()) {
            seats += " | row: " + sms.getMovieSeat().getRow() + ", ";
            seats += "col: " + sms.getMovieSeat().getColNumber() + ", ";
            seats += "kind: " + sms.getSeatType() + ", ";
            seats += "price: " + sms.getPrice() + " | ";
        }

        return seats;
    }

    public void printClientReservations(Client client) {
        ArrayList<Reservation> clientReservations = client.getReservations();

        //String columnName = "%-40s%10s%20s%20s%30s%90s\n";
        String columnName = "%-10s%40s%50s%10s%30s%90s\n";
        System.out.printf(columnName, "Cinema", "Movie title", "Date", "Hour", "Price", "Seats");

        for (Reservation r : clientReservations) {

            System.out.printf(columnName,
                    (r.getMovieScreenig().getSeatMovieScreening().getMovieSeat().getCinemaRoom().getCinema().getCinemaName()),
                    (r.getMovieScreenig().getMovieData().getTitle()),
                    (r.getMovieScreenig().getDate()),
                    (r.getMovieScreenig().getTime()),
                    (r.getValueToPay()),
                    ("      "+(printSeats(r)))
            );

        }
    }
}
