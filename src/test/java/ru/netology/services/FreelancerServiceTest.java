package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FreelancerServiceTest {
    @Test
    public void countingMonthForRestCase1() {
        FreelancerService service = new FreelancerService();
        int income = 10000;
        int expenses = 3000;
        int threshold = 20000;
        int actual = service.calculate(income, expenses, threshold);
        int expected = 3;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void countingMonthForRestCase2() {
        FreelancerService service = new FreelancerService();
        int income = 100000;
        int expenses = 60000;
        int threshold = 150000;
        int actual = service.calculate(income, expenses, threshold);
        int expected = 2;
        Assertions.assertEquals(expected, actual);
    }

}