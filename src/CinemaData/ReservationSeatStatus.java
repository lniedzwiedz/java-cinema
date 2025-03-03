package CinemaData;

public enum ReservationSeatStatus {

    NOT_RESERVED,
    TEMPORARILY_RESERVED,
    RESERVED;
    //CANCELLED;

    public static int getReservationSeatStatus(ReservationSeatStatus reservationSeatStatus) {

        return switch (reservationSeatStatus) {
            case NOT_RESERVED -> 1;
            case TEMPORARILY_RESERVED -> 2;
            case RESERVED -> 3;
            //case CANCELLED -> 4;
        };


    }

}
