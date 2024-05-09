package generic.ex1;

public class BoxMain1 {

    public static void main(String[] args) {
        IntegerBox integerBox = new IntegerBox();
        integerBox.setValue(10);
        Integer intValue = integerBox.getValue();
        System.out.println("intValue : " + intValue);

        StringBox stringBox = new StringBox();
        stringBox.setValue("hello");
        String stringValue = stringBox.getValue();
        System.out.println("stringValue : " + stringValue);
    }
}
