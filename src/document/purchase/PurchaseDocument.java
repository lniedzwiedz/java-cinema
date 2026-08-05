package document.purchase;

import document.reservation.Reservation;

public class PurchaseDocument {

    private String purchaseDocumentNumber;
    private Reservation reservation;

    public PurchaseDocument(Reservation reservation) {
        this.reservation = reservation;
    }

    public Reservation getReservation() {
        return reservation;
    }

    public String getPurchaseDocumentNumber() {
        return purchaseDocumentNumber;
    }

    public void setPurchaseDocumentNumber(String purchaseDocumentNumber) {
        this.purchaseDocumentNumber = purchaseDocumentNumber;
    }
}
