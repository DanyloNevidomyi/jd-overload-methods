package learning.java;

public class Calculator {
    // Перевантажений метод додавання для двох цілих чисел
    public int add(int a, int b) {
        return a + b;
    }

    // Перевантажений метод додавання для трьох цілих чисел
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Перевантажений метод додавання для двох чисел з плаваючою точкою
    public double add(double a, double b) {
        return a + b;
    }

    // Обчислення площі прямокутника
    public int calculateArea(int length, int width) {
        return length * width;
    }

    // Обчислення площі кола
    public double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }
}
