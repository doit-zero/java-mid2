package collection.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class MapMain1 {
    public static void main(String[] args) {
        Map<String,Integer> studentMap = new HashMap<>();

        // 학생 성적 데이터 추가
        Collection<Integer> values = studentMap.values();
        System.out.println(values.getClass());
    }
}
