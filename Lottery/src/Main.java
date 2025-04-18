import java.util.Random;

import static java.awt.geom.Path2D.contains;

public class Main {
    public static void main (String[] args) {
        int[]   bonus = {2, 588, 888, 1000, 10000};
        int[]   newBonus = new int[bonus.length];
        Random random = new Random();
        int count = 0;
        while (count < 5) {
            int randomIndex = random.nextInt(5);
            int prize = bonus[randomIndex];
            if (!contains(newBonus, prize)) {
                newBonus[count] = prize;
                System.out.println(newBonus[count]);
                count++;
            }
        }
    }

    private static boolean contains(int[] newBonus, int prize) {
        for (int i = 0; i < newBonus.length; i++) {
            if (newBonus[i] == prize)
                return true;
        }
        return false;
    }
}