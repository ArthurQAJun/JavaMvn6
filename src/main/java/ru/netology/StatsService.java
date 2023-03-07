package ru.netology;

public class StatsService {
    public long amount(long[] sales) {
        long result = 0;
        for (long sale : sales) {
            result = result + sale;

        }
        return result;
    }

    public long averageAmount(long[] sales) {
        long result = amount(sales);
        return result / 12;
    }

    public int maxMonthSales(long[] sales) {
        int maxMonth = 0;
        long maximumSale = sales[maxMonth];
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= maximumSale) {
                maxMonth = i;
                maximumSale = sales[i];
            }

        }
        return maxMonth + 1;

    }

    public int minMonthSales(long[] sales) {
        int minMonth = 0;
        long minimumSale = sales[minMonth];
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= minimumSale) {
                minMonth = i;
                minimumSale = sales[i];
            }

        }
        return minMonth + 1;
    }

    public int underAverage(long[] sales) {
        int counter = 0;
        for (long sale : sales) {
            if (sale < averageAmount(sales)) {
                counter++;
            }
        }
        return counter;
    }

    public int upperAverage(long[] sales) {
        int counter = 0;
        for (long sale : sales) {
            if (sale > averageAmount(sales)) {
                counter++;
            }
        }
        return counter;
    }
}
