package hw4;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static Random chars = new Random();
    public static char[] alphabet = {'A','a','B','b','C','c','D','d','E','e','F','f','G','g','H','h','I','i','J','j','K','k','L','l','M','m','N','n','O','o','P','p','Q','q','R','r','S','s','T','t','U','u','V','v','W','w','X','x','Y','y','Z','z'};
    public static int alphabetLength = alphabet.length;
    public static char getRandomChar() {
        return alphabet[chars.nextInt(alphabetLength)];
    }
    public static Random doubleNumbers = new Random();
    public static double randomValue = ThreadLocalRandom.current().nextDouble(Double.MIN_VALUE, Double.MAX_VALUE);
    public static double getRandomDouble() {
        return randomValue = Double.MIN_VALUE + doubleNumbers.nextDouble() * (Double.MAX_VALUE - Double.MIN_VALUE);
    }

    public static void main(String[] args) {
        int count = 1;
        String[][] matrix = new String[10][10];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if(count%3 != 0) {
                    matrix[i][j] = String.valueOf(getRandomChar()).concat(String.valueOf(getRandomChar())).concat(String.valueOf(getRandomChar())).concat(String.valueOf(getRandomChar())).concat(String.valueOf(getRandomChar())).concat(String.valueOf(getRandomChar())).concat(String.valueOf(getRandomChar()));
                }else {
                    String randomDouble = String.valueOf(getRandomDouble());
                    matrix[i][j] = randomDouble.substring(0,7);
                }
                count++;
            }
        }
        System.out.println(Arrays.deepToString(matrix));

        String[] diagonal1 = new String[10];
        String[] diagonal2 = new String[10];
        for (int i = 0; i < matrix.length; i++) {
            String string1 = matrix[i][i];
            String string2 = matrix[i][matrix.length-i-1];
            diagonal1[i] = string1;
            diagonal2[i] = string2;
            if(string1.equals(string2)) {
                System.out.println("These strings are equal");
            } else {
                System.out.println("These strings are not equal");
            }
        }
        System.out.println(" ");
        System.out.println(Arrays.deepToString(diagonal1));
        System.out.println(Arrays.deepToString(diagonal2));

        String[] diagonals = new String[20];
        for (int i = 0; i < 10; i++) {
            diagonals[i] = diagonal1[i];
        }
        for (int i = 0; i < diagonal2.length; i++) {
            diagonals[i+10] = diagonal2[i];
        }
        System.out.println(Arrays.toString(diagonals));

        StringBuilder[] stringsOfDiagonals = new StringBuilder[20];
        double[] doublesFromDiagonal = new double[10];
        double temp;
        for (int i = 0; i < diagonals.length; i++) {
            if (diagonals[i].matches("\\w{7}")) {
                stringsOfDiagonals[i] = new StringBuilder(diagonals[i].substring(1, 4));
                System.out.print(stringsOfDiagonals[i] + ", ");
            } else {
                temp = Double.parseDouble(diagonals[i]);
                BigDecimal result = new BigDecimal(temp);
                result = result.setScale(1, RoundingMode.HALF_UP);
                temp = result.doubleValue();
                doublesFromDiagonal[i] = temp;
            }
        }

        for (double x : doublesFromDiagonal) {
            if (x != 0.0) {
                System.out.print(x + "_");
            }
        }

    }
}
