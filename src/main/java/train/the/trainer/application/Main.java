package train.the.trainer.application;

import train.the.trainer.adapter.out.ConsolePrinter;
import train.the.trainer.adapter.out.FizzBuzz;
import train.the.trainer.domain.Program;

public class Main {

    public static void main(String[] args) {

        Program program = new Program(new ConsolePrinter(), new FizzBuzz());
        program.printNumbers(100);
    }
}
