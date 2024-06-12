package train.the.trainer.adapter.in;

import train.the.trainer.adapter.out.ConsolePrinter;
import train.the.trainer.adapter.out.FizzBuzzConvertor;
import train.the.trainer.domain.NumberRenderer;

public class Main {

    public static void main(String[] args) {

        NumberRenderer numberRenderer = new NumberRenderer(new ConsolePrinter(), new FizzBuzzConvertor());
        numberRenderer.printNumbers(100);
    }
}
