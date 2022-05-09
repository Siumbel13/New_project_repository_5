package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SQRServiceTest {

    @Test
    public void test1() {
        SQRService service = new SQRService();

        int actual = service.squared(200, 300);
        int expected = 3;

        Assertions.assertEquals(actual, expected);

    }

    @Test
    public void test2() {
        SQRService service = new SQRService();

        int actual = service.squared(200, 500);
        int expected = 8;

        Assertions.assertEquals(actual, expected);

    }


}
