/**
 * Created by Артём on 08.05.2017.
 */
public class Invoice {
    private static class Item {
        String description;
        int quantity;
        double unitPrice;

        double price() {
            return quantity * unitPrice;
        }
    }
}
