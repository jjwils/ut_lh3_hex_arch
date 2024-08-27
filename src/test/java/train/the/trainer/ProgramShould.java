package train.the.trainer;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProgramShould {

    @Test
    void print_numbers(){

        //given
        Printer printer = new Printer();
        Program program = new Program(printer);

        //when
        program.printNumbers(2);

        //then
        assertEquals(2, printer.count());
    }
}
