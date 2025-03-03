package CompanyData;

import CinemaData.CinemaRoom;
import CinemaData.MovieScreenig;

import java.util.*;

public class Cinema {

    /*//private String cinemaName;
    private String cinemaAddress;
    //protected LocalDateTime open =  LocalDateTime.parse("2018-01-11T10:00:00");
    //protected LocalDateTime close =  LocalDateTime.parse("2018-01-11T23:30:00");
    private HashMap<String, String> cinemaData;
    private HashMap<String, Cinema.CinemaRoom> cinemaRooms;

    private List<Cinema.MovieScreenig> moovieCalendar;
    private List<Cinema.MovieScreenig> moviesToScreening;

    protected void addMovieScreenigToCalendar(Cinema.MovieScreenig movieScreenigData) {
        moovieCalendar.add(movieScreenigData);
    }

    protected List<Cinema.MovieScreenig> getMovieScreenig() {
        LocalDate dateNow = LocalDate.now();
        LocalTime timeNow = LocalTime.now();
        this.moviesToScreening = new ArrayList<>();

        for (Cinema.MovieScreenig ms : this.moovieCalendar) {
            int dateCurrent = ms.getDate().compareTo(dateNow);
            int dateFuture = ms.getDate().compareTo(dateNow.plusDays(7));

            if (dateCurrent >= 0 && dateFuture <= 0) {
                int timeCurrent = ms.getTime().compareTo(timeNow);
                int timeFuture = ms.getTime().compareTo(LocalTime.parse("23:59:59"));

                if (dateCurrent == 0 && (timeFuture <= 0 && timeCurrent >= 0))
                    this.moviesToScreening.add(ms);

                if (dateCurrent > 0 && (timeFuture <= 0))
                    this.moviesToScreening.add(ms);
            }
        }
        return this.moviesToScreening;
    }

    protected List<Cinema.MovieScreenig> getMovieScreenig(String movieTitle) {
        LocalDate dateNow = LocalDate.now();
        LocalTime timeNow = LocalTime.now();
        this.moviesToScreening = new ArrayList<>();

        for (Cinema.MovieScreenig ms : this.moovieCalendar) {
            int dateCurrent = ms.getDate().compareTo(dateNow);
            int dateFuture = ms.getDate().compareTo(dateNow.plusDays(7));

            if (dateCurrent >= 0 && dateFuture <= 0) {
                int timeCurrent = ms.getTime().compareTo(timeNow);
                int timeFuture = ms.getTime().compareTo(LocalTime.parse("23:59:59"));

                if (dateCurrent == 0 && (timeFuture <= 0 && timeCurrent >= 0)) {
                    if ((ms.getMovieData().getMovieTitle()).equals(movieTitle))
                        this.moviesToScreening.add(ms);
                }

                if (dateCurrent > 0 && (timeFuture <= 0)) {
                    if ((ms.getMovieData().getMovieTitle()).equals(movieTitle))
                        this.moviesToScreening.add(ms);
                }
            }
        }
        return this.moviesToScreening;
    }

    protected List<Cinema.MovieScreenig> getMovieScreenig(String movieTitle, String movieKind) {
        LocalDate dateNow = LocalDate.now();
        LocalTime timeNow = LocalTime.now();
        this.moviesToScreening = new LinkedList<>();

        for (Cinema.MovieScreenig ms : this.moovieCalendar) {
            int dateCurrent = ms.getDate().compareTo(dateNow);
            int dateFuture = ms.getDate().compareTo(dateNow.plusDays(7));

            if (dateCurrent >= 0 && dateFuture <= 0) {
                int timeCurrent = ms.getTime().compareTo(timeNow);
                int timeFuture = ms.getTime().compareTo(LocalTime.parse("23:59:59"));

                if (dateCurrent == 0 && (timeFuture <= 0 && timeCurrent >= 0)) {
                    if ((ms.getMovieData().getMovieTitle()).equals(movieTitle)) {
                        if (ms.getMovieData().getMovieKind().equals(movieKind))
                            this.moviesToScreening.add(ms);
                    }
                }

                if (dateCurrent > 0 && (timeFuture <= 0)) {
                    if ((ms.getMovieData().getMovieTitle()).equals(movieTitle)) {
                        if (ms.getMovieData().getMovieKind().equals(movieKind))
                            this.moviesToScreening.add(ms);
                    }
                }
            }
        }
        return this.moviesToScreening;
    }

    protected List<Cinema.MovieScreenig> getMovieScreenig(String movieTitle, String movieDate, String movieTime) {
        LocalDate dateNow = LocalDate.now();
        LocalTime timeNow = LocalTime.now();
        this.moviesToScreening = new LinkedList<>();

        for (Cinema.MovieScreenig ms : this.moovieCalendar) {
            int dateCurrent = ms.getDate().compareTo(dateNow);
            int dateFuture = ms.getDate().compareTo(dateNow.plusDays(7));

            if (dateCurrent >= 0 && dateFuture <= 0) {
                if(ms.getDate().compareTo(LocalDate.parse(movieDate)) == 0){
                    int timeCurrent = ms.getTime().compareTo(timeNow);
                    int timeFuture = ms.getTime().compareTo(LocalTime.parse("23:59:59"));

                    if (dateCurrent == 0 && (timeFuture <= 0 && timeCurrent >= 0)) {
                        if(ms.getTime().compareTo(LocalTime.parse(movieTime)) >= 0){
                            if ((ms.getMovieData().getMovieTitle()).equals(movieTitle))
                                this.moviesToScreening.add(ms);
                        }
                    }

                    if (dateCurrent > 0 && (timeFuture <= 0)) {
                        if(ms.getTime().compareTo(LocalTime.parse(movieTime)) >= 0){
                            if ((ms.getMovieData().getMovieTitle()).equals(movieTitle))
                                this.moviesToScreening.add(ms);
                        }
                    }
                }

            }
        }
        return this.moviesToScreening;
    }

    protected void printMovieScreeningData() {
        getMovieScreenig();
        for (Cinema.MovieScreenig ms : this.moviesToScreening) {
            ms.printMovieScreeningData();
        }
    }

    protected void printMovieScreeningData(String movieTitle) {
        getMovieScreenig(movieTitle);
        for (Cinema.MovieScreenig ms : this.moviesToScreening) {
            ms.printMovieScreeningData();
        }
    }

    protected void printMovieScreeningData(String movieTitle, String movieKind) {
        getMovieScreenig(movieTitle, movieKind);
        for (Cinema.MovieScreenig ms : this.moviesToScreening) {
            ms.printMovieScreeningData();
        }
    }

    protected void printMovieScreeningData(String movieTitle, String movieDate, String movieTime) {
        getMovieScreenig(movieTitle, movieDate, movieTime);
        for (Cinema.MovieScreenig ms : this.moviesToScreening) {
            ms.printMovieScreeningData();
        }
    }*/

    private String cinemaName;
    private String cinemaAddress;
    private Set<CinemaRoom> cinemaRooms;
    private Set<MovieScreenig> movieScreenigs;
    private Company company;

    public Cinema(String cinemaName, String cinemaAddress) {
        this.cinemaName = cinemaName;
        this.cinemaAddress = cinemaAddress;
    }

    public String getCinemaName() {
        return this.cinemaName;
    }

    public String getCinemaAddress() {
        return this.cinemaAddress;
    }

    public Set<CinemaRoom> getCinemaRoom() {
        return this.cinemaRooms;
    }

    public void setCinemaRoom(CinemaRoom cinemaRoom) {
        this.cinemaRooms.add(cinemaRoom);
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public Company getCompany() {
        return this.company;
    }

}
