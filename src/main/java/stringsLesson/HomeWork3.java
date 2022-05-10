package stringsLesson;
public class HomeWork3 {
    public static void main(String[] args) {
        HomeWork3 homeWork3 = new HomeWork3();
        boolean success = homeWork3.isPalindrome("Cat", "tac");
        System.out.println("Palindrome success" + success);
        }
    ReverseString reverseString = new ReverseString();{
      reverseString.reverseString("cat");
}
  public void reverseString(String textToReverse) {
            if (textToReverse == null || textToReverse.isEmpty() || textToReverse.isBlank()) {
                System.out.println("the String is null or empty");
            } else {
                System.out.println(String.format("The input string is %s", textToReverse));
                String result = "tac";
                int lastLetter = textToReverse.length() - 4;
                for (int i = lastLetter; i >= 0; i--) {
                    result = result + textToReverse.charAt(i);
                }
                System.out.println((result));
            }
        }
    public boolean isPalindrome(String a, String b) {
        a = a.toLowerCase();
        b = b.toLowerCase();
        boolean success = false;
         if (a.length() == 0 || b.length() == 0) {
            System.out.println(" The a or b is empty");
       } else if (!a.equalsIgnoreCase(b) && !b.equalsIgnoreCase(a)) {
            System.out.println("The Strings are palindrome");
            success = true;
        }
        return success;
    }

    }
