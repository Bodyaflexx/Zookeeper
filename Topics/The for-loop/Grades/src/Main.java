import java.util.Objects;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int amountOfD = 0;
        int amountOfC = 0;
        int amountOfB = 0;
        int amountOfA = 0;
        for (int i = 0; i <= n; i++) {
            String test = scanner.nextLine();
            if (Objects.equals(test, "A")) {
                amountOfA++;
            } else if (Objects.equals(test, "B")) {
                amountOfB++;
            } else if (Objects.equals(test, "C")) {
                amountOfC++;
            } else if (Objects.equals(test, "D")) {
                amountOfD++;
            }
        }
        System.out.print(amountOfD + " " + amountOfC + " " + amountOfB + " " + amountOfA);

    }
}