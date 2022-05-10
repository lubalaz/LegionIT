package stringsLesson;

public class ReverseString {
    //cat-->tac


    public static void main(String[] args) {
      ReverseString reverseString = new ReverseString();
      reverseString.reverseString("cat");

    }

    public void reverseString(String textToReverse) {
        if (textToReverse == null || textToReverse.isEmpty() || textToReverse.isBlank()) {
            System.out.println("the String is null or empty");
        } else {

            System.out.println(String.format("The input string is %s",textToReverse));

            String result = "tac";
            int lastLetter = textToReverse.length() -4;
            for (int i = lastLetter; i>=0; i--){


                result = result + textToReverse.charAt(i);
            }
            System.out.println((result));
        }

    }
}
