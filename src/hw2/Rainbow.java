package hw2;

public class Rainbow {

    public static int colorOutput (int color) {
        switch(color) {
            case 413:
                System.out.println("�������");
                break;
            case 415:
                System.out.println("���������");
                break;
            case 417:
                System.out.println("������");
                break;
            case 419:
                System.out.println("�������");
                break;
            case 421:
                System.out.println("�������");
                break;
            case 423:
                System.out.println("�����");
                break;
            case 425:
                System.out.println("����������");
                break;
        }

        if (color%2 == 0) {
            switch(color) {
                case 414:
                    System.out.println("������-���������");
                    break;
                case 416:
                    System.out.println("��������-�����");
                    break;
                case 418:
                    System.out.println("Ƹ���-������");
                    break;
                case 420:
                    System.out.println("�����-�������");
                    break;
                case 422:
                    System.out.println("������-�����");
                    break;
                case 424:
                    System.out.println("����-����������");
                    break;
            }
        }
        return color;
    }
}
