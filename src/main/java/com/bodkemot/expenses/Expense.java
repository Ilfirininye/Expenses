package com.bodkemot.expenses;

public class Expense {
    private double value;
    private String category;
    private int month;

    public Expense(double value, String category, int month) {
        this.value = value;
        this.category = category;
        this.month = month;
    }

    public double getValue() {
        return value;
    }

    public String getCategory() {
        return category;
    }

    public int getMonth() {
        return month;
    }

    public void displayExpenseDetails() {
        System.out.println("Value: " + value);
        System.out.println("Category: " + category);
        System.out.println("Month: " + month);
        System.out.println();
    }

    public void displayExpenseDetailsWithoutMonth() {
        System.out.println("Value: " + value);
        System.out.println("Category: " + category);
        System.out.println();
    }

    public void displayExpenseDetailsWithoutCategory() {
        System.out.println("Value: " + value);
        System.out.println("Month: " + month);
        System.out.println();
    }

}