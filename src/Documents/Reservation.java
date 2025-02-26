package Documents;

import CinemaData.MovieScreenig;
import CinemaData.SeatMovieScreening;
import CompanyData.Client;

import java.util.ArrayList;

public class Reservation {

    /*//private String reservationNumber;
    private Cinema.MovieScreenig movieScreenig;
    private Company.Client client;
    private double valueToPay;
    private HashMap<String, Object> reservationSeatsDetails;
    private HashMap<String, String[]> chossenSeatsPerRow;

    Documents.Reservation(Cinema.MovieScreenig movieScreenig) {
        this.reservationSeatsDetails = new HashMap<>();
        this.chossenSeatsPerRow = new HashMap<>();
        this.movieScreenig = movieScreenig;
    }

    protected void setClient(String clientEmail) {
        this.client = new Company.Client(clientEmail);
        this.client.setClientName(" --- ");
    }

    protected void setClient(Company.Client client) {
        this.client = client;
    }

    protected Company.Client getClient() {
        return this.client;
    }

    protected double getValueToPay() {
        return this.valueToPay;
    }

    protected Cinema.MovieScreenig getMovieScreenig() {
        return this.movieScreenig;
    }

    public HashMap<String, Object> getReservationSeatsDetails() {
        return this.reservationSeatsDetails;
    }

    protected void chooseSeatsPerRow(String rowNumber, String seatsNumber) {
        String seatsNo1 = seatsNumber.replace(" ", "");
        String[] seatsNo2 = seatsNo1.split(",");
        this.chossenSeatsPerRow.put(rowNumber, seatsNo2);
    }

    protected void confirmReservation() {

        this.valueToPay = 0;

        for (String rowNumber : this.chossenSeatsPerRow.keySet()) {
            String[] seatsNo2 = this.chossenSeatsPerRow.get(rowNumber);

            HashMap<String, Object> finalData = movieScreenig.getCinemaRoom().getRowSeatsData(rowNumber);
            HashMap<String, Object> reservationSeatDetailsPerRow = new HashMap<>();

            for (String key1 : finalData.keySet()) {

                for (int s = 0; s < seatsNo2.length; s++) {

                    if (key1.equals(seatsNo2[s])) {
                        HashMap<String, Object> temp = (HashMap) finalData.get(key1);

                        if ((int) temp.get("seatKindOfReserved") == movieScreenig.getCinemaRoom().getStatusSeatIsNotReserved()) {
                            temp.replace("seatKindOfReserved", movieScreenig.getCinemaRoom().getStatusSeatIsTemporarilyReserved());
                            this.valueToPay = this.valueToPay + (double) temp.get("price");
                            reservationSeatDetailsPerRow.put(key1, temp);
                            this.reservationSeatsDetails.put(rowNumber, reservationSeatDetailsPerRow);
                        } else {
                            System.out.println("Cinema.Seat " + key1 + " in row " + rowNumber + " is reserved.");
                        }
                    }
                }
            }
        }
    }

    protected void printReservationDetails() {
        System.out.println("------------------------------------------------------");
        System.out.println("   RESERVATION DETAILS   ");
        System.out.println();
        System.out.println("Company.Company.Cinema: " + movieScreenig.getCinemaRoom().getCinema().getCinemaName());
        System.out.println("Address: " + movieScreenig.getCinemaRoom().getCinema().gerCinemaAddress());
        System.out.println();
        System.out.println("movie title: " + movieScreenig.getMovieData().getMovieTitle());
        System.out.println("date: " + movieScreenig.getDate() + ", " + movieScreenig.getTime());
        System.out.println();
        System.out.println("room name: " + movieScreenig.getCinemaRoom().getRoomName().toUpperCase());
        System.out.println();

        for (String rowNumber : reservationSeatsDetails.keySet()) {
            System.out.println("ROW: " + rowNumber + ", ");
            HashMap<String, Object> currentSeatNumber = (HashMap) reservationSeatsDetails.get(rowNumber);

            for (String seatNumber : currentSeatNumber.keySet()) {
                HashMap<String, Object> seatDetails = (HashMap) currentSeatNumber.get(seatNumber);
                System.out.print("seat: " + seatNumber + ", ");
                System.out.print(seatDetails.get("seatType") + ", ");
                System.out.print(seatDetails.get("price") + ", ");
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("client name: " + this.client.getClientName());
        System.out.println("email: " + this.client.getClientEmail());
        System.out.println();
        System.out.println("to pay: " + this.valueToPay);

        System.out.println("------------------------------------------------------");
        System.out.println();
    }*/

    //private String reservationNumber;
    private MovieScreenig movieScreenig;
    private Client client;
    private double valueToPay;
    private double reservationStatus;
    private ArrayList<SeatMovieScreening> reservedSeats = new ArrayList<>();


    public Reservation(MovieScreenig movieScreenig) {
        this.movieScreenig = movieScreenig;
        this.reservationStatus = 0;
        this.valueToPay = 0;
    }

    public void addClient(Client client) {
        this.client = client;
    }

    public void addSeat(SeatMovieScreening seat) {
        this.reservedSeats.add(seat);
    }

    public MovieScreenig getMovieScreenig() {
        return movieScreenig;
    }




    private void setReservationData() {
        for (SeatMovieScreening seat : reservedSeats) {
            seat.setSeatKindOfReservedToTemporaryReserved();
            valueToPay = valueToPay + Double.parseDouble(seat.getPrice());
        }
    }

    public void confirmReservation() {
        this.reservationStatus = 1;
        setReservationData();
    }

    public void printReservationDetails() {
        System.out.println("------------------------------------------------------");
        System.out.println("   RESERVATION DETAILS   ");
        System.out.println();
        System.out.println("Company.Company.Cinema: " + movieScreenig.getSeatMovieScreening().getMovieSeat().getCinemaRoom().getCinema().getCinemaName());
        System.out.println("Address: " + movieScreenig.getSeatMovieScreening().getMovieSeat().getCinemaRoom().getCinema().getCinemaAddress());
        System.out.println();
        System.out.println("movie title: " + movieScreenig.getMovieData().getTitle());
        System.out.println("date: " + movieScreenig.getDate() + ", " + movieScreenig.getTime());
        System.out.println();
        System.out.println("room name: " + movieScreenig.getSeatMovieScreening().getMovieSeat());

        for (SeatMovieScreening seat : reservedSeats) {
            System.out.println("ROW: " + seat.getMovieSeat().getRow() + ", ");
            System.out.print("seat: " +  seat.getMovieSeat().getSeatNumber() + ", ");
            System.out.print("testtttttttt: " +  seat.getSeatKindOfReserved() + ", ");
            System.out.print(seat.getSeatType()+ ", ");
            System.out.print(seat.getPrice() + ", ");
            System.out.println();

            System.out.println();
        }
        System.out.println("client name: " + this.client.getClientEmail());
        System.out.println("email: " + this.client.getClientFirstName());
        System.out.println();
        System.out.println("to pay: " + this.valueToPay);

        System.out.println("------------------------------------------------------");
        System.out.println();
    }

}

