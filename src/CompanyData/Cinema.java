package CompanyData;

import CinemaData.CinemaHall;
import CinemaData.MovieScreening;

import java.util.*;

public class Cinema {

    /*
    protected void addMovieScreenigToCalendar(Cinema.MovieScreening movieScreenigData) {
        moovieCalendar.add(movieScreenigData);
    }

    protected List<Cinema.MovieScreening> getMovieScreenig() {
        LocalDate dateNow = LocalDate.now();
        LocalTime timeNow = LocalTime.now();
        this.moviesToScreening = new ArrayList<>();

        for (Cinema.MovieScreening ms : this.moovieCalendar) {
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

    protected List<Cinema.MovieScreening> getMovieScreenig(String movieTitle) {
        LocalDate dateNow = LocalDate.now();
        LocalTime timeNow = LocalTime.now();
        this.moviesToScreening = new ArrayList<>();

        for (Cinema.MovieScreening ms : this.moovieCalendar) {
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

    protected List<Cinema.MovieScreening> getMovieScreenig(String movieTitle, String movieKind) {
        LocalDate dateNow = LocalDate.now();
        LocalTime timeNow = LocalTime.now();
        this.moviesToScreening = new LinkedList<>();

        for (Cinema.MovieScreening ms : this.moovieCalendar) {
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

    protected List<Cinema.MovieScreening> getMovieScreenig(String movieTitle, String movieDate, String movieTime) {
        LocalDate dateNow = LocalDate.now();
        LocalTime timeNow = LocalTime.now();
        this.moviesToScreening = new LinkedList<>();

        for (Cinema.MovieScreening ms : this.moovieCalendar) {
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
        for (Cinema.MovieScreening ms : this.moviesToScreening) {
            ms.printMovieScreeningData();
        }
    }

    protected void printMovieScreeningData(String movieTitle) {
        getMovieScreenig(movieTitle);
        for (Cinema.MovieScreening ms : this.moviesToScreening) {
            ms.printMovieScreeningData();
        }
    }

    protected void printMovieScreeningData(String movieTitle, String movieKind) {
        getMovieScreenig(movieTitle, movieKind);
        for (Cinema.MovieScreening ms : this.moviesToScreening) {
            ms.printMovieScreeningData();
        }
    }

    protected void printMovieScreeningData(String movieTitle, String movieDate, String movieTime) {
        getMovieScreenig(movieTitle, movieDate, movieTime);
        for (Cinema.MovieScreening ms : this.moviesToScreening) {
            ms.printMovieScreeningData();
        }
    }*/

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
