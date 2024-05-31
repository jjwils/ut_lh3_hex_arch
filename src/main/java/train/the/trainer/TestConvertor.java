package train.the.trainer;

public class TestConvertor {


    private String rendered;

    public String rendered() {
        return rendered;
    }

    public String convert(int i) {

        rendered = i + "x";
        return rendered;
    }
}
