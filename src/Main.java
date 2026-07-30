import CinemaData.*;
import CompanyData.Cinema;
import CompanyData.Client;
import CompanyData.Company;
import CompanyData.Movie;
import Documents.PurchaseDocument;
import Documents.Reservation;
import Printers.PrintClientReservations;
import Printers.PrintMovieScreening;
import Printers.PrintPurchaseDocument;
import Printers.PrintReservation;

public class Main {

    public static void main(String[] args) {

//      company
        Company headquarter = new Company("Headquarter", "address, Warszawa 77-777, Aleje Pokoju 77");

//      cinema
        Cinema cinema1 = new Cinema(headquarter, "Kino 1", "Krakow 11-111, Aleje Przyjazni 33");
        Cinema cinema2 = new Cinema(headquarter, "Kino 2", "Krakow 22-222, Aleje Marzen 22");

        headquarter.setCinema(cinema1);
        headquarter.setCinema(cinema2);

//      // movie
        Movie movie1 = new Movie("Pirates of the Caribbean: The Curse of the Black Pearl ", "3D", "Comedy", "110", "ENG");
        Movie movie2 = new Movie("Pirates of the Caribbean: Dead Man's Chest", "2D", "Comedy", "130", "ENG");
        Movie movie3 = new Movie("Pirates of the Caribbean: At World's End ", "2D", "Comedy", "130", "ENG");
        Movie movie4 = new Movie("Pirates of the Caribbean: On Stranger Tides", "2D", "Comedy", "130", "ENG");
        Movie movie5 = new Movie("Pirates of the Caribbean: Dead Men Tell No Tales", "2D", "Comedy", "130", "ENG");

        headquarter.setMovie(movie1);
        headquarter.setMovie(movie2);
        headquarter.setMovie(movie3);
        headquarter.setMovie(movie4);
        headquarter.setMovie(movie5);

//      // cinema1  -> cinemaHall1
        CinemaHall cinema1Hall1 = new CinemaHall(cinema1, "hall 1");
        Seat c1h1seat1 = new Seat(cinema1Hall1, 1, 1, 1, SeatType.STANDARD);
        Seat c1h1seat2 = new Seat(cinema1Hall1, 2, 1, 2, SeatType.STANDARD);
        Seat c1h1seat3 = new Seat(cinema1Hall1, 3, 1, 3, SeatType.ACCESSIBLE);
        Seat c1h1seat4 = new Seat(cinema1Hall1, 4, 2, 1, SeatType.VIP);
        Seat c1h1seat5 = new Seat(cinema1Hall1, 5, 2, 2, SeatType.COUPLE);
        Seat c1h1seat6 = new Seat(cinema1Hall1, 6, 2, 3, SeatType.PREMIUM);

        cinema1Hall1.addSeat(c1h1seat1);
        cinema1Hall1.addSeat(c1h1seat2);
        cinema1Hall1.addSeat(c1h1seat3);
        cinema1Hall1.addSeat(c1h1seat4);
        cinema1Hall1.addSeat(c1h1seat5);
        cinema1Hall1.addSeat(c1h1seat6);

        // cinema1 -> cinemaHall1 -> seats for 1 movie screening 1
        SeatMovieScreening c1ms1Seat1 = new SeatMovieScreening(c1h1seat1, 29.99);
        SeatMovieScreening c1ms1Seat2 = new SeatMovieScreening(c1h1seat2, 49.99);
        SeatMovieScreening c1ms1Seat3 = new SeatMovieScreening(c1h1seat3, 29.99);
        SeatMovieScreening c1ms1Seat4 = new SeatMovieScreening(c1h1seat4, 29.99);
        SeatMovieScreening c1ms1Seat5 = new SeatMovieScreening(c1h1seat5, 49.99);
        SeatMovieScreening c1ms1Seat6 = new SeatMovieScreening(c1h1seat6, 29.99);

//      // cinema1 -> movie screening 1
        MovieScreening c1ms1 = new MovieScreening(movie1, "2026-08-04", "17:00:00");
        c1ms1.addSeat(c1ms1Seat1);
        c1ms1.addSeat(c1ms1Seat2);
        c1ms1.addSeat(c1ms1Seat3);
        c1ms1.addSeat(c1ms1Seat4);
        c1ms1.addSeat(c1ms1Seat5);
        c1ms1.addSeat(c1ms1Seat6);

//       cinema1 -> cinemaHall1 -> seats for 1 movie screening 2
        SeatMovieScreening c1ms2Seat1 = new SeatMovieScreening(c1h1seat1, 31.99);
        SeatMovieScreening c1ms2Seat2 = new SeatMovieScreening(c1h1seat2, 23.99);
        SeatMovieScreening c1ms2Seat3 = new SeatMovieScreening(c1h1seat3, 27.99);
        SeatMovieScreening c1ms2Seat4 = new SeatMovieScreening(c1h1seat4, 24.99);
        SeatMovieScreening c1ms2Seat5 = new SeatMovieScreening(c1h1seat5, 30.99);
        SeatMovieScreening c1ms2Seat6 = new SeatMovieScreening(c1h1seat6, 29.99);

        // cinema1 -> movie screening 2
        MovieScreening c1ms2 = new MovieScreening(movie2, "2027-03-10", "19:00:00");
        c1ms2.addSeat(c1ms2Seat1);
        c1ms2.addSeat(c1ms2Seat2);
        c1ms2.addSeat(c1ms2Seat3);
        c1ms2.addSeat(c1ms2Seat4);
        c1ms2.addSeat(c1ms2Seat5);
        c1ms2.addSeat(c1ms2Seat6);

        PrintMovieScreening printMovieScreening = new PrintMovieScreening();
        System.out.println("---------- BEFORE RESERVATION ----------");
        printMovieScreening.printMovieScreeningData(c1ms1);
//        printMovieScreening.printMovieScreeningData(ms2);

        //  client/ customer
        Client client1 = new Client("John1234@gmail.com");
        client1.setClientFirstName("John");
        headquarter.setClient(client1);

        // reservation with registered client/ customer
        Reservation res1c1 = new Reservation(c1ms1, client1);
        res1c1.addChosenSeat(c1ms1Seat1);
        res1c1.addChosenSeat(c1ms1Seat4);
        res1c1.confirmReservationBeforePayment();
        client1.addReservation(res1c1);

        Reservation res2c1 = new Reservation(c1ms1, client1);
        res2c1.addChosenSeat(c1ms1Seat5);
        res2c1.addChosenSeat(c1ms1Seat6);
        res2c1.confirmReservationBeforePayment();
        client1.addReservation(res2c1);

        PrintReservation pr = new PrintReservation();
        pr.printReservationData(res1c1);
        pr.printReservationData(res2c1);

        // reservation without registered client/ customer
        Reservation res2 = new Reservation(c1ms2, "host@test1.com");
        res2.addChosenSeat(c1ms2Seat2);
        res2.addChosenSeat(c1ms2Seat3);
        res2.confirmReservationBeforePayment();


        //movie screening - after reservation
        System.out.println("---------- AFTER RESERVATION ----------");
        printMovieScreening.printMovieScreeningData(c1ms1);
//        printMovieScreening.printMovieScreeningData(ms2);

        PurchaseDocument pm1 = new PurchaseDocument(res1c1);
        pm1.payForReservation(true, true);

        PrintPurchaseDocument ppd = new PrintPurchaseDocument();
        ppd.printPurchaseDocumentData(pm1);

        //movie screening - after payment
        System.out.println("---------- AFTER PAYMENT ----------");
        printMovieScreening.printMovieScreeningData(c1ms1);
//        printMovieScreening.printMovieScreeningData(ms2);

//      XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
//      cinema2

        // cinema2 -> cinema2Hall1
        CinemaHall cinema2Hall1 = new CinemaHall(cinema2, "hall 1");
        Seat c2h1seat1 = new Seat(cinema2Hall1, 1, 1, 1, SeatType.STANDARD);
        Seat c2h1seat2 = new Seat(cinema2Hall1, 2, 1, 2, SeatType.STANDARD);
        Seat c2h1seat3 = new Seat(cinema2Hall1, 3, 1, 3, SeatType.ACCESSIBLE);
        Seat c2h1seat4 = new Seat(cinema2Hall1, 4, 2, 1, SeatType.VIP);
        Seat c2h1seat5 = new Seat(cinema2Hall1, 5, 2, 2, SeatType.COUPLE);
        Seat c2h1seat6 = new Seat(cinema2Hall1, 6, 2, 3, SeatType.PREMIUM);

        cinema2Hall1.addSeat(c2h1seat1);
        cinema2Hall1.addSeat(c2h1seat2);
        cinema2Hall1.addSeat(c2h1seat3);
        cinema2Hall1.addSeat(c2h1seat4);
        cinema2Hall1.addSeat(c2h1seat5);
        cinema2Hall1.addSeat(c2h1seat6);

        // cinema2 -> cinema2Hall1 -> seats for 1 movie screening 1
        SeatMovieScreening c2ms1Seat1 = new SeatMovieScreening(c2h1seat1, 29.99);
        SeatMovieScreening c2ms1Seat2 = new SeatMovieScreening(c2h1seat2, 49.99);
        SeatMovieScreening c2ms1Seat3 = new SeatMovieScreening(c2h1seat3, 29.99);
        SeatMovieScreening c2ms1Seat4 = new SeatMovieScreening(c2h1seat4, 29.99);
        SeatMovieScreening c2ms1Seat5 = new SeatMovieScreening(c2h1seat5, 49.99);
        SeatMovieScreening c2ms1Seat6 = new SeatMovieScreening(c2h1seat6, 29.99);

        // cinema2 -> movie screening 1
        MovieScreening c2ms1 = new MovieScreening(movie1, "2026-08-04", "17:00:00");
        c2ms1.addSeat(c2ms1Seat1);
        c2ms1.addSeat(c2ms1Seat2);
        c2ms1.addSeat(c2ms1Seat3);
        c2ms1.addSeat(c2ms1Seat4);
        c2ms1.addSeat(c2ms1Seat5);
        c2ms1.addSeat(c2ms1Seat6);

        //  cinema2 -> cinema2Hall1 -> seats for 2 movie screening 2
        SeatMovieScreening c2ms2Seat1 = new SeatMovieScreening(c2h1seat1, 29.99);
        SeatMovieScreening c2ms2Seat2 = new SeatMovieScreening(c2h1seat2, 49.99);
        SeatMovieScreening c2ms2Seat3 = new SeatMovieScreening(c2h1seat3, 29.99);
        SeatMovieScreening c2ms2Seat4 = new SeatMovieScreening(c2h1seat4, 29.99);
        SeatMovieScreening c2ms2Seat5 = new SeatMovieScreening(c2h1seat5, 49.99);
        SeatMovieScreening c2ms2Seat6 = new SeatMovieScreening(c2h1seat6, 29.99);

//      // cinema2 -> movie screening 2
        MovieScreening c2ms2 = new MovieScreening(movie2, "2026-08-10", "19:00:00");
        c2ms2.addSeat(c2ms2Seat1);
        c2ms2.addSeat(c2ms2Seat2);
        c2ms2.addSeat(c2ms2Seat3);
        c2ms2.addSeat(c2ms2Seat4);
        c2ms2.addSeat(c2ms2Seat5);
        c2ms2.addSeat(c2ms2Seat6);

        System.out.println("---------- BEFORE RESERVATION ----------");
        printMovieScreening.printMovieScreeningData(c2ms1);
//        printMovieScreening.printMovieScreeningData(c2ms2);

        // client/ customer
        Client client2 = new Client("zuza13n@gmail.com");
        client2.setClientFirstName("Zuza");
        headquarter.setClient(client2);

        // reservation with registered client/ customer
        Reservation c2res1 = new Reservation(c2ms1, client2);
        c2res1.addChosenSeat(c2ms1Seat2);
        c2res1.confirmReservationBeforePayment();
        client2.addReservation(c2res1);
        PrintReservation c2pr1 = new PrintReservation();
        pr.printReservationData(c2res1);

//        // reservation without registered client/ customer
        Reservation c2res2 = new Reservation(c2ms2, "host234@test1.com");
        c2res2.addChosenSeat(c2ms2Seat4);
        c2res2.addChosenSeat(c2ms2Seat5);
        c2res2.confirmReservationBeforePayment();
//        pr.printReservationDetails(res2c2);

        // reservation with registered client/ customer
        Reservation res3c2 = new Reservation(c2ms1, client1);
        res3c2.addChosenSeat(c2ms1Seat6);
        res3c2.confirmReservationBeforePayment();
        client1.addReservation(res3c2);
//        pr.printReservationDetails(res3c2);

        //movie screening - after reservation
        System.out.println("---------- AFTER RESERVATION ----------");
        printMovieScreening.printMovieScreeningData(c2ms1);
        printMovieScreening.printMovieScreeningData(c2ms2);

        PurchaseDocument c2pm1 = new PurchaseDocument(c2res1);
        c2pm1.payForReservation(true, true);

        PrintPurchaseDocument c2ppd = new PrintPurchaseDocument();
        c2ppd.printPurchaseDocumentData(c2pm1);

        //movie screening - after payment
        System.out.println("---------- AFTER PAYMENT ----------");
        printMovieScreening.printMovieScreeningData(c2ms1);
        printMovieScreening.printMovieScreeningData(c2ms2);

        PrintClientReservations pcr = new PrintClientReservations();
        pcr.printClientReservations(client1);
    }
}