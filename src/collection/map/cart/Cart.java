package collection.map.cart;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Cart {

    Map<Product,Integer> cart = new HashMap<>();

    public void add(Product item, int value) {
        Integer existingValue = cart.getOrDefault(item,0);
        cart.put(item,existingValue + value);
    }


    public void printAll() {
        System.out.println("모든 상품 출력");
        for(Product product : cart.keySet()){
            System.out.println("상품 : " + product + " 수량 : " + cart.get(product));
        }
    }

    public void minus(Product item, int value) {
        // 상품 수를 줄이며 줄인 상품수가 0보다 작으면 제거
        int existingValue = cart.getOrDefault(item,0);
        int minusValue = existingValue - value;
        if(minusValue <= 0){
            cart.remove(item);
        } else {
            cart.put(item,value);
        }
    }
}
