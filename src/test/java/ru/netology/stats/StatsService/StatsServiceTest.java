package ru.netology.stats.StatsService;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

   @Test

    public void sumMonthSales() {
        StatsService service = new StatsService();

        int expected = 180;
        long actual = service.sumSales(sales);
        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void averageSales() {
        StatsService service = new StatsService();

        int expected = 15;
        long actual = service.averSales(sales);
        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void shouldMaxMonthSales() {
        StatsService service = new StatsService();

        int expected = 8;
        long actual = service.maxSalesMonth(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldMinMonthSales() {
        StatsService service = new StatsService();

        int expectedMonth = 9;
        long actual = service.minSalesMonth(sales);
        Assertions.assertEquals(expectedMonth, actual);

    }

    @Test

    public void shouldCoundMinMonth() {
        StatsService service = new StatsService();

        int expected = 5;
        long actual = service.numMonthWithLessThanAverSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldCoundMaxMonth() {
        StatsService service = new StatsService();

        int expected = 5;
        long actual = service.numMonthWithMoreThanAverSales(sales);
        Assertions.assertEquals(expected, actual);
    }

}
