package cinema;

import cinema.seat.Seat;
import company.Cinema;

import java.util.HashMap;
import java.util.Map;

public class CinemaHall {

    private String name;
    private Cinema cinema;
    private Map<Integer, Seat> seats = new HashMap<>();

    public CinemaHall(Cinema cinema, String name) {
        this.name = name;
        this.cinema = cinema;
    }

    public String getName() {
        return this.name;
    }

    public Cinema getCinema() {
        return this.cinema;
    }

    public void addSeat(Seat seat) {
        this.seats.put(seat.getSeatNumber(), seat);
    }

    protected Map<Integer, Seat> getSeats() {
        return this.seats;
    }
}
