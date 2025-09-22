package Streams;

import java.util.*;
import java.util.stream.*;

public class cartesianproductUsingFlatMap {
    public static void main(String[] args) {
        List<Integer> numbers1 = List.of(1, 2, 3,4,5);
        List<Integer> numbers2 = List.of(3, 4);

        List<int[]> pairs = numbers1.stream()
                .flatMap(i -> numbers2.stream().map(j -> new int[]{i, j}))
                .collect(Collectors.toList());

        pairs.forEach(pair -> System.out.println("(" + pair[0] + "," + pair[1] + ")"));
    }
}
