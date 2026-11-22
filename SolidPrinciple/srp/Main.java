package SolidPrinciples.srp;

import SolidPrinciples.srp.badDesign.InvoiceManager;
import SolidPrinciples.srp.goodDesign.*;

import java.math.BigDecimal;

import SolidPrinciples.srp.goodDesign.InvoiceService;

public class Main {
    public static void main(String[] args) {

    //    InvoiceManager invoiceManager = new InvoiceManager();
    //    double total = invoiceManager.calculateTotal(100);

    //    System.out.println("Total: " + total);

    //    invoiceManager.saveInvoice(total);
    //    invoiceManager.sendInvoiceEmail(total, "adi@gmail.com");

        // Good Design .......................

        InvoiceService invoiceService = new InvoiceService(new InvoiceCalculator(),
                new InvoiceRepository(), new InvoiceEmailSender());

        invoiceService.issueInvoice(new Invoice(
                new BigDecimal("100"), "adi@gmail.com"));
    }
}
