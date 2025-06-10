// Problem: Check if a number is a palindrome
// Approach: Reverse the number and compare with original
// Time: O(log₁₀n), Space: O(1)
public class PalindromeCheck {
    public static boolean isPalindrome(int num) {
        int original = num, reversed = 0;
        while (num > 0) {
            reversed = reversed * 10 + num % 10;
            num /= 10;
        }
        return original == reversed;
    }
}
