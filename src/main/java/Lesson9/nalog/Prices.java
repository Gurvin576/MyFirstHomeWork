package Lesson9.nalog;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Prices {
    public static String[] prices = {"254", "321", "1564", "85", "879.2", "789654", "1126.68", "365.95", "78", "95.8",
            "12.56", "56.33", "452.3", "1001", "12251", "2136", "9999.99"};
    static double tax1=0.1;
    static double tax2=0.2;
    static double tax3=0.3;
    static double summ=0;
    static double taxPrice=0;



    static void initPrices() {
        for (int i = 0; i < prices.length; i++) {
            Pattern ptrn = Pattern.compile("[-+]?\\d*\\.?\\d+");
            Matcher matcher = ptrn.matcher(prices[i]);
            double i1= Double.parseDouble(Prices.prices[i]);
            if (i1 >= 0 && i1<100){
                taxPrice= i1 *tax1;
            } else if (i1 >= 100 && i1<1000) {
                taxPrice= i1 *tax2;
            } else if (i1 >= 1000 && i1<10000) {
                taxPrice= i1 *tax3;
            } else;
            prices[i]= String.valueOf(taxPrice);
        }
        for (int i = 0; i < prices.length; i++) {
            double i1=Double.parseDouble(prices[i]);
            summ= i1+summ;

        }

    }
}


