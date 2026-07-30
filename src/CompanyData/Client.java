package CompanyData;

import Documents.Reservation;

import java.util.ArrayList;
import java.util.List;

public class Client {

    private String email;
    //private String password;
    private String firstName;
    private List<Reservation> reservations = new ArrayList<>();

    public Client(String email) {
        this(email, "unregistered client/customer");
    }

    public Client(String email, String firstName) {
        this.email = email;
        this.firstName = firstName;
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

    public void addReservation(Reservation reservation) {
        this.reservations.add(reservation);
    }

    public List<Reservation> getReservations() {
        return this.reservations;
    }
}
