package hw2;

import java.util.Scanner;

import static hw2.Rainbow.colorOutput;

public class Main {
    public static void main (String[] args) {
        System.out.println ("������(413) �������(415) ������(417) �����(419) ���(421) �����(423) �����(425)" + "\n" + "What colour do you want to get? Enter your number from 413 to 425:");
        Scanner scanner = new Scanner (System.in);
        int color;
        color = scanner.nextInt();
        scanner.close();

        colorOutput(color);

    }
}
