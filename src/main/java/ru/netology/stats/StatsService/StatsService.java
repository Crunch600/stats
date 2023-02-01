package ru.netology.stats.StatsService;

public class StatsService {

    public int sumSales(long[] sales) {

        int sum = 0;
        for (long i : sales) {
            sum += i;
        }
        //System.out.println(sum);
        return sum;
    }

    public int averSales(long[] sales) {
        int sum = sumSales(sales);
        int averageSales = sum / sales.length;
        return averageSales;

    }

    public int maxSalesMonth(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int minSalesMonth(long[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    public int numMonthWithLessThanAverSales(long[] sales) {
        int averageSales = averSales(sales);

        int sumMonthMin = 0;
        for (long sale : sales) {
            if (sale < averageSales) {
                sumMonthMin++;
            }
        }
        return sumMonthMin;
    }

    public int numMonthWithMoreThanAverSales(long[] sales) {
        int averageSales = averSales(sales);
        int sumMonthMax = 0;
        for (long sale : sales) {
            if (sale > averageSales) {
                sumMonthMax++;
            }
        }
        return sumMonthMax;
    }

}
