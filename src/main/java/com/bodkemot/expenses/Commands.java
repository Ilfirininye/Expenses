package com.bodkemot.expenses;

import java.util.*;

public class Commands {
    private List<Expense> expenses = new ArrayList<>();

    Scanner scanner = new Scanner(System.in);

    public void addExpenses() {
        System.out.println("Insert value of expense:");
        double valueInput = Double.valueOf(scanner.nextLine());

        System.out.println("Insert category of expense:");
        String categoryInput = scanner.nextLine();

        System.out.println("Insert month of expense [1-12]:");
        int monthInput = Integer.valueOf(scanner.nextLine());

        Expense expense = new Expense(valueInput, categoryInput, monthInput);

        expenses.add(expense);
    }

    public void displayExpenses() {
        for (Expense expense : expenses) {
            expense.displayExpenseDetails();
        }
    }

    public void displayCategories() {
        Set<String> categories = new HashSet<>();

        for (Expense expense : expenses) {
            categories.add(expense.getCategory());
        }
        for (String category : categories) {
            System.out.println(category);
        }
    }

    public void displayExpensesByMonth() {
        System.out.println("Insert month [1-12]:");
        int monthChoice = scanner.nextInt();

        System.out.println("Expenses for month " + monthChoice + ":");
        System.out.println();
        for (Expense expense : expenses) {
            if (expense.getMonth() == monthChoice) {
                expense.displayExpenseDetailsWithoutMonth();
            }
        }
    }

    public void displayExpensesByCategory() {
        System.out.println("Insert category:");
        String categoryChoice = scanner.next();

        System.out.println("Expenses for category " + categoryChoice + ":");
        System.out.println();
        for (Expense expense : expenses) {
            if (expense.getCategory().equals(categoryChoice)) {
                expense.displayExpenseDetailsWithoutCategory();
            }
        }
    }

    public void displaySumOfExpensesByMonth() {
        System.out.println("Insert month [1-12]:");
        int monthChoice = scanner.nextInt();
        List<Double> monthValues = new ArrayList<>();

        System.out.println("Sum of expenses for month " + monthChoice + ":");
        for (Expense expense : expenses) {
            if (expense.getMonth() == (monthChoice)) {
                monthValues.add(expense.getValue());
            }
        }
        double sum = 0;
        for (double i : monthValues) {
            sum = sum + i;
        }
        System.out.println(sum);
    }
}
