package Documents;

public enum PaymentStatus {
    PAID,
    NOT_PAID;

    public static int getPaymentStatus(PaymentStatus paymentStatus) {
        return switch (paymentStatus) {
            case PAID -> 1;
            case NOT_PAID -> 0;
        };
    }

}
