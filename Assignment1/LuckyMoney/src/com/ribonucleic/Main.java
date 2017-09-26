package com.ribonucleic;

import java.math.BigDecimal;
import java.util.Random;
import java.util.Scanner;

class LuckyMoney {
    BigDecimal _money;
    int _num;

    public LuckyMoney(BigDecimal money, int num) {
        _money = money;
        _num = num;
    }

    public BigDecimal getLuckyMoney() {
        if(_num <= 1) return _money;
        Random r = new Random();
        double min = 0.01;
        double max = 2 * _money.doubleValue() / _num;
        double money_d = r.nextDouble() * max;
        money_d = money_d <= min ? min : money_d;
        money_d = Math.floor(money_d * 100) / 100;
        BigDecimal money = new BigDecimal(money_d);
        _num--;
        _money = _money.subtract(money);
        return money;
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("请输入红包总金额：");
        Double money_d = s.nextDouble();
        System.out.print("请输入红包数：");
        int num = s.nextInt();
        if(money_d <= 0 || num <= 0) {
            System.out.println("红包总金额和红包数必须为正数！");
            System.exit(1);
        }
        BigDecimal money = new BigDecimal(money_d);
        LuckyMoney lm = new LuckyMoney(money, num);
        System.out.println("产生" + num + "个红包如下：");
        for(int i = 0; i < num; i++)
            System.out.println(lm.getLuckyMoney().setScale(2, BigDecimal.ROUND_HALF_UP));
    }
}
