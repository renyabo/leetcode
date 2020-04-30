package org.yabo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HappyNum_202 {

    public static boolean isHappy(int n) {
        if (n == 1) {
            return true;
        }
        Set<Integer> set = new HashSet<>();
        set.add(n);
        while (true) {
            int squareSum = getSquareSum(n);
            if (squareSum == 1) {
                return true;
            }
            if (set.contains(squareSum)) {
                return false;
            }
            set.add(squareSum);
            n = squareSum;
        }
    }

    private static int getSquareSum(int n) {
        List<Integer> split = split(n);
        int sum = 0;
        for (Integer integer : split) {
            sum += integer * integer;
        }
        return sum;
    }

    private static List<Integer> split(int n) {
        List<Integer> list = new ArrayList<>();
        while (n > 0) {
            list.add(n % 10);
            n /= 10;
        }
        return list;
    }

    public static void main(String[] args) {
//        System.out.println(isHappy(1));
//        System.out.println(isHappy(10));
//        System.out.println(isHappy(12));
//        System.out.println(isHappy(133));
        System.out.println(isHappy(19));
    }
}
