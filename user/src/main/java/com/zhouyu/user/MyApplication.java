package com.zhouyu.user;


import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.*;
import java.util.regex.Pattern;

//@SpringBootApplication
public class MyApplication {
    private static final Pattern equityExpiryMonPattern = Pattern.compile("(\\d+)([A-Z])(\\d+)");
    public static void main(String[] args) {

        BigDecimal a = BigDecimal.valueOf(2);
        BigDecimal b = BigDecimal.valueOf(1);
        System.out.println(a.divide(b,9, RoundingMode.HALF_UP).stripTrailingZeros());
//        BigDecimal bigDecimal = BigDecimal.valueOf(target);
//        System.out.println(bigDecimal.stripTrailingZeros().toPlainString());
//        System.out.println(Objects.equals(source, target));

//        String value = "123AAA456789BBBC";
//        Pattern pattern = Pattern.compile("[1-9]\\d{2}");
//        Matcher matcher = pattern.matcher(value);
    }
}
