package train.the.trainer;

public class TestDoublePrinter implements Printer {
    private int count = 0;

    public int count() {
        return count;
    }

    @Override
    public void print(String message) {
        count++;
    }
}
