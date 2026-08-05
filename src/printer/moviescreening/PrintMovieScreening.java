package printer.moviescreening;

import cinema.*;
import cinema.seat.Seat;
import cinema.seat.SeatMovieScreening;
import cinema.seat.SeatStatus;
import printer.ConsoleColor;

public class PrintMovieScreening {

    private ConsoleColor printerColour;

    public void printMovieScreeningData(MovieScreening movieScreening) {

        System.out.println();
        System.out.println("------------------------------------------------------");
        System.out.println("              MOVIE SCREENING");
        System.out.println("------------------------------------------------------");
        System.out.println("* CINEMA *");

        SeatMovieScreening firstSeat =
                movieScreening.getSeats().values().stream()
                        .findFirst()
                        .orElse(null);

        if (firstSeat != null) {
            CinemaHall hall = firstSeat.getSeat().getCinemaHall();
            System.out.println("  " + hall.getCinema().getName());
            System.out.println("  " + hall.getCinema().getAddress());
        }

        System.out.println();
        System.out.println("* MOVIE *");
        System.out.println("  " + movieScreening.getMovie().getTitle());
        System.out.println("  " + movieScreening.getMovie().getKind() + ", " + movieScreening.getMovie().getLanguage());

        String movieStartMinute = (movieScreening.getTime().getMinute() < 10)
                ? "0" + movieScreening.getTime().getMinute()
                : String.valueOf(movieScreening.getTime().getMinute());

        System.out.println("  "
                + movieScreening.getDate().getDayOfWeek() + ", "
                + movieScreening.getDate().getDayOfMonth() + " "
                + movieScreening.getDate().getMonth() + ", "
                + movieScreening.getTime().getHour() + ":"
                + movieStartMinute);

        System.out.println();
        System.out.println("      |  SEATS");

        int currentRow = -1;

        for (SeatMovieScreening sms : movieScreening.getSeats().values()) {

            Seat seat = sms.getSeat();

            if (currentRow != seat.getRowNumber()) {
                currentRow = seat.getRowNumber();
                System.out.print("\nROW  " + seat.getRowNumber() + "   |");
            }

            String colour;

            if (sms.getSeatStatus() == SeatStatus.AVAILABLE) {
                colour = ConsoleColor.GREEN.getCode();
            } else if (sms.getSeatStatus() == SeatStatus.TEMPORARILY_RESERVED) {
                colour = ConsoleColor.YELLOW.getCode();
            } else if (sms.getSeatStatus() == SeatStatus.RESERVED) {
                colour = ConsoleColor.RED.getCode();
            } else {
                colour = ConsoleColor.RESET.getCode();
            }

            System.out.print("  " + colour + seat.getSeatNumber() + ConsoleColor.RESET.getCode() + "  |");
        }

        System.out.println();
        System.out.println("------------------------------------------------------");
        System.out.println();
    }
}
