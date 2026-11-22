package SolidPrinciples.ocp.goodDesign;

import java.math.BigDecimal;

public interface PaymentMethod {

    void pay(BigDecimal amount);
}
