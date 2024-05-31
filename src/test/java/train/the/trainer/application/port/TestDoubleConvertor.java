package train.the.trainer.application.port;

import train.the.trainer.application.port.Convertor;

public class TestDoubleConvertor implements Convertor {


    private String rendered;

    public String rendered() {
        return rendered;
    }

    @Override
    public String convert(int i) {

        rendered = i + "x";
        return rendered;
    }
}
