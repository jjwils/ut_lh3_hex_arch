package train.the.trainer;

public class Program {
    FizzBuzz fizzBuzz = new FizzBuzz();
    void printNumbers(int number) {
        for (int i = 1; i <= number; i++) {
            System.out.println(fizzBuzz.convert(i));
        }
    }
}
