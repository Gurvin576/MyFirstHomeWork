package StringWorking;

import java.util.Arrays;

public class Main {
/*    static int I = 1703;
    static String a = "Петром Первым";
    static String[] arrayNames = {"Санкт-Петербург, Петроград, Ленинград"};
    static String arr= new String(Arrays.toString(arrayNames));
    static String b = "Питер";*/

    public static void main(String[] args) {
        int I = 1703;
        String a = "Петром Первым";
        String[] arrayNames = {"Санкт-Петербург", "Петроград", "Ленинград"};
        String b = "Питер";
        String result = String.format("Санкт-Петербург был основан в %d году %s. За свою историю он носил имена: %s, %s, %s. Сейчас многие зовут его просто “%s”.", I, a, arrayNames[0], arrayNames[1], arrayNames[2], b);

        System.out.println("Санкт-Петербург был основан в " + I + " году " + a + ". " + "За свою историю он носил имена:" + Arrays.toString(arrayNames) + "." + "Сейчас многие зовут его просто “" + b + "”.");

        System.out.println(result);
    }

}
