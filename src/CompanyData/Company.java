package CompanyData;

import Documents.Reservation;

import java.util.*;

public class Company {

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
