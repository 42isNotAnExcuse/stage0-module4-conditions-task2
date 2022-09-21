package school.mjc.stage0.conditions.task2;

import jdk.jshell.spi.ExecutionControl;

public class GreatestNumberPrinter {
    public void printGreatest(int first, int second) {
        System.out.println(first >= second ? first : second);
    }
}
