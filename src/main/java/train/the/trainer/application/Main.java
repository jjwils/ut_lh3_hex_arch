package train.the.trainer.application;

import train.the.trainer.domain.Program;
import train.the.trainer.domain.TestDoubleConvertor;
import train.the.trainer.adapter.out.ConsolePrinter;

public class Main {

    public static void main(String[] args) {

        Program program = new Program(new ConsolePrinter(), new TestDoubleConvertor());
        program.printNumbers(2);
    }
}
