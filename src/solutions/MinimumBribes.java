package solutions;

import java.util.List;

public class MinimumBribes {
    public static void minimumBribes(List<Integer> q) {
        int totalBribes = 0;
        int listSize = q.size();
        String tooChaotic = "Too chaotic";

        for (int i = 0; i < listSize; i++) {
            if (q.get(i) - (i + 1) > 2) {
                System.out.println(tooChaotic);
                return;
            }
            for (int j = Math.max(0, q.get(i) - 2); j < i; j++)
                if (q.get(j) > q.get(i))
                    totalBribes++;
        }

        System.out.println(totalBribes);

    }

    public static void main(String[] args) {
        minimumBribes(List.of(2, 1, 5, 3, 4));
    }
}
