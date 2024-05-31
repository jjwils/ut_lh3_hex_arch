package train.the.trainer;

import train.the.trainer.adapter.out.ConsolePrinter;

public class Main {

    public static void main(String[] args) {

        Program program = new Program(new ConsolePrinter(), new TestDoubleConvertor());
        program.printNumbers(2);
    }
}
