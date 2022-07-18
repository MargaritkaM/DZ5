package ru.netology.sqr;

public class SQRService {

    int s;

    public int calcAmountSgr(int min, int max) {
        for (int i = 10; i <= 99; i++) {
            if (i * i >= min && i * i <= max) {
                s = s + 1;
            }
        }
        return s;

    }
}
