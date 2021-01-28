package pjatk.byt.group3.payment;

import pjatk.byt.group3.borrow.Borrow;
import pjatk.byt.group3.enums.PaymentMethodEnum;

import java.util.UUID;

public class Payment {

    private final UUID id;
    private PaymentMethodEnum paymentMethodEnum;
    private final Double amountDue;
    private boolean isPayed = false;
    private final Borrow borrow;


    public Payment(Double amount, Borrow borrow) {
        this.id = UUID.randomUUID();
        this.amountDue = amount;
        this.borrow = borrow;
    }

    //assuming payment can be partial (not the whole bill amount_due)
    public void makePayment() {
        System.out.println("pay");
        setPayed(true);
    }

    public void setPaymentMethodEnum(PaymentMethodEnum paymentMethodEnum) {
        this.paymentMethodEnum = paymentMethodEnum;
    }

    public UUID getId() {
        return id;
    }

    public PaymentMethodEnum getPaymentMethodEnum() {
        return paymentMethodEnum;
    }

    public Double getAmountDue() {
        return amountDue;
    }

    public boolean isPayed() {
        return isPayed;
    }

    public void setPayed(boolean payed) {
        isPayed = payed;
    }
}
