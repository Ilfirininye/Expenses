package com.bodkemot.expenses;

import java.util.Scanner;

public class ExpensesApplication {
    public static void main(String[] args) {
        new ExpensesApplication().start();
    }

    private void start() {
        Scanner scanner = new Scanner(System.in);
        boolean applicationLoop = true;

        Commands command = new Commands();

        while (applicationLoop) {
            System.out.println("Choose option:");
            System.out.println("1. Add expenses");
            System.out.println("2. Show all expenses");
            System.out.println("3. Show expenses categories");
            System.out.println("4. Show expenses per selected month");
            System.out.println("5. Show expenses per selected category");
            System.out.println("6. Show sum of expenses in selected month");
            System.out.println("7. Quit");

            int userChoice = scanner.nextInt();

            switch (userChoice) {
                case 1 -> command.addExpenses();
                case 2 -> command.displayExpenses();
                case 3 -> command.displayCategories();
                case 4 -> command.displayExpensesByMonth();
                case 5 -> command.displayExpensesByCategory();
                case 6 -> command.displaySumOfExpensesByMonth();
                case 7 -> applicationLoop = false;
            }
        }
    }
}
