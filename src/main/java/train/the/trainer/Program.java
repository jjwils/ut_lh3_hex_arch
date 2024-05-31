package train.the.trainer;

public class Program {
    private final Printer printer;
    private final Convertor testConvertor;

    public Program(Printer printer, Convertor testConvertor) {
        this.printer = printer;
        this.testConvertor = testConvertor;
    }

    public void printNumbers(int amountToPrint) {
        for (int i = 1; i <= amountToPrint; i++) {
            printer.print(testConvertor.convert(i));
        }

    }
}
