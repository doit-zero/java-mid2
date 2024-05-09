package generic.ex2;

import generic.animal.Animal;
import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalMain1 {
    public static void main(String[] args) {
        Animal animal = new Animal("동물",100);
        Dog dog = new Dog("강아지", 20);
        Cat cat = new Cat("고양이",30);

        Box<Dog> dogBox = new Box<>();
        dogBox.set(dog);
        System.out.println("dogBox의 dog : " + dogBox.get());

        Box<Cat> catBox = new Box<>();
        catBox.set(cat);
        System.out.println("catBox의 cat : " + catBox.get());
    }
}
