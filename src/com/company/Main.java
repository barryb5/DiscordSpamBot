package com.company;

import java.awt.*;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.awt.event.KeyEvent;
import java.util.Scanner.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Robot robot = new Robot();

        Scanner scanner = new Scanner(System.in);

        String inputString = scanner.nextLine();

        TimeUnit.SECONDS.sleep(3);

        int[] printValues = convertStringToASCII(inputString);

        for (int i = 0; i < 1000000; i++) {
            for (int j = 0; j < printValues.length; j++) {
                robot.keyPress(printValues[j]);
                robot.keyRelease(printValues[j]);
            }
            TimeUnit.MILLISECONDS.sleep(5);

            robot.keyPress(10);
            robot.keyRelease(10);

            TimeUnit.SECONDS.sleep(1);
        }
    }

    public static int[] convertStringToASCII(String string) {

        char[] stringChars = string.toCharArray();
        int[] returnValues = new int[string.length()];

        for (int i = 0; i < string.length(); i++) {
            returnValues[i] = stringChars[i] - 32;
            if (Character.isUpperCase(stringChars[i])) {
                returnValues[i] = returnValues[i] + 64;
            }

            if (stringChars[i] == ' ') {
                returnValues[i] = 32;
            }
        }

        return returnValues;
    }
}
