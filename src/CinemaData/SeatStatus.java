package CinemaData;

public enum SeatStatus {

    AVAILABLE(0),
    TEMPORARILY_RESERVED(1),
    RESERVED(2);

    private final int code;

    SeatStatus(int code) {
        this.code = code;
    }
//    saving to the database
//    public int getCode() {
//        return code;
//    }
}
