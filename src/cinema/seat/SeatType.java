package cinema.seat;

public enum SeatType {

        STANDARD(0),
        PREMIUM(1),
        VIP(2),
        ACCESSIBLE(3),
        COUPLE(4);

    private final int type;

    SeatType(int type) {
        this.type = type;
    }

//    saving to the database
//    public int getType() {
//        return type;
//    }
}
