package company;

import cinema.CinemaHall;
import cinema.MovieScreening;

import java.util.*;

public class Cinema {

    private String name;
    private String address;
    private Company company;
    private Set<CinemaHall> cinemaHalls;
    private Set<MovieScreening> movieScreenigs;

    public Cinema(Company company, String name, String address) {
        this.company = company;
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return this.name;
    }

    public String getAddress() {
        return this.address;
    }

    public Set<CinemaHall> getCinemaHalls() {
        return cinemaHalls;
    }

    public void setCinemaHalls(Set<CinemaHall> cinemaHalls) {
        this.cinemaHalls = cinemaHalls;
    }

    public Set<MovieScreening> getMovieScreenigs() {
        return movieScreenigs;
    }

    public void setMovieScreenigs(Set<MovieScreening> movieScreenigs) {
        this.movieScreenigs = movieScreenigs;
    }
}
