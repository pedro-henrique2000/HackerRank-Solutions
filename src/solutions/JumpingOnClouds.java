package solutions;

import java.util.List;

public class JumpingOnClouds {

    public static void main(String[] args) {
        List<Integer> integerList = List.of(0, 0, 1, 0, 0, 1, 0);

        System.out.println(jumpingOnClouds(integerList));
    }


    public static int jumpingOnClouds(List<Integer> c) {
        int jumps = -1;

        for (int i = 0; i < c.size(); jumps++) {
            if (c.size() > i + 2 && c.get(i + 2) == 0)
                i += 2;
            else
                i++;
        }

        return jumps;
    }
}
