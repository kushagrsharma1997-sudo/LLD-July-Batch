package SolidPrinciples.dip.goodDesign;

public class Main {

    public static void main(String[] args) {

        Order order = new Order("ORD-101",
                "customer@gmail.com",
                "98989898"
        );

        OrderConfirmationSender sender = new SmsConfirmationSender();

        OrderService orderService = new OrderService(sender);

        orderService.placeOrder(order);
    }
}
