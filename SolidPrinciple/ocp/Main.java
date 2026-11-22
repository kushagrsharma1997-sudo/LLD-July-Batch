package SolidPrinciples.ocp;

import SolidPrinciples.ocp.badDesign.PaymentProcessor;
import SolidPrinciples.ocp.goodDesign.PaymentMethod;
import SolidPrinciples.ocp.goodDesign.UpiPayment;

import java.math.BigDecimal;

public class Main {
     public static void main(String[] args) {
    //    PaymentProcessor paymentProcessor =
    //            new PaymentProcessor();
    //    paymentProcessor.processPayment("CREDIT_CARD", 100);


        // Good Design .......................

        SolidPrinciples.ocp.goodDesign.PaymentProcessor processor = new SolidPrinciples.ocp.goodDesign.PaymentProcessor();

        PaymentMethod paymentMethod = new UpiPayment();

        processor.processPayment(paymentMethod, new BigDecimal("1000.00"));

    }
}
