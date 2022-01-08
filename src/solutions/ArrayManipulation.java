package solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayManipulation {
    public static void main(String[] args) {
        List<Integer> one = List.of(1, 5, 3);
        List<Integer> two = List.of(4, 8, 7);
        List<Integer> three = List.of(6, 9, 1);

        List<List<Integer>> one1 = List.of(one, two, three);

        System.out.println(arrayManipulation(10, one1));

    }

    public static long arrayManipulation(int n, List<List<Integer>> queries) {
        long[] array = new long[n];
        long max = Long.MIN_VALUE;

        for (List<Integer> list : queries) {
            int addValue = list.get(2);
            int from = list.get(0) - 1;
            int to = list.get(1) - 1;
            array[from] += addValue;
            if (to + 1 < n) {
                array[to + 1] -= addValue;
            }
        }

        for (int i = 1; i < n; i++) {
            array[i] += array[i - 1];
            max = Math.max(max, array[i]);
        }

        return max;
    }
}
