package train.the.trainer.domain;

import org.junit.jupiter.api.Test;
import train.the.trainer.application.port.TestDoubleConvertor;
import train.the.trainer.application.port.TestDoublePrinter;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ProgramShould {


    @Test
    void print_numbers(){

        TestDoublePrinter testDoublePrinter = new TestDoublePrinter();
        Program program = new Program(testDoublePrinter, new TestDoubleConvertor());

        program.printNumbers(2);

        assertEquals(2, testDoublePrinter.count());
    }

    @Test
    void render_converted_numbers(){


        TestDoubleConvertor testDoubleConvertor = new TestDoubleConvertor();

        Program program = new Program(new TestDoublePrinter(), testDoubleConvertor);

        program.printNumbers(1);


        assertEquals("1x", testDoubleConvertor.rendered());




    }
}
