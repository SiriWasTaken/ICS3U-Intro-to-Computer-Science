import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CCCS1DistinctYear{
    public static void main(String[] args) throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        int year = Integer.parseInt(input.readLine());

        while (true) {
            year++;
            String s = String.valueOf(year);
            boolean distinct = true;
            for (int i = 0; i < s.length() && distinct; i++) {
                for (int j = i + 1; j < s.length(); j++) {
                    if (s.charAt(i) == s.charAt(j)) {
                        distinct = false;
                        break;
                    }
                }
            }
            if (distinct) {
                System.out.println(year);
                break;
            }
        }

    }

} 