package train.the.trainer;

public class Printer {
    private int count = 0;

    public int count() {
        return count;
    }

    public void print(String message) {
        count++;
    }
}
