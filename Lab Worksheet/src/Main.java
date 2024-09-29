//*********************Lab worksheet 01********************

//Question 01

//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args){
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter a odd length character word-:");
//        String odd_word = scanner.nextLine();
//        if(odd_word.length() % 2 == 0){
//            System.out.println("This is even length.Please enter the odd length word");
//        }else {
//            int middlelength = odd_word.length() / 2;
//            System.out.println("middle character is: " + odd_word.charAt(middlelength));
//        }
//    }
//}

//Question 02

//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args){
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter your full name as firstname middlename lastname-:");
//        String fullname = scanner.nextLine();
//        String[] arrfullname = fullname.split(" ");
//
//        if(arrfullname.length == 3){
//            String firstname  = arrfullname[0];
//            String middlename = arrfullname[1];
//            String lastname = arrfullname[2];
//
//            char middlefirst = middlename.charAt(0);
//            String formatname = lastname + "," + firstname + " " + middlefirst + ".";
//
//            System.out.println(formatname);
//        }else {
//            System.out.println("This is not a correct format");
//        }
//    scanner.close();
//    }
//}


//Question 03

//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args){
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter the length in centimeters-:");
//        double centimeters = scanner.nextFloat();
//
//        double inches = centimeters / 2.54;
//        int feet = (int)inches / 12;
//        int restinches = (int)inches % 12;
//
//        System.out.printf("you entered centimeters = %d feet and %d inches", feet,restinches);
//    }
//}

//Question 04

//import javax.swing.*;
//public class Main {
//    public static void main(String[] args){
//        JFrame frame =new JFrame("My First Frame");
//        frame.setSize(300,200);
//        frame.setLocation(100,50);
//        frame.setVisible(true);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//    }
//}

//Question 05
//class Circle {
//    private double radius;
//
//    public Circle(double radius){
//        this.radius = radius;
//    }
//
//    public Circle() {
//        this(0.0);
//    }
//
//    public void setRadius(double radius) {
//        this.radius = radius;
//    }
//
//    public double computeArea() {
//        return Math.PI * radius * radius;
//    }
//
//    public double computeCircumference() {
//        return 2 * Math.PI * radius;
//    }
//}
//
//public class Main {
//    public static void main(String[] args){
//        double r1 = 10.0;
//        double r0 = 20.0;
//
//        Circle smallerCircle = new Circle(r1);
//        Circle largerCircle = new Circle(r0);
//
//        double innerArea = smallerCircle.computeArea();
//        double outerArea = largerCircle.computeArea();
//
//        double shadedArea = outerArea - innerArea;
//        System.out.println("Shaded Area-: " + shadedArea);
//
//    }
//}