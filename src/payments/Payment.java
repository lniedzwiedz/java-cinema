package payments;

import document.reservation.Reservation;

public class Payment {

    private PaymentStatus paymentStatus;

    public Payment() {
        this.paymentStatus = PaymentStatus.NOT_PAID;
    }

    public PaymentStatus getPaymentStatus() {
        return paymentStatus;
    }

    public void payForReservation(
            Reservation reservation,
            boolean paymentSuccessful
    ) {
        if (paymentSuccessful) {
            reservation.confirmReservationAfterPayment();
            paymentStatus = PaymentStatus.PAID;

            sendEmailToClient(reservation);
        } else {
            System.out.println();
            System.out.println(
                    "Payment for reservation ended with an error. Please try again."
            );
        }
    }

    private void sendEmailToClient(Reservation reservation) {
        System.out.println();
        System.out.println(
                "Purchase document was sent to email: "
                        + reservation.getClient().getClientEmail()
        );
    }
}