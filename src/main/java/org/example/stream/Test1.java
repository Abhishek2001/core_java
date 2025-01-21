package org.example.stream;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test1 {

    public static void main(String[] args) {
        String name = "constructor";

        Map<String, Long> collect = Arrays.stream(name.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect);


    }
}
