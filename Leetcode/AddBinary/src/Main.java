import java.io.*;

class Solution {
    public String addBinary(String a, String b) {
        int result = Integer.parseInt(a) + Integer.parseInt(b);
        return Integer.toBinaryString(result);
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(Integer.parseInt("10", 2));
    }
}