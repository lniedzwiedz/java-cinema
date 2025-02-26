import CinemaData.CinemaRoom;
import CinemaData.MovieScreenig;
import CinemaData.Seat;
import CinemaData.SeatMovieScreening;
import Company.Cinema;
import Company.Client;
import Company.Movie;
import Documents.Reservation;

public class Main {

    public static void main(String[] args) {

        //Company.Company headquarter = new Company.Company();

        /*Company.Movie film1 = new Company.Movie("Moana");
        film1.setMovieTime("128");
        film1.setMovieGenre("Comedy");
        film1.setMovieKind("2D");
        film1.setMovieLanguage("ENG");

        Company.Movie film13D = new Company.Movie("Moana");
        film13D.setMovieTime("128");
        film13D.setMovieGenre("Comedy");
        film13D.setMovieKind("3D");
        film13D.setMovieLanguage("ENG");

        Company.Movie film2 = new Company.Movie("Bolek i Lolek");
        film2.setMovieTime("20");
        film2.setMovieGenre("Comedy");
        film2.setMovieKind("3D");
        film2.setMovieLanguage("PL");

        Company.Movie film3 = new Company.Movie("Zmiennokształtni");
        film3.setMovieTime("20");
        film3.setMovieGenre("Comedy");
        film3.setMovieKind("2D");
        film3.setMovieLanguage("PL");

        Company.Movie film33D = new Company.Movie("Zmiennokształtni");
        film33D.setMovieTime("120");
        film33D.setMovieGenre("Comedy");
        film33D.setMovieKind("3D");
        film33D.setMovieLanguage("PL");

        Company.Movie film4 = new Company.Movie("Kleks i  wynalazek ...");
        film4.setMovieTime("20");
        film4.setMovieGenre("Comedy");
        film4.setMovieKind("3D");
        film4.setMovieLanguage("PL");

        headquarter.addMovieToCollection(film1);
        headquarter.addMovieToCollection(film13D);
        headquarter.addMovieToCollection(film2);

        headquarter.addMovieToCollection(film3);
        headquarter.addMovieToCollection(film33D);
        headquarter.addMovieToCollection(film4);*

        Company.Company.Cinema cinema1 = new Company.Company.Cinema("Kino Kraków");
        cinema1.setCinemaAddress("ul. nieIstnieje, 30-666 Kraków");
        //headquarter.addCinema(cinema1);

        Company.Company.Cinema cinema2 = new Company.Company.Cinema("Kino Warszawa");
        cinema2.setCinemaAddress("ul. Henryka N., 30-999 Warszawa");
        //headquarter.addCinema(cinema2);

        // cinema1
        Cinema.CinemaRoom cinemaRoom1 = new Cinema.CinemaRoom(cinema1, "room 1");
        cinemaRoom1.createSeatsForOneRow(1, 1);
        cinemaRoom1.createSeatsForOneRow(2, 2);
        cinemaRoom1.createSeatsForOneRow(3, 3, "VIP");
        cinemaRoom1.createSeatsForOneRow(4, 4);
        cinemaRoom1.createSeatsForOneRow(5, 5);
        cinema1.addCinemaRoom(cinemaRoom1);

        Cinema.CinemaRoom cinemaRoom2 = new Cinema.CinemaRoom(cinema1, "room 2");
        cinemaRoom2.createSeatsForOneRow(1, 4);
        cinemaRoom2.createSeatsForOneRow(2, 6);
        cinemaRoom2.createSeatsForOneRow(3, 6,"VIP");
        cinemaRoom2.createSeatsForOneRow(4, 6);
        cinemaRoom2.createSeatsForOneRow(5, 5);
        cinema1.addCinemaRoom(cinemaRoom2);

        //cinema 2
        Cinema.CinemaRoom cinemaRoom1c2 = new Cinema.CinemaRoom(cinema2, "room 3");
        cinemaRoom1c2.createSeatsForOneRow(1, 5);
        cinemaRoom1c2.createSeatsForOneRow(2, 5);
        cinemaRoom1c2.createSeatsForOneRow(3, 5, "VIP");
        cinemaRoom1c2.createSeatsForOneRow(4, 5);
        cinemaRoom1c2.createSeatsForOneRow(5, 5);
       cinema2.addCinemaRoom(cinemaRoom1c2);

        Cinema.CinemaRoom cinemaRoom2c2 = new Cinema.CinemaRoom(cinema2, "room 4");
        cinemaRoom2c2.createSeatsForOneRow(1, 4);
        cinemaRoom2c2.createSeatsForOneRow(2, 4);
        cinemaRoom2c2.createSeatsForOneRow(3, 4, "VIP");
        cinemaRoom2c2.createSeatsForOneRow(4, 4);
        cinemaRoom2c2.createSeatsForOneRow(5, 4);
        cinema2.addCinemaRoom(cinemaRoom2c2);

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

        cinema1.addMovieScreenigToCalendar(ms1);
        cinema1.addMovieScreenigToCalendar(ms2);
        cinema1.addMovieScreenigToCalendar(ms3);
        cinema1.addMovieScreenigToCalendar(ms4);
        cinema1.addMovieScreenigToCalendar(ms5);

        // cinema2
        Cinema.MovieScreenig ms1c2 = new Cinema.MovieScreenig(headquarter.getMovieData("Zmiennokształtni"),
                "2025-03-01", "20:15:00", cinema2.getCinemaRoom("room 3"));

        Cinema.MovieScreenig ms2c2 = new Cinema.MovieScreenig(headquarter.getMovieData("Kleks i  wynalazek ..."),
                "2025-02-04", "18:05:00", cinema2.getCinemaRoom("room 3"));

        Cinema.MovieScreenig ms3c2 = new Cinema.MovieScreenig(headquarter.getMovieData("Bolek i Lolek"),
                "2025-02-10", "15:30:00", cinema2.getCinemaRoom("room 4"));

        Cinema.MovieScreenig ms4c2 = new Cinema.MovieScreenig(headquarter.getMovieData("Zmiennokształtni", "2D"),
                "2025-02-04", "18:00:00", cinema2.getCinemaRoom("room 3"));

        Cinema.MovieScreenig ms5c2 = new Cinema.MovieScreenig(headquarter.getMovieData("Zmiennokształtni", "3D"),
                "2025-02-21", "19:10:00", cinema2.getCinemaRoom("room 4"));

        cinema2.addMovieScreenigToCalendar(ms1c2);
        cinema2.addMovieScreenigToCalendar(ms2c2);
        cinema2.addMovieScreenigToCalendar(ms3c2);
        cinema2.addMovieScreenigToCalendar(ms4c2);
        cinema2.addMovieScreenigToCalendar(ms5c2);

        //cinema1.printMovieScreeningData();
        //cinema1.printMovieScreeningData("Bolek i Lolek");
        //cinema1.printMovieScreeningData("Moana", "2D");
        //cinema1.printMovieScreeningData("Moana", "3D");
        //cinema1.printMovieScreeningData("Moana");
        //cinema1.printMovieScreeningData("Moana", "2025-02-04", "17:30:00");

        // registered client
        Company.Client c1 = new Company.Client("bolek1@gmail.com");
        c1.setClientName("Bolek II");
        headquarter.addClientToCollection(c1);

        Company.Client c2 = new Company.Client("lolek2@gmail.com");
        c2.setClientName("Lolek III");
        headquarter.addClientToCollection(c2);

        // reservation
        Documents.Reservation res1 = new Documents.Reservation(ms1c2);
        res1.chooseSeatsPerRow("2", "1,");
        res1.chooseSeatsPerRow("4", "2, 3,4");
        //res1.setClient("gosc@gmail.com");
        res1.setClient(c1);
        res1.confirmReservation();
        headquarter.addReservationToCollection(res1);
        //res1.printReservationDetails();

        Documents.Reservation res2 = new Documents.Reservation(ms1);
        res2.chooseSeatsPerRow("5", "1");
        res2.setClient("gosc@gmail.com");
        res2.confirmReservation();
        headquarter.addReservationToCollection(res2);
        //res2.printReservationDetails();

        Documents.Reservation res3 = new Documents.Reservation(ms2);
        res3.chooseSeatsPerRow("2", "2,");
        res3.chooseSeatsPerRow("5", "4,5");
        res3.setClient(c1);
        res3.confirmReservation();
        headquarter.addReservationToCollection(res3);
        //res3.printReservationDetails();

        Documents.Reservation res4 = new Documents.Reservation(ms1);
        res2.chooseSeatsPerRow("5", "1,2,3");
        res4.chooseSeatsPerRow("3", "1,3");
        //res1.setClient("gosc@gmail.com");
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

        Documents.PurchaseDocument pd2 = new Documents.PurchaseDocument(res3);
        pd2.payForReservation(true, true);
        headquarter.addPurchaseDocumentsToCollection(pd2);

        //pd1.cancelReservation();

        //headquarter.printAllClientPurchaseDocuments(c1);
        cinema1.printMovieScreeningData("Bolek i Lolek");*/



        Movie movie1 = new Movie("Bolek i Lolek", "3D", "Comedy", "110", "PL");

        Cinema cinema1 = new Cinema("Kino Kraków", "ul. nieIstnieje, 30-666 Kraków");

        CinemaRoom cinemaRoom1 = new CinemaRoom(cinema1, "room 1");
        Seat seat1 = new Seat("1", "1","1", cinemaRoom1);
        cinemaRoom1.addSeat(seat1);

        SeatMovieScreening seatMS1 = new SeatMovieScreening(seat1, "STANDARD", "29.99");


        MovieScreenig ms1 = new MovieScreenig(movie1,  "2025-02-04", "17:00:00");
        ms1.addSeat(seatMS1);


        Client c1 = new Client("c1email@gmail.com", "c1 firstName");

        Reservation res1 = new Reservation(ms1);
        res1.addSeat(seatMS1);
        res1.addClient(c1);
        res1.confirmReservation();
        res1.printReservationDetails();


    }
}