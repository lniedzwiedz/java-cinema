import CinemaData.CinemaRoom;
import CinemaData.MovieScreenig;
import CinemaData.Seat;
import CinemaData.SeatMovieScreening;
import CompanyData.Cinema;
import CompanyData.Client;
import CompanyData.Company;
import CompanyData.Movie;
import Documents.PurchaseDocument;
import Documents.Reservation;
import Printers.PrintMovieScreening;
import Printers.PrintPurchaseDocument;
import Printers.PrintReservation;


public class Main {

    public static void main(String[] args) {

        /*
        // cinema1
        Cinema.MovieScreenig ms1 = new Cinema.MovieScreenig(headquarter.getMovieData("Bolek i Lolek"),
                "2025-02-10", "20:15:00", cinema1.getCinemaRoom("room 1"))
        Cinema.MovieScreenig ms2 = new Cinema.MovieScreenig(headquarter.getMovieData("Bolek i Lolek"),
                "2025-02-11", "18:00:00", cinema1.getCinemaRoom("room 1"));

        Cinema.MovieScreenig ms3 = new Cinema.MovieScreenig(headquarter.getMovieData("Bolek i Lolek"),
                "2025-02-10", "14:00:00", cinema1.getCinemaRoom("room 1"));

        Cinema.MovieScreenig ms4 = new Cinema.MovieScreenig(headquarter.getMovieData("Moana", "2D"),
                "2025-02-04", "17:00:00", cinema1.getCinemaRoom("room 2"));

        Cinema.MovieScreenig ms5 = new Cinema.MovieScreenig(headquarter.getMovieData("Moana", "3D"),
                "2025-02-10", "21:10:00", cinema1.getCinemaRoom("room 2"));

        Documents.Reservation res4 = new Documents.Reservation(ms1);
        res2.chooseSeatsPerRow("5", "1,2,3");
        res4.chooseSeatsPerRow("3", "1,3");
        res4.setClient(c2);
        res4.confirmReservation();
        headquarter.addReservationToCollection(res4);
        //res1.printReservationDetails();

        // reservation print
        headquarter.printAllClientReservations(c1);
        //headquarter.printAllClientReservations(c2);

        // Documents.PurchaseDocument
        Documents.PurchaseDocument pd1 = new Documents.PurchaseDocument(res1);
        pd1.payForReservation(true, true);
        headquarter.addPurchaseDocumentsToCollection(pd1);

        //pd1.cancelReservation();

        //headquarter.printAllClientPurchaseDocuments(c1);
        cinema1.printMovieScreeningData("Bolek i Lolek");*/

//      // company
        Company headquarter = new Company("Headquarter", "address, road Xyz 8/99, City-City2");

//      // movie
        Movie movie1 = new Movie("Bolek i Lolek", "3D", "Comedy", "110", "PL");
        Movie movie2 = new Movie("Kleks", "2D", "Comedy", "130", "PL");

//      // cinema1
        Cinema cinema1 = new Cinema("Kino Kraków", "ul. nieIstnieje, 30-666 Kraków");
        cinema1.setCompany(headquarter);

//      // cinema1  -> cinemaRoom1
        CinemaRoom cinemaRoom1 = new CinemaRoom(cinema1, "room 1");
        Seat seat1 = new Seat("1", "1", "1", cinemaRoom1);
        Seat seat2 = new Seat("2", "1", "2", cinemaRoom1);
        Seat seat3 = new Seat("3", "1", "3", cinemaRoom1);

        Seat seat4 = new Seat("4", "2", "1", cinemaRoom1);
        Seat seat5 = new Seat("5", "2", "2", cinemaRoom1);
        Seat seat6 = new Seat("6", "2", "3", cinemaRoom1);

        cinemaRoom1.addSeat(seat1);
        cinemaRoom1.addSeat(seat2);
        cinemaRoom1.addSeat(seat3);
        cinemaRoom1.addSeat(seat4);
        cinemaRoom1.addSeat(seat5);
        cinemaRoom1.addSeat(seat6);

//      // cinema1 -> cinemaRoom1 -> seats for 1 movie screening 1
        SeatMovieScreening seatMS1 = new SeatMovieScreening(seat1, "STANDARD", "29.99");
        SeatMovieScreening seatMS2 = new SeatMovieScreening(seat2, "VIP", "29.99");
        SeatMovieScreening seatMS3 = new SeatMovieScreening(seat3, "STANDARD", "29.99");
        SeatMovieScreening seatMS4 = new SeatMovieScreening(seat4, "STANDARD", "29.99");
        SeatMovieScreening seatMS5 = new SeatMovieScreening(seat5, "VIP", "29.99");
        SeatMovieScreening seatMS6 = new SeatMovieScreening(seat6, "STANDARD", "29.99");

//      // cinema1 -> movie screening 1
        MovieScreenig ms1 = new MovieScreenig(movie1, "2025-02-04", "17:00:00");
        ms1.addSeat(seatMS1);
        ms1.addSeat(seatMS2);
        ms1.addSeat(seatMS3);
        ms1.addSeat(seatMS4);
        ms1.addSeat(seatMS5);
        ms1.addSeat(seatMS6);

//      // cinema1 -> cinemaRoom1 -> seats for 2 movie screening 2
        SeatMovieScreening seatMS1b = new SeatMovieScreening(seat1, "STANDARD", "29.99");
        SeatMovieScreening seatMS2b = new SeatMovieScreening(seat2, "VIP", "29.99");
        SeatMovieScreening seatMS3b = new SeatMovieScreening(seat3, "VIP", "29.99");
        SeatMovieScreening seatMS4b = new SeatMovieScreening(seat4, "VIP", "29.99");
        SeatMovieScreening seatMS5b = new SeatMovieScreening(seat5, "VIP", "39.99");
        SeatMovieScreening seatMS6b = new SeatMovieScreening(seat6, "STANDARD", "29.99");

//      // cinema1 -> movie screening 2
        MovieScreenig ms2 = new MovieScreenig(movie2, "2025-03-10", "19:00:00");
        ms2.addSeat(seatMS1b);
        ms2.addSeat(seatMS2b);
        ms2.addSeat(seatMS3b);
        ms2.addSeat(seatMS4b);
        ms2.addSeat(seatMS5b);
        ms2.addSeat(seatMS6b);

        PrintMovieScreening printMovieScreening = new PrintMovieScreening();
//        System.out.println("---------- BEFORE RESERVATION ----------");
//        printMovieScreening.printMovieScreeningData(ms1);
//        printMovieScreening.printMovieScreeningData(ms2);

//       //  client/ customer
        Client c1 = new Client("c1email@gmail.com");
        c1.setClientFirstName("John - c1 firstName");

        // reservation with registered client/ customer
        Reservation res1 = new Reservation(ms1, c1);
        res1.addChosenSeat(seatMS1);
        res1.addChosenSeat(seatMS4);
        res1.confirmReservationBeforePayment();
        c1.setReservation(res1);

        Reservation res1b = new Reservation(ms2, c1);
        res1b.addChosenSeat(seatMS5b);
        res1b.addChosenSeat(seatMS6b);
        res1b.confirmReservationBeforePayment();
        c1.setReservation(res1b);

        PrintReservation pr = new PrintReservation();
//        pr.printReservationDetails(res1);

//      // reservation without registered client/ customer
        Reservation res2 = new Reservation(ms2, "host@test1.com");
        res2.addChosenSeat(seatMS2b);
        res2.addChosenSeat(seatMS3b);
        res2.confirmReservationBeforePayment();


//       //movie screening - after reservation
//        System.out.println("---------- AFTER RESERVATION ----------");
//        printMovieScreening.printMovieScreeningData(ms1);
//        printMovieScreening.printMovieScreeningData(ms2);

        PurchaseDocument pm1 = new PurchaseDocument(res1);
        pm1.payForReservation(true, true);

        PrintPurchaseDocument ppd = new PrintPurchaseDocument();
//        ppd.printPurchaseDocumentDetails(pm1);
//
//        //movie screening - after payment
//        System.out.println("---------- AFTER PAYMENT ----------");
//        printMovieScreening.printMovieScreeningData(ms1);
//        printMovieScreening.printMovieScreeningData(ms2);

//      XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
//      cinema2
        Cinema cinema2 = new Cinema("Kino Warszawa", "ul. war, 30-123 Warszawa");
        cinema2.setCompany(headquarter);

//      // cinema2 -> cinema2Room1
        CinemaRoom cinema2Room1 = new CinemaRoom(cinema2, "room 1");
        Seat seat1c2 = new Seat("1", "1", "1", cinema2Room1);
        Seat seat2c2 = new Seat("2", "1", "2", cinema2Room1);
        Seat seat3c2 = new Seat("3", "1", "3", cinema2Room1);

        Seat seat4c2 = new Seat("4", "2", "1", cinema2Room1);
        Seat seat5c2 = new Seat("5", "2", "2", cinema2Room1);
        Seat seat6c2 = new Seat("6", "2", "3", cinema2Room1);

        cinema2Room1.addSeat(seat1c2);
        cinema2Room1.addSeat(seat2c2);
        cinema2Room1.addSeat(seat3c2);
        cinema2Room1.addSeat(seat4c2);
        cinema2Room1.addSeat(seat5c2);
        cinema2Room1.addSeat(seat6c2);

//       // cinema2 -> cinema2Room1 -> seats for 1 movie screening 1
        SeatMovieScreening seatMS1c2 = new SeatMovieScreening(seat1c2, "STANDARD", "27.99");
        SeatMovieScreening seatMS2c2 = new SeatMovieScreening(seat2c2, "VIP", "37.99");
        SeatMovieScreening seatMS3c2 = new SeatMovieScreening(seat3c2, "STANDARD", "27.99");
        SeatMovieScreening seatMS4c2 = new SeatMovieScreening(seat4c2, "STANDARD", "27.99");
        SeatMovieScreening seatMS5c2 = new SeatMovieScreening(seat5c2, "VIP", "37.99");
        SeatMovieScreening seatMS6c2 = new SeatMovieScreening(seat6c2, "STANDARD", "27.99");

//       // cinema2 -> movie screening 1
        MovieScreenig ms1c2 = new MovieScreenig(movie1, "2025-02-04", "17:00:00");
        ms1c2.addSeat(seatMS1c2);
        ms1c2.addSeat(seatMS2c2);
        ms1c2.addSeat(seatMS3c2);
        ms1c2.addSeat(seatMS4c2);
        ms1c2.addSeat(seatMS5c2);
        ms1c2.addSeat(seatMS6c2);

//      //  cinema2 -> cinema2Room1 -> seats for 2 movie screening 2
        SeatMovieScreening seatMS1bc2 = new SeatMovieScreening(seat1c2, "STANDARD", "29.99");
        SeatMovieScreening seatMS2bc2 = new SeatMovieScreening(seat2c2, "VIP", "29.99");
        SeatMovieScreening seatMS3bc2 = new SeatMovieScreening(seat3c2, "VIP", "29.99");
        SeatMovieScreening seatMS4bc2 = new SeatMovieScreening(seat4c2, "VIP", "29.99");
        SeatMovieScreening seatMS5bc2 = new SeatMovieScreening(seat5c2, "VIP", "29.99");
        SeatMovieScreening seatMS6bc2 = new SeatMovieScreening(seat6c2, "STANDARD", "29.99");

//      // cinema2 -> movie screening 2
        MovieScreenig ms2c2 = new MovieScreenig(movie2, "2025-03-10", "19:00:00");
        ms2c2.addSeat(seatMS1bc2);
        ms2c2.addSeat(seatMS2bc2);
        ms2c2.addSeat(seatMS3bc2);
        ms2c2.addSeat(seatMS4bc2);
        ms2c2.addSeat(seatMS5bc2);
        ms2c2.addSeat(seatMS6bc2);

//        //PrintMovieScreening printMovieScreening = new PrintMovieScreening();
//        System.out.println("---------- BEFORE RESERVATION ----------");
//        printMovieScreening.printMovieScreeningData(ms1c2);
//        printMovieScreening.printMovieScreeningData(ms2c2);

//        // client/ customer
        Client c2 = new Client("c1emai222l@gmail.com");
        c2.setClientFirstName("John22 - c2 firstName222");

        // reservation with registered client/ customer
        Reservation res1c2 = new Reservation(ms1c2, c2);
        res1c2.addChosenSeat(seatMS1c2);
        res1c2.confirmReservationBeforePayment();
        c2.setReservation(res1c2);
        PrintReservation prc2 = new PrintReservation();
//        pr.printReservationDetails(res1c2);

//        // reservation without registered client/ customer
        Reservation res2c2 = new Reservation(ms2c2, "host234@test1.com");
        res2c2.addChosenSeat(seatMS2bc2);
        res2c2.addChosenSeat(seatMS3bc2);
        res2c2.confirmReservationBeforePayment();
//        pr.printReservationDetails(res2c2);

        // reservation with registered client/ customer
        Reservation res3c2 = new Reservation(ms1c2, c1);
        res3c2.addChosenSeat(seatMS1c2);
        res3c2.confirmReservationBeforePayment();
        c1.setReservation(res3c2);
//        pr.printReservationDetails(res3c2);

//        //movie screening - after reservation
//      System.out.println("---------- AFTER RESERVATION ----------");
//        printMovieScreening.printMovieScreeningData(ms1c2);
//        printMovieScreening.printMovieScreeningData(ms2c2);

        /*PurchaseDocument pm1c2 = new PurchaseDocument(res1c2);
        pm1c2.payForReservation(true, true);*/

        PrintPurchaseDocument ppdc2 = new PrintPurchaseDocument();
//        ppdc2.printPurchaseDocumentDetails(pm1c2);

//      //movie screening - after payment
//        System.out.println("---------- AFTER PAYMENT ----------");
//        printMovieScreening.printMovieScreeningData(ms1c2);
//        printMovieScreening.printMovieScreeningData(ms2c2);


        printMovieScreening.printClientReservations(c1);


    }
}