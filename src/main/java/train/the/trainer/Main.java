package train.the.trainer;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        Basket basket = new Basket();
        basket.add(new Product("Apple", new BigDecimal("0.99")));
        basket.add(new Product("Orange", new BigDecimal("0.49")));

        basket.printReceipt(2);

    }
}
