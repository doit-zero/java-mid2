package generic.ex1;

public class BoxMain3 {
    public static void main(String[] args) {
        // 타입 추론 : 생성하는 제네릭 타입은 생략 가능하다.
        GenericBox<Integer> integerBox = new GenericBox<>();
        integerBox.set(100);
        Integer integer = integerBox.get();
        System.out.println("integert : " + integer);

        GenericBox<String> stringBox = new GenericBox<>();
        stringBox.set("hello");
        String str = stringBox.get();
        System.out.println("str : " + str );
    }
}
