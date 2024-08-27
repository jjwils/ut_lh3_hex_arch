package train.the.trainer;

public class Program {
    private final Printer printer;

    public Program(Printer printer) {

        this.printer = printer;
    }

    public void printNumbers(int amountToPrint) {
       FizzBuzz fizzBuzz = new FizzBuzz();
        for (int i = 0; i < amountToPrint; i++) {
            printer.print(fizzBuzz.convert(i + 1));
        }

    }
}
