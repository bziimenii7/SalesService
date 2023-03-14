package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SalesServiceTest {
    @Test
    public void shouldSumSales() {
        SalesService service = new SalesService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedSumSales = 180;
        long actualSumSales = service.getSumSales(sales);

        Assertions.assertEquals(expectedSumSales, actualSumSales);
    }

    @Test
    public void shouldAverageSumSales() {
        SalesService service = new SalesService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedAverageSumSales = 15;
        long actualAverageSumSales = service.getAverageSumSales(sales);

        Assertions.assertEquals(expectedAverageSumSales, actualAverageSumSales);
    }

    @Test
    public void shouldMaxSales() {
        SalesService service = new SalesService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedMaxSales = 8;
        long actualMaxSales = service.getMaxSales(sales);

        Assertions.assertEquals(expectedMaxSales, actualMaxSales);
    }

    @Test
    public void shouldMinSales() {
        SalesService service = new SalesService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedMinSales = 9;
        long actualMinSales = service.getMinSales(sales);

        Assertions.assertEquals(expectedMinSales, actualMinSales);
    }

    @Test
    public void shouldMonthsSmallerAverageSales() {
        SalesService service = new SalesService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedMonthsSmallerAverageSales = 5;
        long actualMonthsSmallerAverageSales = service.getMonthsSmallerAverageSales(sales);

        Assertions.assertEquals(expectedMonthsSmallerAverageSales, actualMonthsSmallerAverageSales);
    }

    @Test
    public void shouldMonthsBiggerAverageSales() {
        SalesService service = new SalesService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedMonthsBiggerAverageSales = 7;
        long actualMonthsBiggerAverageSales = service.getMonthsBiggerAverageSales(sales);

        Assertions.assertEquals(expectedMonthsBiggerAverageSales, actualMonthsBiggerAverageSales);
    }

}
