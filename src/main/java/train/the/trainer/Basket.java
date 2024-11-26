package train.the.trainer;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Basket {
    private final List<Product> items = new ArrayList<>();

    public int size() {
        return items.size();
    }

    public void add(Product product) {
        items.add(product);
    }

    public void remove(String itemName) {
       items.removeIf(product -> product.itemName().equals(itemName));
    }

    public List<Product> contents() {
        return items;
    }

    public BigDecimal priceTotal() {
        BigDecimal total = new BigDecimal("0.00");
        for (Product product : items) {
            total = total.add(product.itemPrice());
        }
        return total;
    }

    public void printReceipt(int numberOfCopies){
        for (int i = 0; i < numberOfCopies; i++) {
            System.out.println(ReceiptFormatter.itemisedAndTotal(this));
        }

    }
}
