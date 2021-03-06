package ru.netology.stats;

public class StatsService {

    public int sumTotalSales(int[] stats) {

        int sum = 0;
        for (int month : stats) {
            sum += month;
        }
        return sum;

    }

    public int averageSumMonth(int[] stats) {
        int sum = sumTotalSales(stats);
        int result = sum / stats.length;
        return result;
    }

    public int minSales(int[] sales) {

        int minMonth = 0;
        int month = 0;
        for (int sale : sales) {

            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int maxSumSales(int[] sales) {

        int maxMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;

        }

        return maxMonth + 1;

    }

    public int salesOverAverage(int[] data) {

        int avg = averageSumMonth(data);
        int monthCount = 0;
        for (int datum : data) {
            if (datum > avg) {
                monthCount++;
            }

        }
        return monthCount;
    }
    public int salesAnderAverage(int[] data) {

        int avg = averageSumMonth(data);
        int monthCount = 0;
        for (int datum : data) {
            if (datum < avg) {
                monthCount++;
            }

        }
        return monthCount;
    }

}








