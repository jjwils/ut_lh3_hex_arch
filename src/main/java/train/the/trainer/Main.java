package train.the.trainer;

public class Main {

    public static void main(String[] args) {

        Program program = new Program(new ConsolePrinter(), new TestDoubleConvertor());
        program.printNumbers(2);
    }
}
