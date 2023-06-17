package Lesson9.nalog;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaxCalculator {
    public static void main(String[] args) {
        // TODO если нужно, реализовать поставку данных (через консоль или файл или ..etc)
        String[] prices = new String[] {"254", "321", "1564", "85", "879.2", "789654", "1126.68", "365.95", "78", "95.8",
                "12.56", "56.33", "452.3", "1001", "12251", "2136", "9999.99"};
        System.out.println(TaxCalculator.calculateTax(prices));

    }

    /**
     * Метод, расчитывающий налог
     * //TODO расписать коротко как считает
     *
     * @param prices - входной массив ценников
     * @return - посчитанный налог
     */
    public static Double calculateTax(String[] prices) {
        //TODO implement

        double tax1=0.1;
        double tax2=0.2;
        double tax3=0.3;
        double summ=0;
        double taxPrice=0;
        Pattern ptrn = Pattern.compile("[-+]?\\d*\\.?\\d+");

        for (int i = 0; i <prices.length ; i++) {
            Matcher matcher = ptrn.matcher(prices[i]);
            if (!matcher.matches())continue;
            double i1= Double.parseDouble(prices[i]);
            if (i1 >= 0 && i1<100){
                taxPrice= i1 *tax1;
            } else if (i1 >= 100 && i1<1000) {
                taxPrice= i1 *tax2;
            } else if (i1 >= 1000 && i1<10000) {
                taxPrice= i1 *tax3;
            } else if (i1 <= 0){
                continue;
            }
            prices[i]= String.valueOf(taxPrice);
            summ= taxPrice+summ;
        }
        return summ;
    }
}