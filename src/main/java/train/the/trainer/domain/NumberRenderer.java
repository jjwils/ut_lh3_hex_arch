package train.the.trainer.domain;

import train.the.trainer.application.port.Convertor;
import train.the.trainer.application.port.Printer;

public class NumberRenderer {
    private final Printer printer;
    private final Convertor convertor;

    public NumberRenderer(Printer printer, Convertor convertor) {
        this.printer = printer;
        this.convertor = convertor;
    }

    public void printNumbers(int amountToPrint) {
        for (int i = 1; i <= amountToPrint; i++) {
            printer.print(convertor.convert(i));
        }

    }
}
