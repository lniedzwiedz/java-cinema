package CinemaData;

import CompanyData.Cinema;

import java.util.ArrayList;

public class CinemaRoom {

    private String cinemaRoomName;
    private Cinema cinema;
    private ArrayList<Seat> seats = new ArrayList<>();

    public CinemaRoom(Cinema cinema, String cinemaRoomName) {
        this.cinemaRoomName = cinemaRoomName;
        this.cinema = cinema;
    }

    public String getName() {
        return this.cinemaRoomName;
    }

    public Cinema getCinema() {
        return this.cinema;
    }

    public void addSeat(Seat seat) {
        this.seats.add(seat);
    }

    protected ArrayList<Seat> getRoomSeats() {
        return this.seats;
    }




}
