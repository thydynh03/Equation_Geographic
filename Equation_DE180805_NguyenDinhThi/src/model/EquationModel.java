package model;

import java.util.List;
import java.util.Scanner;

public class EquationModel {
    private List<Float> oddNumbers;
    private List<Float> evenNumbers;
    private List<Float> squareNumbers;

    Scanner sc = new Scanner(System.in);

    //check user input int
    public int checkInputIntLimit(int min, int max) {
        while (true) {
            try {
                int result = Integer.parseInt(sc.nextLine().trim());
                if (result < min || result > max) {
                    throw new NumberFormatException();

                }
                return result;
            } catch (NumberFormatException e) {
                System.err.println("Please input number in rage [" + min + ", " + max + "]");
                System.out.println("Enter again: ");
            }
        }
    }

    //check user input double
    public double checkInputDouble() {
        while (true) {
            try {
                double result = Double.parseDouble(sc.nextLine());
                return result;
            } catch (NumberFormatException e) {
                System.err.println("Must be input double");
                System.out.println("Enter again: ");
            }

        }
    }

    //check number is odd or not
    public boolean checkOdd(double n) {
        if (n % 2 == 1) {
            return true;
        } else {
            return false;
        }
    }

    //check number is even or not
    public boolean checkEven(double n) {
        if (n % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    //check number is squarenumber or not
    public boolean checkSquareNumber(double n) {
        if ((int) Math.sqrt(n) * (int) Math.sqrt(n) == n) {
            return true;
        } else {
            return false;
        }
    }
    public void calculateEquation() {
        System.out.println("Enter a: ");
        double a = checkInputDouble();
        System.out.println("Enter b: ");
        double b = checkInputDouble();
        double x = -b / a;
        System.out.println("x = " + x);
        System.out.println("Number is odd: ");
        if (checkOdd(a)) {
            System.out.println(a + " ");
        }
        if (checkOdd(b)) {
            System.out.println(b + " ");
        }
        if (checkOdd(x)) {
            System.out.println(x + " ");
        }
        System.out.println("Number is even: ");
        if (checkEven(a)) {
            System.out.println(a + " ");
        }
        if (checkEven(b)) {
            System.out.println(b + " ");
        }
        if (checkEven(x)) {
            System.out.println(x + " ");
        }
        System.out.println("Number is perfect square: ");
        if (checkSquareNumber(a)) {
            System.out.println(a + " " + "\n");
        }
        if (checkSquareNumber(b)) {
            System.out.println(b + " " + "\n");
        }
        if (checkSquareNumber(x)) {
            System.out.println(x + " " + "\n");
        }
    }

    public void calculateQuadraticEquation() {
        System.out.println("Enter A: ");
        double a = checkInputDouble();
        System.out.println("Enter B: ");
        double b = checkInputDouble();
        System.out.println("Enter C: ");
        double c = checkInputDouble();
        double d = b * b - 4 * a * c;
        double x1 = (-b + Math.sqrt(d)) / (2 * a);
        double x2 = (-b - Math.sqrt(d)) / (2 * a);
        System.out.println("Solution: x1 = " + x1 + " and x2 = " + x2);
        System.out.println("Number is odd: ");
        if (checkOdd(a)) {
            System.out.println(a + " ");
        }
        if (checkOdd(b)) {
            System.out.println(b + " ");
        }
        if (checkOdd(c)) {
            System.out.println(c + " ");
        }
        if (checkOdd(x1)) {
            System.out.println(x1 + " ");
        }
        if (checkOdd(x2)) {
            System.out.println(x2 + " ");
        }
        System.out.println();
        System.out.println("Number is even: ");
        if (checkEven(a)) {
            System.out.println(a + " ");
        }
        if (checkEven(b)) {
            System.out.println(b + " ");
        }
        if (checkEven(c)) {
            System.out.println(b + " ");
        }
        if (checkEven(x1)) {
            System.out.println(x1 + " ");
        }
        if (checkEven(x2)) {
            System.out.println(x1 + " ");
        }
        System.out.println();
        System.out.println("Number is perfect square: ");
        if (checkSquareNumber(a)) {
            System.out.println(a + " ");
        }
        if (checkSquareNumber(b)) {
            System.out.println(b + " ");
        }
        if (checkSquareNumber(c)) {
            System.out.println(c + " ");
        }
        if (checkSquareNumber(x1)) {
            System.out.println(x1 + " ");
        }
        if (checkSquareNumber(x2)) {
            System.out.println(x2 + " ");
        }
        System.out.println();
    }
    }
