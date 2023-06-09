package ExceptionHandling;

public class Main {
    public static String accountName = "Volodya Bolobol";
    public static int balance = 1258;

    public static void main(String[] args) throws InsufficientAmountException {
        System.out.println(deduct("Volodya Bolobol", 1253));
    }
    public static int deduct(String accountToProcess, int amtToCacheOut)throws
            InsufficientAmountException {
        if (!accountName.equals(accountToProcess)){
            throw new AccessDeniedException("Provided account doesn't match the target one");
        }
        if (balance < amtToCacheOut){
            throw new InsufficientAmountException("Not enough money to withdraw " + amtToCacheOut);
        }
        balance = balance - amtToCacheOut;
        return balance;
    }

}
