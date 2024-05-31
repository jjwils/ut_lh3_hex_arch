package train.the.trainer;

public class Main {

    public static void main(String[] args) {

        Program program = new Program(new ConsolePrinter(), new FizzBuzz());
        program.printNumbers(100);
    }
}
