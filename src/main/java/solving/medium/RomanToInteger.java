package solving.medium;


public class RomanToInteger {
    public int intToRoman(int num) {
        // 1-3999
        String roman = "";
        int divisor=1000;

        while (num != 0) {
            int romanInt = num / divisor;
            num = num % divisor;
            divisor /= 10;
        }
        return 0;
    }
}
