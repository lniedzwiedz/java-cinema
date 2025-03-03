package Documents;

public enum ReservationStatus {
    RESERVATION_DURING_CREATION,
    CONFIRMED_RESERVATION_BEFORE_PAYMENT,
    CONFIRMED_RESERVATION_AFTER_PAYMENT,
    CANCELLED_RESERVATION;

    public static int getReservationStatus(ReservationStatus reservationStatus) {

        return switch (reservationStatus) {
            case RESERVATION_DURING_CREATION -> 0;
            case CONFIRMED_RESERVATION_BEFORE_PAYMENT -> 1;
            case CONFIRMED_RESERVATION_AFTER_PAYMENT -> 2;
            case CANCELLED_RESERVATION -> 3;
        };
    }

}