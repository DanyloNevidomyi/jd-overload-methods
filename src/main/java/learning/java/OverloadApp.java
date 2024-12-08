package learning.java;

public class OverloadApp {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        // Використання перевантаженого методу add
        System.out.println("Додавання двох чисел: " + calculator.add(5, 10));
        System.out.println("Додавання трьох чисел: " + calculator.add(5, 10, 15));
        System.out.println("Додавання чисел із плаваючою точкою: " + calculator.add(5.5, 10.3));

        // Використання перевантаженого методу calculateArea
        System.out.println("Площа прямокутника: " + calculator.calculateArea(5, 10));
        System.out.println("Площа кола: " + calculator.calculateArea(7.0));
    }
}
