package dz;

public class Summa {
    public static void main(String[] args) {

        int[] inputedInts = new int[10];
        for (int i = 0; i < args.length; i++) {
            inputedInts[i] = Integer.parseInt(args[i]);
        }

        StringBuilder inputedArgs = new StringBuilder();
        for (String arg : args) inputedArgs.append(arg).append("+");
        System.out.print(inputedArgs.substring(0, inputedArgs.length() - 1) + "=" + summaVsehChisel(inputedInts));
    }

    public static int summaVsehChisel(int[] numbers) {
        int result = 0;
        for (int number : numbers) {
            result+=number;
        }
        return result;
    }
}
