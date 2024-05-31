package train.the.trainer.domain;

public class TestDoubleConvertor {


    private String rendered;

    public String rendered() {
        return rendered;
    }

    public String convert(int i) {

        rendered = i + "x";
        return rendered;
    }
}
