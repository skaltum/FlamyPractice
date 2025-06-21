package FlamyMap.com.pwflamy.tasks.exceptions;

public class OutOfStockException extends RuntimeException {
    private final int currentStock;

    public OutOfStockException(String message, int currentStock) {
        super(message);
        this.currentStock = currentStock;
    }

    public int getCurrentStock() {
        return currentStock;
    }
}
