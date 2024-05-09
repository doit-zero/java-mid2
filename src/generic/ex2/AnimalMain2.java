package generic.ex2;

import generic.animal.Animal;
import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalMain2 {
    public static void main(String[] args) {
        Animal animal = new Animal("동물",100);
        Dog dog = new Dog("강아지", 20);
        Cat cat = new Cat("고양이",30);

        Box<Animal> animalBox = new Box<>();
        animalBox.set(dog);
        animalBox.set(cat);
        animalBox.set(animal);

        System.out.println("animalBox : " + animalBox.get());
    }
}
