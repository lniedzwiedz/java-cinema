package Documents;

import static Documents.PaymentStatus.*;

public class PurchaseDocument {

    private String purchaseDocumentNumber;
    private Reservation reservation;
    private PaymentStatus paymentStatus;

    public PurchaseDocument(Reservation reservation) {
        this.paymentStatus = PaymentStatus.NOT_PAID;
        this.reservation = reservation;
    }

    public Reservation getReservation() {
        return this.reservation;
    }

    public PaymentStatus getPaymentStatus() {
        return paymentStatus;
    }

    public void setPurchaseDocumentNumber(String purchaseDocumentNumber) {
        this.purchaseDocumentNumber = purchaseDocumentNumber;
    }

    public void payForReservation(boolean doYouWantToPayForReservation, boolean paymentSuccessful) {

        if (!doYouWantToPayForReservation) {
            reservation.cancelReservation();
            return;
        }

        if (paymentSuccessful) {
            this.reservation.confirmReservationAfterPayment();
            this.paymentStatus = PaymentStatus.PAID;
            sendEmailToClient();
        } else {
            System.out.println();
            System.out.println("Payment for reservation end with error. Please try one more time.");
        }
    }

    protected void sendEmailToClient() {
        System.out.println();
        System.out.println("Purchase document was sent to email: " + this.reservation.getClient().getClientEmail());
    }
}
