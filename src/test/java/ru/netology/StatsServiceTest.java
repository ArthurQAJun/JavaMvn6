package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StatsServiceTest {
    long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @Test
    public void testAmount() {
        StatsService service = new StatsService();
        long actual = service.amount(sales);
        long expected = 8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18;

        assertEquals(expected, actual);

    }

    @Test

    public void testAverageAmount() {
        StatsService service = new StatsService();
        long actual = service.averageAmount(sales);
        long expected = (8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18) / 12;

        assertEquals(expected, actual);

    }

    @Test

    public void testMaxSales() {
        StatsService service = new StatsService();
        long actual = service.maxMonthSales(sales);
        long expected = 8;

        assertEquals(expected, actual);
    }

    @Test

    public void testMinSales() {
        StatsService service = new StatsService();
        long actual = service.minMonthSales(sales);
        long expected = 9;

        assertEquals(expected, actual);
    }

    @Test

    public void testUnderAverageSales() {
        StatsService service = new StatsService();
        long actual = service.underAverage(sales);
        long expected = 5;

        assertEquals(expected, actual);
    }

    @Test

    public void testUpperAverageSales() {
        StatsService service = new StatsService();
        long actual = service.upperAverage(sales);
        long expected = 5;

        assertEquals(expected, actual);
    }
}
