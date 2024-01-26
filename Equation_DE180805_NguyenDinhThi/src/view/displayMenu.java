
package view;

import java.util.Scanner;

public class displayMenu {
    private Scanner scanner;

    public displayMenu() {
        this.scanner = new Scanner(System.in);
    }

    public int displayMenuAndGetOption() {
        System.out.println("MENU");
        System.out.println("1. Calculate Superlative Equation");
        System.out.println("2. Calculate Quadratic Equation");
        System.out.println("3. Exit");
        System.out.print("Enter option: ");
        return scanner.nextInt();
    }}