package ru.netology.stats;

public class StatsService {
    public long sum(long[] sales) {
        long totalSale = 0;
        for (long sale : sales) { // 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
            totalSale += sale;
        }
        return totalSale;
    }

    public long average(long[] sales) {
        // long totalSale = sum(sales);
        // long averageSale = totalSale / 12;
        // return sum(sales) / 12;
        return sum(sales) / sales.length;
    }

    public int maxMonth(long[] sales) {
        int maxMonthSale = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonthSale]) {
                maxMonthSale = i;
            }
        }
        return maxMonthSale + 1;
    }

    public int minMonth(long[] sales) {
        int maxMonthSale = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[maxMonthSale]) {
                maxMonthSale = i;
            }
        }
        return maxMonthSale + 1;
    }

    public int monthBellowAverage(long[] sales) {
        int counter = 0;
        long averageSale = average(sales);
        for (long sale : sales) {
            if (sale < averageSale) {
                counter++;
            }
        }
        return counter;
    }

    public int monthAboveAverage(long[] sales) {
        int counter = 0;
        long averageSale = average(sales);
        for (long sale : sales) {
            if (sale > averageSale) {
                counter++;
            }
        }
        return counter;
    }

}