package cn.yase.java8.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author yase
 * @create 2018-11-28
 */
public class CollectionDemo {

    public static void main(String[] args) {
        //求平均值
        Map<String,Integer> map = new HashMap<>(2);
        map.put("a",1);
        map.put("b",2);
        Double collect = map.values().stream().collect(Collectors.averagingDouble(a -> Double.valueOf(a)));
        int collectInt = map.values().stream().collect(Collectors.averagingDouble(a -> Double.valueOf(a))).intValue();

        System.out.println(collect+" "+collectInt);

        //向上取整
        int a = (int)Math.ceil(collect);
        System.out.println("a = "+a);
    }

}
