package collection.map.test;

import java.util.HashMap;
import java.util.Map;

public class ArrayToMapTest {
    public static void main(String[] args) {
        Map<String,Integer> productMap = new HashMap<>();
        productMap.put("Java",10000);
        productMap.put("Spring",20000);
        productMap.put("JPA",30000);

        for(String key : productMap.keySet()){
            System.out.println("제품 : " + key + " , 가격 : " + productMap.get(key));
        }
    }
}
