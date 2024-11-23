import java.util.Scanner;

////Question 01
//public class Main {
//    public static void main(String[] args) {
//        int count = 0;
//        for (int i = 10;i <= 49;i++){
//            System.out.print(i+" ");
//            count++;
//            if(count==10){
//                System.out.println();
//                count = 0;
//            }
//        }
//        }
//}
//Question 02
//import java.util.*;
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int number;
//        do {
//            System.out.print("Please Enter your number-:");
//            number = sc.nextInt();
//            if(number>=0){
//                int countValue = countingdigit(number);
//                System.out.println("Number of digits is "+countValue);
//            }
//        }while (number>=0);
//        System.out.println("Ending the number entered");
//    }
//    public static int countingdigit(int number){
//        int count=0;
//        if(number == 0){
//            return 1;
//        }
//        number = Math.abs(number);
//        while (number > 0){
//            number = number / 10;
//            count++;
//        }
//        return count;
//    }
//}
//Question 03
//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter the row you need to create-: ");
//        int rows = scanner.nextInt();
//        for (int i = 1; i <= rows; i++) {
//            for (int j = 1; j <= rows - i; j++) {
//                System.out.print(" ");
//            }
//            for (int k = 1; k <= 2 * i - 1; k++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        scanner.close();
//    }
//}
//Question 04
import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int[] numbers = new int[5];
//        System.out.println("Enter 5 numbers: ");
//        for (int i = 0; i < 5; i++) {
//            System.out.print("Enter number " + (i + 1) + ": ");
//            numbers[i] = sc.nextInt();
//        }
//        sc.close();
//        int lasgestNumber = Integer.MIN_VALUE;
//        int secondLargestNumber = Integer.MIN_VALUE;
//        for(int number: numbers){
//            if(number > lasgestNumber){
//                lasgestNumber = number;
//            }
//        }
//        for(int number: numbers){
//            if(number > secondLargestNumber && number < lasgestNumber){
//                secondLargestNumber = number;
//            }
//        }
//        if(secondLargestNumber == Integer.MIN_VALUE){
//            System.out.println("No second largest number");
//        }else {
//            System.out.println("Second largest number: " + secondLargestNumber);
//        }
//    }
//}
//Question 05
import java.util.Scanner;
//import java.util.StringTokenizer;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter a sentence to check if it's a palindrome:");
//        String sentence = scanner.nextLine();
//        if (isPalindrome(sentence)) {
//            System.out.println("The sentence is a palindrome!");
//        } else {
//            System.out.println("The sentence is not a palindrome.");
//        }
//        scanner.close();
//    }
//    public static boolean isPalindrome(String sentence) {
//        sentence = sentence.toLowerCase();
//        String cleanSentence = sentence.replaceAll("[^a-zA-Z]", "");
//        int start = 0;
//        int end = cleanSentence.length() - 1;
//        while (start < end) {
//            if (cleanSentence.charAt(start) != cleanSentence.charAt(end)) {
//                return false;
//            }
//            start++;
//            end--;
//        }
//        return true;
//    }
//    public static boolean isPalindromeWithTokenizer(String sentence) {
//        sentence = sentence.toLowerCase();
//        StringTokenizer tokenizer = new StringTokenizer(sentence, " ,.!?;:-'\"()");
//        StringBuilder cleanSentence = new StringBuilder();
//        while (tokenizer.hasMoreTokens()) {
//            cleanSentence.append(tokenizer.nextToken());
//        }
//        String finalString = cleanSentence.toString();
//        String reversedString = new StringBuilder(finalString).reverse().toString();
//        return finalString.equals(reversedString);
//    }
//}