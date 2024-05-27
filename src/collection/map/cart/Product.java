package collection.map.cart;

import java.util.Objects;

public class Product {
    private String itemName;
    private int price;

    public Product(String itemName, int price) {
        this.itemName = itemName;
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product product)) return false;
        return price == product.price && Objects.equals(itemName, product.itemName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(itemName, price);
    }

    @Override
    public String toString() {
        return "Product{ name = " + itemName + " , price = " + price + "}";
    }
}
