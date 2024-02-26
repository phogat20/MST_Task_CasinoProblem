import java.util.Random;

public class CasinoGame {

    public static void main(String[] args) {
        int moneyInPocket = 10000;
        int perSpin = 10;
        int winAmount = 20;
        int iterations = 1000;

        Random random = new Random();

        int playerWins = 0;
        int casinoWins = 0;

        for (int i : random.ints(iterations, 1, 101).toArray()) {
            if (i <= 49) {
                playerWins++;
            } else {
                casinoWins++;
            }
        }

        int currentMoney = moneyInPocket + (playerWins * (winAmount - perSpin))
                - (casinoWins * perSpin);

        // Print the final result
        System.out.println("After " + iterations + " iterations:");
        System.out.println("Player Wins: $" + playerWins * winAmount);
        System.out.println("Casino Wins: $" + casinoWins * perSpin);
        System.out.println("Final Amount: $" + currentMoney);
    }
}
