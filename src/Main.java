import CinemaData.*;
import CompanyData.Cinema;
import CompanyData.Client;
import CompanyData.Company;
import CompanyData.Movie;
import Documents.Reservation;
import Printers.PrintMovieScreening;
import Printers.PrintReservation;

public class Main {

    public static void main(String[] args) {

//      company
        Company headquarter = new Company("Headquarter", "address, Warszawa 77-777, Aleje Pokoju 77");

//      cinema
        Cinema cinema1 = new Cinema(headquarter,"Kino 1", "Krakow 11-111, Aleje Przyjazni 33");
        Cinema cinema2 = new Cinema(headquarter,"Kino 2", "Krakow 22-222, Aleje Marzen 22");

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
        CinemaHall cinemaHall1 = new CinemaHall(cinema1, "room 1");
        Seat seat1 = new Seat(cinemaHall1,1, 1, 1, SeatType.STANDARD);
        Seat seat2 = new Seat(cinemaHall1, 2, 1, 2, SeatType.STANDARD);
        Seat seat3 = new Seat(cinemaHall1, 3, 1, 3, SeatType.ACCESSIBLE);

        Seat seat4 = new Seat(cinemaHall1,4, 2, 1, SeatType.VIP);
        Seat seat5 = new Seat(cinemaHall1, 5, 2, 2, SeatType.COUPLE);
        Seat seat6 = new Seat(cinemaHall1,6, 2, 3, SeatType.PREMIUM);

        cinemaHall1.addSeat(seat1);
        cinemaHall1.addSeat(seat2);
        cinemaHall1.addSeat(seat3);
        cinemaHall1.addSeat(seat4);
        cinemaHall1.addSeat(seat5);
        cinemaHall1.addSeat(seat6);

      // cinema1 -> cinemaHall1 -> seats for 1 movie screening 1
        SeatMovieScreening msSeat1 = new SeatMovieScreening(seat1, 29.99);
        SeatMovieScreening msSeat2 = new SeatMovieScreening(seat2, 49.99);
        SeatMovieScreening msSeat3 = new SeatMovieScreening(seat3, 29.99);
        SeatMovieScreening msSeat4 = new SeatMovieScreening(seat4, 29.99);
        SeatMovieScreening msSeat5 = new SeatMovieScreening(seat5, 49.99);
        SeatMovieScreening msSeat6 = new SeatMovieScreening(seat6, 29.99);

//      // cinema1 -> movie screening 1
        MovieScreening ms1 = new MovieScreening(movie1, "2026-08-04", "17:00:00");
        ms1.addSeat(msSeat1);
        ms1.addSeat(msSeat2);
        ms1.addSeat(msSeat3);
        ms1.addSeat(msSeat4);
        ms1.addSeat(msSeat5);
        ms1.addSeat(msSeat6);

//       cinema1 -> cinemaHall1 -> seats for 2 movie screening 2
//        SeatMovieScreening seatMS1b = new SeatMovieScreening(seat1, 31.99);
//        SeatMovieScreening seatMS2b = new SeatMovieScreening(seat2, 23.99);
//        SeatMovieScreening seatMS3b = new SeatMovieScreening(seat3, 27.99);
//        SeatMovieScreening seatMS4b = new SeatMovieScreening(seat4, 24.99);
//        SeatMovieScreening seatMS5b = new SeatMovieScreening(seat5, 30.99);
//        SeatMovieScreening seatMS6b = new SeatMovieScreening(seat6, 29.99);

      // cinema1 -> movie screening 2
//        MovieScreening ms2 = new MovieScreening(movie2, "2027-03-10", "19:00:00");
//        ms2.addSeat(seatMS1b);
//        ms2.addSeat(seatMS2b);
//        ms2.addSeat(seatMS3b);
//        ms2.addSeat(seatMS4b);
//        ms2.addSeat(seatMS5b);
//        ms2.addSeat(seatMS6b);

        PrintMovieScreening printMovieScreening = new PrintMovieScreening();
        System.out.println("---------- BEFORE RESERVATION ----------");
        printMovieScreening.printMovieScreeningData(ms1);
//        printMovieScreening.printMovieScreeningData(ms2);

       //  client/ customer
        Client c1 = new Client("John1234@gmail.com");
        c1.setClientFirstName("John");

        // reservation with registered client/ customer
        Reservation res1c1 = new Reservation(ms1, c1);
        res1c1.addChosenSeat(msSeat1);
        res1c1.addChosenSeat(msSeat4);
        res1c1.confirmReservationBeforePayment();
        c1.addReservation(res1c1);

        Reservation res2c1 = new Reservation(ms1, c1);
        res2c1.addChosenSeat(msSeat5);
        res2c1.addChosenSeat(msSeat6);
        res2c1.confirmReservationBeforePayment();
        c1.addReservation(res2c1);

        PrintReservation pr = new PrintReservation();
//        pr.printReservationDetails(res1a);
//        pr.printReservationDetails(res1b);

//      // reservation without registered client/ customer
//        Reservation res2 = new Reservation(ms2, "host@test1.com");
//        res2.addChosenSeat(seatMS2b);
//        res2.addChosenSeat(seatMS3b);
//        res2.confirmReservationBeforePayment();


       //movie screening - after reservation
        System.out.println("---------- AFTER RESERVATION ----------");
        printMovieScreening.printMovieScreeningData(ms1);
//        printMovieScreening.printMovieScreeningData(ms2);

//        PurchaseDocument pm1 = new PurchaseDocument(res1);
//        pm1.payForReservation(true, true);
//
//        PrintPurchaseDocument ppd = new PrintPurchaseDocument();
////        ppd.printPurchaseDocumentDetails(pm1);
////
////        //movie screening - after payment
////        System.out.println("---------- AFTER PAYMENT ----------");
////        printMovieScreening.printMovieScreeningData(ms1);
////        printMovieScreening.printMovieScreeningData(ms2);
//
////      XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
////      cinema2
//        Cinema cinema2 = new Cinema("Kino Warszawa", "ul. war, 30-123 Warszawa");
//        cinema2.setCompany(headquarter);
//
////      // cinema2 -> cinema2Room1
//        CinemaHall cinema2Room1 = new CinemaHall(cinema2, "room 1");
//        Seat seat1c2 = new Seat("1", "1", "1", cinema2Room1);
//        Seat seat2c2 = new Seat("2", "1", "2", cinema2Room1);
//        Seat seat3c2 = new Seat("3", "1", "3", cinema2Room1);
//
//        Seat seat4c2 = new Seat("4", "2", "1", cinema2Room1);
//        Seat seat5c2 = new Seat("5", "2", "2", cinema2Room1);
//        Seat seat6c2 = new Seat("6", "2", "3", cinema2Room1);
//
//        cinema2Room1.addSeat(seat1c2);
//        cinema2Room1.addSeat(seat2c2);
//        cinema2Room1.addSeat(seat3c2);
//        cinema2Room1.addSeat(seat4c2);
//        cinema2Room1.addSeat(seat5c2);
//        cinema2Room1.addSeat(seat6c2);
//
////       // cinema2 -> cinema2Room1 -> seats for 1 movie screening 1
//        SeatMovieScreening seatMS1c2 = new SeatMovieScreening(seat1c2, "STANDARD", "27.99");
//        SeatMovieScreening seatMS2c2 = new SeatMovieScreening(seat2c2, "VIP", "37.99");
//        SeatMovieScreening seatMS3c2 = new SeatMovieScreening(seat3c2, "STANDARD", "27.99");
//        SeatMovieScreening seatMS4c2 = new SeatMovieScreening(seat4c2, "STANDARD", "27.99");
//        SeatMovieScreening seatMS5c2 = new SeatMovieScreening(seat5c2, "VIP", "37.99");
//        SeatMovieScreening seatMS6c2 = new SeatMovieScreening(seat6c2, "STANDARD", "27.99");
//
////       // cinema2 -> movie screening 1
//        MovieScreening ms1c2 = new MovieScreening(movie1, "2025-02-04", "17:00:00");
//        ms1c2.addSeat(seatMS1c2);
//        ms1c2.addSeat(seatMS2c2);
//        ms1c2.addSeat(seatMS3c2);
//        ms1c2.addSeat(seatMS4c2);
//        ms1c2.addSeat(seatMS5c2);
//        ms1c2.addSeat(seatMS6c2);
//
////      //  cinema2 -> cinema2Room1 -> seats for 2 movie screening 2
//        SeatMovieScreening seatMS1bc2 = new SeatMovieScreening(seat1c2, "STANDARD", "29.99");
//        SeatMovieScreening seatMS2bc2 = new SeatMovieScreening(seat2c2, "VIP", "29.99");
//        SeatMovieScreening seatMS3bc2 = new SeatMovieScreening(seat3c2, "VIP", "29.99");
//        SeatMovieScreening seatMS4bc2 = new SeatMovieScreening(seat4c2, "VIP", "29.99");
//        SeatMovieScreening seatMS5bc2 = new SeatMovieScreening(seat5c2, "VIP", "29.99");
//        SeatMovieScreening seatMS6bc2 = new SeatMovieScreening(seat6c2, "STANDARD", "29.99");
//
////      // cinema2 -> movie screening 2
//        MovieScreening ms2c2 = new MovieScreening(movie2, "2025-03-10", "19:00:00");
//        ms2c2.addSeat(seatMS1bc2);
//        ms2c2.addSeat(seatMS2bc2);
//        ms2c2.addSeat(seatMS3bc2);
//        ms2c2.addSeat(seatMS4bc2);
//        ms2c2.addSeat(seatMS5bc2);
//        ms2c2.addSeat(seatMS6bc2);
//
////        //PrintMovieScreening printMovieScreening = new PrintMovieScreening();
////        System.out.println("---------- BEFORE RESERVATION ----------");
////        printMovieScreening.printMovieScreeningData(ms1c2);
////        printMovieScreening.printMovieScreeningData(ms2c2);
//
////        // client/ customer
//        Client c2 = new Client("c1emai222l@gmail.com");
//        c2.setClientFirstName("John22 - c2 firstName222");
//
//        // reservation with registered client/ customer
//        Reservation res1c2 = new Reservation(ms1c2, c2);
//        res1c2.addChosenSeat(seatMS1c2);
//        res1c2.confirmReservationBeforePayment();
//        c2.setReservation(res1c2);
//        PrintReservation prc2 = new PrintReservation();
////        pr.printReservationDetails(res1c2);
//
////        // reservation without registered client/ customer
//        Reservation res2c2 = new Reservation(ms2c2, "host234@test1.com");
//        res2c2.addChosenSeat(seatMS2bc2);
//        res2c2.addChosenSeat(seatMS3bc2);
//        res2c2.confirmReservationBeforePayment();
////        pr.printReservationDetails(res2c2);
//
//        // reservation with registered client/ customer
//        Reservation res3c2 = new Reservation(ms1c2, c1);
//        res3c2.addChosenSeat(seatMS1c2);
//        res3c2.confirmReservationBeforePayment();
//        c1.setReservation(res3c2);
////        pr.printReservationDetails(res3c2);
//
////        //movie screening - after reservation
////      System.out.println("---------- AFTER RESERVATION ----------");
////        printMovieScreening.printMovieScreeningData(ms1c2);
////        printMovieScreening.printMovieScreeningData(ms2c2);
//
//        /*PurchaseDocument pm1c2 = new PurchaseDocument(res1c2);
//        pm1c2.payForReservation(true, true);*/
//
//        PrintPurchaseDocument ppdc2 = new PrintPurchaseDocument();
////        ppdc2.printPurchaseDocumentDetails(pm1c2);
//
////      //movie screening - after payment
////        System.out.println("---------- AFTER PAYMENT ----------");
////        printMovieScreening.printMovieScreeningData(ms1c2);
////        printMovieScreening.printMovieScreeningData(ms2c2);
//
//
//        printMovieScreening.printClientReservations(c1);


    }
}