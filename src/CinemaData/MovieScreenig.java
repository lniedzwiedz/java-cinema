package CinemaData;

import CompanyData.Movie;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.*;

public class MovieScreenig {

    /*private HashMap<String, Object> screenigData;
    private Company.Movie movieData;
    private LocalDate date;
    private LocalTime time;
    private Cinema.CinemaRoom cinemaRoom;
    private HashMap<String, String> cinemaData;


    Cinema.MovieScreenig(Company.Movie movieData, String date, String time, Cinema.CinemaRoom cinemaRoom) {
        this.movieData = movieData;
        this.date = LocalDate.parse(date);
        this.time = LocalTime.parse(time);
        this.cinemaRoom = cinemaRoom;
    }

    protected HashMap<String, Object> getMovieScreeningData() {
        this.screenigData = new HashMap<>();
        this.screenigData.put("movieData", movieData);
        this.screenigData.put("cinemaRoom", cinemaRoom);
        return screenigData;
    }

    protected HashMap<String, Object> getScreenigData() {
        return this.screenigData;
    }

    protected Company.Movie getMovieData() {
        return this.movieData;
    }

    protected LocalDate getDate() {
        return this.date;
    }

    protected LocalTime getTime() {
        return this.time;
    }

    protected Cinema.CinemaRoom getCinemaRoom() {
        return this.cinemaRoom;
    }

    protected void printDateAndHourMovieScreening() {
        String movieStartMinute = (this.time.getMinute() < 10) ? ("0" + this.time.getMinute()) : Integer.toString(this.time.getMinute());
        System.out.println("  " + this.date.getDayOfWeek() + ", " + this.date.getDayOfMonth() + " " + this.date.getMonth()
                + ", " + this.time.getHour() + ":" + movieStartMinute);
    }

    protected void printMovieScreeningData() {
        System.out.println(" ");
        System.out.println("------------------------------------------------------");
        this.movieData.printMovieData();
        printDateAndHourMovieScreening();
        cinemaRoom.printCinemaRoomData();
        System.out.println("------------------------------------------------------");
    }*/


    private Movie movieData;
    private LocalDate date;
    private LocalTime time;
    private ArrayList<SeatMovieScreening> movieSeats = new ArrayList<>();

    public MovieScreenig(Movie movieData, String date, String time) {
        this.movieData = movieData;
        this.date = LocalDate.parse(date);
        this.time = LocalTime.parse(time);
    }

    public void addSeat(SeatMovieScreening seatMovieScreening) {
        this.movieSeats.add(seatMovieScreening);
    }

    public Movie getMovieData() {
        return this.movieData;
    }

    public LocalDate getDate() {
        return this.date;
    }

    public LocalTime getTime() {
        return this.time;
    }

    public SeatMovieScreening getSeatMovieScreening() {
        return this.movieSeats.get(0);
    }


    protected void printMovieScreeningData() {
        System.out.println(" ");
        System.out.println("------------------------------------------------------");
        // this.movieData.printMovieData();
        //printDateAndHourMovieScreening();
        ///cinemaRoom.printCinemaRoomData();
        System.out.println("------------------------------------------------------");
    }


}