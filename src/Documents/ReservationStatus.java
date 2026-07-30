package Documents;

public enum ReservationStatus {

    RESERVATION_DURING_CREATION(0),
    CONFIRMED_RESERVATION_BEFORE_PAYMENT(1),
    CONFIRMED_RESERVATION_AFTER_PAYMENT(2),
    CANCELLED_RESERVATION(3);

    private final int code;

    ReservationStatus(int code) {
        this.code = code;
    }

//    public int getCode() {
//        return code;
//    }
}