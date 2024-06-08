package hw3;

import java.util.Random;

public class Main {
        static Random r = new Random(28);
        static int years;
        static Random chars = new Random();
        static char[] sAlphabet = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        static int sLength = sAlphabet.length;

        public static char getRandomChar() {
            return sAlphabet[chars.nextInt(sLength)];
        }

        public static int getRandomAge() {
            return years = r.nextInt(28) + 1;
        }

        public static void main(String[] args) {
            int count = 0;
            int j = 0;
            int x = 0;
            Cat[] cats = new Cat[10];

        while(count < 10) {
            cats[count] = new Cat(getRandomChar(),getRandomAge());
            System.out.println(cats[count]);
            count++;
        }

        for (int i = 0; i < 10; i++) {
            cats[i].setName(getRandomChar());
            cats[i].setAge(getRandomAge());
            System.out.println(cats[i].getName());
            System.out.println(cats[i].getAge());
        }

        do {
            cats[j] = new Cat(getRandomChar(),getRandomAge());
            System.out.println(cats[j]);
            j++;
        } while (j < 10);

       for (Cat cat : cats) {
           cats[x] = new Cat(getRandomChar(), getRandomAge());
           System.out.println(cats[x]);
           x++;
           if (x == 5) {
               break;
           }
       }
    }
}