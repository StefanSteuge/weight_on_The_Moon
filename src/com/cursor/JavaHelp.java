package com.cursor;

import java.util.Scanner;

public class JavaHelp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String choice;
        System.out.println("Help :");
        System.out.println("    1. if");
        System.out.println("    2. switch");
        System.out.println("Your choice: ");
        choice = scanner.nextLine();

        System.out.println("\n");

        switch (choice) {
            case "1":
                System.out.println("(if) expression: \n");
                System.out.println("if(умова) інструкція;");
                System.out.println("else інструкція");
                break;
            case "2":
                System.out.println("(switch) expression: \n");
                System.out.println("switch(вираз) {");
                System.out.println("    case константа:");
                System.out.println("    послідовність інструкцій");
                System.out.println("    break;");
                System.out.println("// ...");
                System.out.println("}");
                break;
            default:
                System.out.println("Unknown query");

        }
    }
}
