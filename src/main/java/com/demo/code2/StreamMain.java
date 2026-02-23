package com.demo.code2;

import java.util.*;

public class StreamMain {
    public static void main() {
        List<Integer> list= Arrays.asList(2,4,3,2,4,6,7,7,8,9,22,11,9,5,1);
        list.stream().filter(x->x%2==0).forEach(System.out::println);
        System.out.println();
        Optional<Integer> sum=list.stream().reduce((a, b)->(a+b));
        System.out.println("sum:"+sum.get());
        System.out.println();
        list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

    }
}
