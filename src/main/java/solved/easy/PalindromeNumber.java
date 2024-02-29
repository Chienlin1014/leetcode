package solved.easy;

public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        String xString = String.valueOf(x);
        return xString.contentEquals(new StringBuilder(xString).reverse());
    }
}
