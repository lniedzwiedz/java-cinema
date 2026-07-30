package CompanyData;

import Documents.Reservation;

import java.util.*;

public class Company {

   /* private String name;
    private String address;
    private HashMap<String, Company.Company.Cinema> cinemas;
    private List<Company.Movie> movies;
    private List<Company.Movie> moviesByTitle;
    private List<Company.Movie> moviesByKind;
    private HashMap<String, Company.Client> clients;
    private HashMap<String, List<Documents.Reservation>> clientReservations;
    private List<Documents.Reservation> reservations;
    private HashMap<String, List<Documents.PurchaseDocument>> clientPurchaseDocuments;
    private List<Documents.PurchaseDocument> purchaseDocuments;

    Company.Company() {
        this.cinemas = new HashMap<>();
        this.movies = new ArrayList<>();
        this.clients = new HashMap<>();
        this.clientReservations = new HashMap<>();
        this.clientPurchaseDocuments = new HashMap<>();
    }

    protected void addCinema(Company.Company.Cinema cinema) {
        this.cinemas.put(cinema.getCinemaName(), cinema);
    }

    protected void addMovieToCollection(Company.Movie movie) {
        this.movies.add(movie);
    }

    protected void addClientToCollection(Company.Client client) {
        this.clients.put(client.getClientEmail(), client);
        this.reservations = new ArrayList<>();
        this.clientReservations.put(client.getClientEmail(), reservations);
        this.purchaseDocuments = new ArrayList<>();
        this.clientPurchaseDocuments.put(client.getClientEmail(), purchaseDocuments);
    }

    protected void addReservationToCollection(Documents.Reservation reservation) {

        if (this.clientReservations.get(reservation.getClient().getClientEmail()) == null) {
            this.reservations = new ArrayList<>();
            this.clientReservations.put(reservation.getClient().getClientEmail(), reservations);
        }
        this.reservations = this.clientReservations.get(reservation.getClient().getClientEmail());
        this.reservations.add(reservation);
        this.clientReservations.put(reservation.getClient().getClientEmail(), this.reservations);
    }

    protected void addPurchaseDocumentsToCollection(Documents.PurchaseDocument purchaseDocument) {
        if (this.clientPurchaseDocuments.get(purchaseDocument.getClient().getClientEmail()) == null) {
            this.purchaseDocuments = new ArrayList<>();
            this.clientPurchaseDocuments.put(purchaseDocument.getClient().getClientEmail(), purchaseDocuments);
        }
        this.purchaseDocuments = this.clientPurchaseDocuments.get(purchaseDocument.getClient().getClientEmail());
        this.purchaseDocuments.add(purchaseDocument);
        this.clientPurchaseDocuments.put(purchaseDocument.getClient().getClientEmail(), this.purchaseDocuments);
    }

    protected void printAllClientReservations(Company.Client client) {
        for (Documents.Reservation res : this.clientReservations.get(client.getClientEmail())) {
            res.printReservationDetails();
        }
    }

    protected void printAllClientPurchaseDocuments(Company.Client client) {
        for (Documents.PurchaseDocument pd :  this.clientPurchaseDocuments.get(client.getClientEmail())) {
            pd.printReservationDetails();
        }
    }

    protected Company.Movie getMovieData(String movieTitle) {
        this.moviesByKind = getMovies(movieTitle);
        return this.moviesByKind.getFirst();
    }

    protected Company.Movie getMovieData(String movieTitle, String movieKind) {
        this.moviesByKind = getMovies(movieTitle, movieKind);
        return this.moviesByKind.get(0);
    }

    protected List<Company.Movie> getMovies(String movieTitle) {
        this.moviesByTitle = new LinkedList<>();
        for (Company.Movie movie : this.movies) {
            if (movieTitle.equals(movie.getMovieTitle()))
                this.moviesByTitle.add(movie);
        }
        return this.moviesByTitle;
    }

    protected List<Company.Movie> getMovies(String movieTitle, String movieKind) {
        this.moviesByKind = new LinkedList<>();
        for (Company.Movie movie : this.movies) {
            if (movieTitle.equals(movie.getMovieTitle())) {
                if (movie.getMovieKind().equals(movieKind))
                    this.moviesByKind.add(movie);
            }
        }
        return this.moviesByKind;
    }*/

    private String name;
    private String address;
    private List<Cinema> cinemas = new ArrayList<>();
    private List<Movie> movies = new ArrayList<>();
    private List<Client> clients = new ArrayList<>();
    private List<Employee> employees = new ArrayList<>();

    public Company(String name, String address) {
        this.name = name;
        this.address = address;
    }

    protected String getName() {
        return this.name;
    }

    protected String getAddress() {
        return this.address;
    }

    public List<Cinema> getCinemas() {
        return cinemas;
    }

    public void setCinema(Cinema cinema) {
        this.cinemas.add(cinema);
    }

    public List<Movie> getMovies() {
        return movies;
    }

    public void setMovie(Movie movie) {
        this.movies.add(movie);
    }

    public List<Client> getClients() {
        return clients;
    }

    public void setClient(Client client) {
        this.clients.add(client);
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployee(Employee employee) {
        this.employees.add(employee);
    }
}
