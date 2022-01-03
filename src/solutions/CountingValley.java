package solutions;

public class CountingValley {

    public static void main(String[] args) {
        System.out.println(countingValleys(8, "UDDDUDUU"));
    }


    public static int countingValleys(int steps, String path) {
        int result = 0;
        int position = 0;

        for (int i = 0; i < steps; i++) {
            if (path.charAt(i) == 'U') {
                if (position < 0 && position + 1 == 0 )
                    result++;

                position++;
            }
            else
                position--;
        }


        return result;

    }
}
