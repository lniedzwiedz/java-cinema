package CinemaData;

import Company.Cinema;

import java.util.ArrayList;

public class CinemaRoom {

   /* // console only for printing
    private String ansiGreen = "\033[0;32m";
    private String ansiYellow = "\033[33m";
    private String ansiRed = "\033[31m";
    private String ansiRest = "\u001B[0m";

    // add to code, it is not a column in db!
    private int seatIsNotReserved = 0;
    private int seatIsReserved = 1;
    private int seatIsTemporarilyReserved = 2;

    //column name! - remove
    private HashMap<String, Object> seatDetails;
    private HashMap<String, Object> seatNumber;
    private HashMap<String, Object> rowSeatsData;


    // XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
    private Company.Company.Cinema cinema;
    private String cinemaRoomName;
    private List<Cinema.Seat>();

    Cinema.CinemaRoom(Company.Company.Cinema cinema, String cinemaRoomName) {
        this.rowSeatsData = new HashMap<>();
        this.cinemaRoomName = cinemaRoomName;
        this.cinema = cinema;
    }

    protected Company.Company.Cinema getCinema() {
        return this.cinema;
    }

    protected HashMap<String, Object>getRowSeatsData(String rowNumber) {
        return (HashMap) this.rowSeatsData.get(rowNumber);
    }

    protected void setRoomName(String cinemaRoomName){
        this.cinemaRoomName = cinemaRoomName;
    }

    protected String getRoomName() {
        return this.cinemaRoomName;
    }

    protected int getStatusSeatIsTemporarilyReserved() {
        return this.seatIsTemporarilyReserved;
    }

    protected int getStatusSeatIsNotReserved() {
        return this.seatIsNotReserved;
    }

    protected int getStatusSeatIsReserved() {
        return this.seatIsReserved;
    }

    private HashMap<String, Object> createSeatDetails(String seatType) {
        HashMap<String, Object> seatDetails = new HashMap<>();
        seatDetails.put("seatKindOfReserved", seatIsNotReserved);
        seatDetails.put("seatType", seatType);
        seatDetails.put("price", 29.99);
        return seatDetails;
    }

    protected void createSeatsForOneRow(int rowNumber, int seatsNumber) {
        String seatType = "STANDARD";
        this.createSeatsForOneRow(rowNumber, seatsNumber, seatType);
    }

    protected void createSeatsForOneRow(int rowNumber, int seatsNumber, String seatType) {
        this.seatNumber = new HashMap<>();

        for (int i = 1; i <= seatsNumber; i++) {
            this.seatDetails = createSeatDetails(seatType);
            this.seatNumber.put(Integer.toString(i), this.seatDetails);
        }
        this.rowSeatsData.put(Integer.toString(rowNumber), this.seatNumber);
    }

    protected void printCinemaRoomData() {
        System.out.println();
        System.out.println("       " + cinemaRoomName.toUpperCase());

        for (String keyRowNumber : rowSeatsData.keySet()) {
            System.out.print("row " + keyRowNumber + " : ");
            HashMap<String, Object> currentSeatNumber = (HashMap) rowSeatsData.get(keyRowNumber);

            for (String keySeatNumber : currentSeatNumber.keySet()) {
                HashMap<String, Object> currentSeatDetails = (HashMap) currentSeatNumber.get(keySeatNumber);
                int seatKindOfReserved = (int) currentSeatDetails.get("seatKindOfReserved");

                if (seatKindOfReserved == seatIsNotReserved)
                    System.out.print(" " + ansiGreen + keySeatNumber + ansiRest + "  |  ");
                else if (seatKindOfReserved == seatIsTemporarilyReserved)
                    System.out.print(" " + ansiYellow + keySeatNumber + ansiRest + "  |  ");
                else
                    System.out.print(" " + ansiRed + keySeatNumber + ansiRest + "  |  ");
            }
            System.out.println();
        }
    }*/


    private String cinemaRoomName;
    private Cinema cinema;
    private ArrayList<Seat> seats = new ArrayList<>();

    public CinemaRoom(Cinema cinema, String cinemaRoomName) {
        this.cinemaRoomName = cinemaRoomName;
        this.cinema = cinema;
    }

    protected String getCinemaRoomName() {
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
