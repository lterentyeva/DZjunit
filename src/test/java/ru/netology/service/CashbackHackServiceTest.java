package ru.netology.service;

import org.testng.Assert;

import static org.testng.Assert.*;
import static org.testng.annotations.Test.*;

public class CashbackHackServiceTest {

    @org.testng.annotations.Test

    public void shouldCountIfUnderBoundary() {

        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(300);
        int expected = 700;

        Assert.assertEquals(actual, expected);
    }

    @org.testng.annotations.Test

    public void shouldCountIfOverBoundary() {

        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(3800);
        int expected = 200;

        Assert.assertEquals(actual, expected);
    }

    @org.testng.annotations.Test

    public void shouldCountByBoundary() {

        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(1000);
        int expected = 0;

        Assert.assertEquals(actual, expected);
    }

}