package Lesson9.calculator;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class CycleSwitchCase {
    public static final String EXIT_COMMAND = "exit";
    static Scanner reader = new Scanner(System.in, StandardCharsets.UTF_8);
    static Double[] massResult = new Double[10];
    private static char operator;


    public void cycleSwitchCase() {
            for (int i = 0; i < massResult.length; i++) {

                System.out.println("Введите 2 числа ");
                double first = reader.nextDouble();
                double second = reader.nextDouble();

                System.out.println("Введите оператор: (+, -, *, /): ");
                Double result = null;

                while (result == null) result = inputOperator(first, second);
                System.out.printf("%.1f %c %.1f = %.1f", first, operator, second, result);

                massResult[i] = result;
                System.out.println();System.out.println("Для выхода введите \"exit\" или нажмите \"Enter\" для продолжения");
                reader.nextLine();
                if (reader.nextLine().equals(EXIT_COMMAND)) break;

            }
 //       }
        for (Double aDouble : massResult) {
            System.out.println(aDouble);
        }
    }

    private Double inputOperator(double first, double second) {

        Double result;
        String fail="Введите корректный оператор";
        operator = reader.next().charAt(0);
        switch (operator) {
                case '+' -> result = first + second;
                case '-' -> result = first - second;
                case '*' -> result = first * second;
                case '/' -> result = first / second;
                default -> {
                result = null;
                System.out.println(fail);
                }
        } return result;
    }
}