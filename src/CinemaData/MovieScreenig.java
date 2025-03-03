package CinemaData;

import CompanyData.Movie;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.*;

public class MovieScreenig {

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

    public  ArrayList<SeatMovieScreening> getMovieSeats() {
        return this.movieSeats;
    }

    public SeatMovieScreening getSeatMovieScreening(SeatMovieScreening seatMovieScreening) {
        for (SeatMovieScreening sms : this.movieSeats) {
            if(sms.equals(seatMovieScreening)) {
                return sms;
            }
        }
        return null;
    }

}