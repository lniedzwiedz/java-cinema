package CompanyData;

import Documents.Reservation;

import java.util.ArrayList;

public class Client {

    private String email;
    //private String password;
    private String firstName;
    private ArrayList<Reservation> reservations = new ArrayList<>();

    public Client(String email) {
        this.email = email;
        this.firstName = "unregistered client/customer";
    }

    public String getClientEmail() {
        return this.email;
    }

    public void setClientFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getClientFirstName() {
        return this.firstName;
    }

    public void setReservation(Reservation reservation) {
        this.reservations.add(reservation);
    }

    public ArrayList<Reservation> getReservations() {
        return this.reservations;
    }

}
