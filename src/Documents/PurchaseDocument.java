package Documents;

import static Documents.PaymentStatus.*;

public class PurchaseDocument {

    private String purchaseDocumentNumber;
    private Reservation reservation;
    private int paymentStatus;

    public PurchaseDocument(Reservation reservation) {
//        this.paymentStatus = 0;
        this.paymentStatus = PaymentStatus.getPaymentStatus(NOT_PAID);
        this.reservation = reservation;
    }

    public Reservation getReservation(){
        return this.reservation;
    }

    public void payForReservation(boolean doYouWantToPayForReservation, boolean isPaymentForReservationWasSuccessful) {
        if (doYouWantToPayForReservation == true) {
            if (isPaymentForReservationWasSuccessful == true) {
                this.reservation.confirmReservationAfterPayment();
                this.paymentStatus = PaymentStatus.getPaymentStatus(PAID);
                sentEmailToClient();
            } else {
//                System.out.println();
//                System.out.println("Payment for reservation end with error. Please try one more time.");
            }
        } else {
            this.reservation.cancelReservation();
        }
    }

    protected void sentEmailToClient() {
        System.out.println();
        System.out.println("Purchase document was sent to email: " + this.reservation.getClient().getClientEmail());
    }

}
