package net.zhouhang.algorithm;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HanoiTest {

    @Test
    void solution1() {
        Hanoi hanoi = new Hanoi();
        hanoi.solution1("left", "right", "mid", 4);
    }

    @Test
    void solutionHaveToUseMid() {
        Hanoi hanoi = new Hanoi();
        hanoi.solutionHaveToUseMid("left", "right", "mid", 2);
    }
}