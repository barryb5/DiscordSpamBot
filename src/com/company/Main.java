package com.company;

import java.awt.*;
import java.util.concurrent.TimeUnit;
import java.awt.event.KeyEvent;

public class Main {

    public static void main(String[] args) throws Exception {

        Robot robot = new Robot();
        int keyCode = 67;

        TimeUnit.SECONDS.sleep(3);

        for (int i = 0; i < 100000; i++) {
            for (int j = 0; j < 10; j++) {

                robot.keyPress(keyCode);
                robot.keyRelease(keyCode);

                TimeUnit.MILLISECONDS.sleep(10);

                robot.keyPress(10);
                robot.keyRelease(10);
            }
            TimeUnit.SECONDS.sleep(9);
        }
    }
}
