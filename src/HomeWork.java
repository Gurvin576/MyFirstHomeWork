import java.util.Scanner;

public class HomeWork {
    public static void main(String[] param) {
        // Назначаем переменные вопросов
        String str1="Расскажите о вашем друге.";
        String str2="Как зовут вашего друга?";
        String str3="Сколько лет вашему другу";

        System.out.println(str1);

        System.out.println(str2);

        Scanner in = new Scanner(System.in, "ibm866");
        var name = in.nextLine();

        System.out.println(str3);

        var age = in.nextInt();

        int ageLastNumber = age % 10;
        boolean isExclusion = (age % 100 >= 11) && (age % 100 <= 14);
        String old = "";
// условие чтобы корректно печаталась переменная old (лет, год, года) в зависимости от введенного числа age
        if (ageLastNumber == 1)
            old = " год";
        else if(ageLastNumber == 0 || ageLastNumber >= 5 && ageLastNumber <= 9)
            old = " лет";
        else if(ageLastNumber >= 2 && ageLastNumber <= 4)
            old = " года";
        if (isExclusion)
            old = " лет";

        System.out.println("Моему другу "+ name + " сейчас "+ age + old);
        // System.out.println(""Моему другу сейчас ""+ age + old);
    }
}