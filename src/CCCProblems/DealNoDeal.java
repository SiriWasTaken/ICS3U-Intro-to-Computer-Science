import java.util.*;

public class DealNoDeal {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        HashSet<Integer> eliminated = new HashSet<>();

        for (int i = 0; i < n; i++) {
            eliminated.add(input.nextInt());
        }

        int bankOffer = input.nextInt();

        int[] values = {
            100, 500, 1000, 5000, 10000, 25000, 50000, 100000, 500000, 1000000
        };

        int sum = 0;
        int remaining = 0;

        for (int val : values) {
            if (!eliminated.contains(val)) {
                sum += val;
                remaining++;
            }
        }


        if (bankOffer > values[9] || bankOffer > sum) {
            System.out.println("deal");
        } else {
            System.out.println("no deal");
        }

        input.close();
    }
}