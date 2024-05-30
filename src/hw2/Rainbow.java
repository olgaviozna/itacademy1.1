package hw2;

public class Rainbow {

    public static int colorOutput (int color) {
        switch(color) {
            case 413:
                System.out.println("Красный");
                break;
            case 415:
                System.out.println("Оранжевый");
                break;
            case 417:
                System.out.println("Жёлтый");
                break;
            case 419:
                System.out.println("Зелёный");
                break;
            case 421:
                System.out.println("Голубой");
                break;
            case 423:
                System.out.println("Синий");
                break;
            case 425:
                System.out.println("Фиолетовый");
                break;
        }

        if (color%2 == 0) {
            switch(color) {
                case 414:
                    System.out.println("Красно-оранжевый");
                    break;
                case 416:
                    System.out.println("Оранжево-жёлтый");
                    break;
                case 418:
                    System.out.println("Жёлто-зелёный");
                    break;
                case 420:
                    System.out.println("Зелёно-голубой");
                    break;
                case 422:
                    System.out.println("Голубо-синий");
                    break;
                case 424:
                    System.out.println("Сине-фиолетовый");
                    break;
            }
        }
        return color;
    }
}
