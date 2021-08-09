package ru.netology.stats;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class StatsServiceTest {

    @Test
    public void shouldSumTotalSales() {
        int[] data = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        int actual = service.sumTotalSales(data);
        assertEquals(180, actual);
    }

    @Test
    public void shouldAverageSumMonth() {
        int[] data = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        int actual = service.averageSumMonth(data);
        assertEquals(15, actual);
    }

    @Test
    public void shouldMinSales() {
        int[] data = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        int actual = service.minSales(data);
        assertEquals(9, actual);
    }

    @Test
    public void shouldMaxSales() {
        int[] data = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        int actual = service.maxSumSales(data);
        assertEquals(8, actual);
    }

    @Test
    public void shouldSalesOverAverage() {
        int[] data = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        int actual = service.salesOverAverage(data);
        int expected = 5;
        assertEquals(expected, actual);

    }

    @Test
    public void shouldSalesAnderAverage() {
        int[] data = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        int actual = service.salesAnderAverage(data);
        int expected = 5;
        assertEquals(expected, actual);

    }
}



