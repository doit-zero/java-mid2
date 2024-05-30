package collection.compare.test;


public class Card {
    private int number;
    private String shape;
    public Card(int number, String shape) {
        this.number = number;
        this.shape = shape;
    }

    public int getNumber() {
        return number;
    }

    public String getShape() {
        return shape;
    }

    @Override
    public String toString() {
        return number + "("+ shape + ")";
    }
}
