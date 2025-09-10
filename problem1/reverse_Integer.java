class Solution {
    public int reverse(int x) {
        if (x == 0) return 0;

        String b = Integer.toString(x);
        x = Math.abs(x);
        String res = "";

        while (x != 0) {
            int digit = x % 10;
            res += digit;
            x /= 10;
        }
        try {
            int a = Integer.parseInt(res);
            return (b.charAt(0) != '-') ? a : -a;
        } catch (NumberFormatException e) {
            return 0; 
        }
    }
}
