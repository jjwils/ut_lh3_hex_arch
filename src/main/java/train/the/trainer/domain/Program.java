package train.the.trainer.domain;

import train.the.trainer.application.port.Printer;

public class Program {
    private final Printer printer;
    private final TestDoubleConvertor testDoubleConvertor;

    public Program(Printer printer, TestDoubleConvertor testDoubleConvertor) {
        this.printer = printer;
        this.testDoubleConvertor = testDoubleConvertor;
    }

    public void printNumbers(int amountToPrint) {
        for (int i = 1; i <= amountToPrint; i++) {
            printer.print(testDoubleConvertor.convert(i));
        }

    }
}
