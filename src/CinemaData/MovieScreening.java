package CinemaData;

import CompanyData.Movie;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.*;

public class MovieScreening {

    private Movie movie;
    private LocalDate date;
    private LocalTime time;

    private Map<Integer, SeatMovieScreening> seats = new HashMap<>();

    public MovieScreening(Movie movieData, String date, String time) {
        this.movie = movieData;
        this.date = LocalDate.parse(date);
        this.time = LocalTime.parse(time);
    }

    public Movie getMovie() {
        return movie;
    }

    public LocalDate getDate() {
        return date;
    }

    public LocalTime getTime() {
        return time;
    }

    public void addSeat(SeatMovieScreening seatMovieScreening) {
        seats.put(seatMovieScreening.getSeat().getSeatNumber(), seatMovieScreening);
    }

    public SeatMovieScreening getSeatMovieScreening(int seatNumber) {
        return seats.get(seatNumber);
    }

    public Map<Integer, SeatMovieScreening> getSeats() {
        return seats;
    }
}