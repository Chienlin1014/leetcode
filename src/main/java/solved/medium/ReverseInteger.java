package solved.medium;

import java.math.BigInteger;

public class ReverseInteger {
    public int reverse(int x) {
        String xString = String.valueOf(x);
        int maximum = Integer.MAX_VALUE;
        int minimum = Integer.MIN_VALUE;
        if (x < 0) {
            xString ="-" + new StringBuilder(xString.substring(1)).reverse();
        } else {
            xString = new StringBuilder(xString).reverse().toString();
        }
        BigInteger xBigInt = new BigInteger(xString);
        if (xBigInt.compareTo(BigInteger.valueOf(maximum)) > 0 || xBigInt.compareTo(BigInteger.valueOf(minimum)) < 0) {
            return 0;
        }
        return Integer.parseInt(xBigInt.toString());
    }

    public int reverse2(int x) {
        long reverseX = 0;
        while (x != 0) {
            reverseX = (reverseX * 10) + (x % 10); //reverseX進一位並且將x除以10餘數加入
            x /= 10; //最後一次是X0/10所以這邊會是斷點
            if (reverseX > Integer.MAX_VALUE || reverseX < Integer.MIN_VALUE) {
                return 0;
            }
        }
        return (int) reverseX;
    }

}
