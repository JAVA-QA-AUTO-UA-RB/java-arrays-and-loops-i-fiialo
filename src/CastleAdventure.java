import java.util.Scanner;

public class CastleAdventure {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] secretCode = {3, 14, 159, 26, 535};
        while (true) {
            System.out.println("Введіть 5 чисел, щоб відкрити двері замку:");
            boolean isCodeCorrect = true;

            for (int i = 0; i < secretCode.length; i++) {
                int userInput = scanner.nextInt();
                if (userInput != secretCode[i]) {
                    isCodeCorrect = false;
                }
            }
            if (isCodeCorrect) {
                System.out.println("Замок відкрито! Заходьте всередину.");
                System.out.println("Потрапивши у замок, ти бачиш чарівну дошку з числами.");
                break;
            } else {
                System.out.println("Невірний код. Спробуйте ще.");
            }
        }
        int[] sumNumbers = {3, 6, 9, 12, 15, 18, 21, 24, 27, 30};
        while (true) {
            System.out.println("Введіть 10 магічних чисел з дошки по черзі:");
            boolean correct = true;

            for (int i = 0; i < sumNumbers.length; i++) {
                int userInput = scanner.nextInt();
                if (userInput != sumNumbers[i]) {
                    correct = false;
                }
            }

            if (correct) {
                System.out.println("Двері відкриті! Заходьте.");
                break;
            } else {
                System.out.println("Невірна послідовність. Спробуй ще.");
            }
        }
        int[] codeAttack = {8, 16, 24, 32, 40};
        boolean allEven = true;
        System.out.println("Ти зустрів Залізного дракона!");
        System.out.println("Тобі потрібно передбачити його атаку!");

        for (int attack : codeAttack) {
            if (attack % 2 != 0) {
                allEven = false;
                break;
            }
        }
        if (allEven) {
            System.out.println("Атаки парні! Захист активовано!");
        } else {
            System.out.println("Увага! Непарна атака!");
        }
        System.out.print("Введіть улюблене число: ");
        int favoriteNumber = scanner.nextInt();

        int[][] allArrays = {secretCode, sumNumbers, codeAttack};
        boolean found = false;

        for (int[] array : allArrays) {
            for (int num : array) {
                if (num == favoriteNumber) {
                    found = true;
                    break;
                }
            }
            if (found) break;
        }
        System.out.println(found ? "Твій ключ знайдено!" : "Треба більше магії...");
    }
}