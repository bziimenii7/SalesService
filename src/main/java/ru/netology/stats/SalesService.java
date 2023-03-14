package ru.netology.stats;
public class SalesService {

    public long getSumSales(long[] sales) {
        long sumSales = 0;
        for (long i : sales) {
                sumSales += i;
            }
        return sumSales;
        }

    public long getAverageSumSales(long[] sales) {
        long averageSumSales = 0;
        if (sales.length > 0) {
            averageSumSales = getSumSales(sales) / sales.length;
        }
        return averageSumSales;
    }

    public int getMaxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth +1;
    }

    public int getMinSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int getMonthsSmallerAverageSales(long[] sales) {
        int count = 0;

        for (long sale : sales) {
            if (sale < getAverageSumSales(sales)) {
                count += 1;
            }
        }
        return count;
    }

    public int getMonthsBiggerAverageSales(long[] sales) {
        int count = 0;

        for (long sale : sales) {
            if (sale >= getAverageSumSales(sales)) {
                count += 1;
            }
        }
        return count;
    }

}
