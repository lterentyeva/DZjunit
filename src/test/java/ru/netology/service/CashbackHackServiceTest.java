package ru.netology.service;

import org.junit.Assert;


public class CashbackHackServiceTest {

    @org.junit.Test

    public void shouldCountIfUnderBoundary() {

        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(300);
        int expected = 700;

        Assert.assertEquals(actual, expected);
    }

    @org.junit.Test

    public void shouldCountIfOverBoundary() {

        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(3800);
        int expected = 200;

        Assert.assertEquals(actual, expected);
    }

    @org.junit.Test

    public void shouldCountByBoundary() {

        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(1000);
        int expected = 0;

        Assert.assertEquals(actual, expected);
    }

}