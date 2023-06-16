package Lesson9.nalog;

public class TaxCalculator {
    public static void main(String[] args) {
        // TODO если нужно, реализовать поставку данных (через консоль или файл или ..etc)
        calculateTax(Prices.prices);
        System.out.println(Prices.summ);
    }

    /**
     * Метод, расчитывающий налог
     * //TODO расписать коротко как считает
     *
     * @param prices - входной массив ценников
     * @return - посчитанный налог
     */
    public static Double calculateTax(String[] prices) {


        Prices.initPrices();
        //TODO implement

        return Prices.summ;

    }
}