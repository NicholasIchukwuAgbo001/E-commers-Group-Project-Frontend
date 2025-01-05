public class Main {

    // Function to check if all characters in the string are numbers
    public static boolean isNumber(String s) {
        // Loop through each character in the string
        for (int i = 0; i < s.length(); i++) {
            // Check if the current character is not a number
            if (s.charAt(i) < '0' || s.charAt(i) > '9') {
                return false; // If it's not a number, return false
            }
        }
        return true; // If all characters are numbers, return true
    }

    public static void main(String[] args) {
        // Test the function with different strings
        System.out.println(isNumber("12345"));  // Should return true
        System.out.println(isNumber("123a5"));  // Should return false
        System.out.println(isNumber("98765"));  // Should return true
        System.out.println(isNumber("hello"));  // Should return false
    }
}
