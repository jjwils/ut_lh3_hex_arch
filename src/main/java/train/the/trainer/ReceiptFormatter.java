package train.the.trainer;

import java.util.List;
import java.util.stream.Collectors;

public class ReceiptFormatter {

    public static String itemisedAndTotal(Basket basket) {
        List<Product> items = basket.contents();

        String itemised = items.stream().map(product -> product.itemName() + " " + product.itemPrice()).collect(Collectors.joining("\n"));

        return itemised + "\n -----------\n" + "Total: " + basket.priceTotal() + "\n";
    }
}
