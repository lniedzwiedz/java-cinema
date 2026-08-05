package payments;

public enum PaymentStatus {

    NOT_PAID(0),
    PAID(1);

    private final int code;

    PaymentStatus(int code) {
        this.code = code;
    }

    // Used when saving to the database
    public int getCode() {
        return code;
    }
}
