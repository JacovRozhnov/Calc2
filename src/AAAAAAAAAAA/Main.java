package AAAAAAAAAAA;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Введите пример");

            String vvod = scanner.nextLine();
            if (vvod.equals("стоп")) {
                System.out.println("Завершение работы.");
                break;
            } else if (raschet(vvod) < 0) {
                System.out.println("Отрицательные числа не проходять по условию задачи");
                break;
            } else
                System.out.println(vvod + "=" + raschet(vvod));
            Thread.sleep(2000);
        }
    }

    static int raschet(String vvod) {

        int result = -1;
        String znac = Split.split(vvod);
        String[] razdel = vvod.split(znac);

        switch (znac) {
            case ("\\*"):
                result = Rim.rim(razdel[0]) * Rim.rim(razdel[1]);
                break;
            case ("/"):
                result = Rim.rim(razdel[0]) / Rim.rim(razdel[1]);
                break;
            case ("\\+"):
                result = Rim.rim(razdel[0]) + Rim.rim(razdel[1]);
                break;
            case ("-"):
                result = Rim.rim(razdel[0]) - Rim.rim(razdel[1]);
                break;
            default:
                System.out.print("Калькулятор неумеет работать со знаком " + znac);
        }

        return result;
    }
}
