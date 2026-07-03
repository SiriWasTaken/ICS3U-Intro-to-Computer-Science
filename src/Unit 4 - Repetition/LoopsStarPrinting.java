
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LoopsStarPrinting {
    public static void main(String[] args) throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String userSelectedSize = input.readLine();
        final int PEAK_SIZE = Integer.parseInt(userSelectedSize);
        createAPyramid(PEAK_SIZE);
    }
    static void createAPyramid(int PEAK_SIZE){
        for (int i = 1; i <= PEAK_SIZE; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = PEAK_SIZE - 1; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
                }
        System.out.println();
        }

    }
}
