import java.util.Scanner;

public class Lesson {
    int id;
    String name;
    double balance;
}

class BankAccount extends Lesson {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount();
        BankAccount yourAccount = new BankAccount();
        BankAccount hisAccount = new BankAccount();


        myAccount.id = 1;
        myAccount.name = "Dima";
        myAccount.balance = 135.55;

        yourAccount.id = 2;
        yourAccount.name = "Irina";
        yourAccount.balance = 15.05;

        hisAccount.id = 3;
        hisAccount.name = "Mama";
        hisAccount.balance = 1350.55;

        System.out.println(myAccount.id);
        System.out.println(yourAccount.balance);
        System.out.println(hisAccount.name);

        System.out.println(myAccount.popolnenie());
        System.out.println(hisAccount.snyatieSoScheta()/*(myAccount.popolnenie(3.4)/*+ yourAccount.popolnenie(100))*/);
    }

    String popolnenie() {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double proizvedenie = balance * a;
        return "Ваш остаток " + proizvedenie;
    }

    String snyatieSoScheta() {
        Scanner sc = new Scanner(System.in);
        double s = sc.nextDouble();
        sc.close();
        double ostatok = balance - s;
        if (ostatok < 0) {
            System.out.println("Ваших средств недостаточно для снятия наличных");
        } else {
            return "Ваш остаток " + ostatok;
        }
        return "Ваш остаток " + balance;
    }
}
