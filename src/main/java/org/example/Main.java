package org.example;

import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

       List<Integer> integerList =  Arrays.asList(1,3,5,7);
        Stream<Integer> integerStream = integerList.stream().filter(integer -> integer != null).map(integer -> integer * 2).filter(integer -> integer > 5).map(Main::printAndReturn);
        System.out.println("->>>"+integerStream);
    }

    private static int printAndReturn(Integer integer) {
        System.out.println("--> "+integer);
        return integer;

    }
}