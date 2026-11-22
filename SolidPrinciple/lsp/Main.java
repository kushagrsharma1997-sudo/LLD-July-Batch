package SolidPrinciples.lsp;

import SolidPrinciples.lsp.badDesign.Account;
import SolidPrinciples.lsp.badDesign.BillPaymentService;
import SolidPrinciples.lsp.badDesign.SavingsAccount;

public class Main {
    public static void main(String[] args) {
        //bad design code.......

        Account account = new SavingsAccount(1000);

        BillPaymentService billPaymentService = new BillPaymentService();

        billPaymentService.payBill(account, 500);
    }
}
