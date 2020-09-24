
package DiceGame;

import java.util.Random;


public class Dice {

    private static int diceValue1;
    private static int diceValue2;
    private static int sum;



    public static void main(String[] args) {

        Random r = new Random();

        diceValue1 = r.nextInt(6)+1;
        System.out.println("Value1: " + diceValue1);

        diceValue2 = r.nextInt(6)+1;
        System.out.println("Value2: " + diceValue2);

        sum = diceValue1 + diceValue2;
        System.out.println("Sum: " + sum);
    }


}

