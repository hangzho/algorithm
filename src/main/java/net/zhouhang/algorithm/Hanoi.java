package net.zhouhang.algorithm;

public class Hanoi {
    public void solution1(String from, String to, String temp, int number) {
        if (number == 1) {
            System.out.println("1: From " + from + " to " + to);
        } else {
            solution1(from, temp, to, number - 1);
            System.out.println(number + ": From " + from + " to " + to);
            solution1(temp, to, from, number - 1);
        }
    }

    public void solutionHaveToUseMid(String from, String to, String temp, int number) {
        if (number == 1) {
            System.out.println("1: From " + from + " to " + temp);
            System.out.println("1: From " + temp + " to " + to);
        } else {
            // assume from is left, to is right, temp is mid:
            solution1(from, temp, to, number - 1); // 1 ~ N -1 from left to mid
            solution1(temp, to, from, number - 1); // 1 ~ N -1 from mid to right
            System.out.println(number + ": From " + from + " to " + temp);
            solution1(to, temp, from, number - 1); // 1 ~ N -1 from right to mid
            solution1(temp, from, to, number - 1); // 1 ~ N -1 from mid to left
            System.out.println(number + ": From " + temp + " to " + to);
            solution1(from, temp, to, number - 1); // 1 ~ N -1 from left to mid
            solution1(temp, to, from, number - 1); // 1 ~ N -1 from mid to right
        }
    }
}
