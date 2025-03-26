package геометрия;

import java.util.Scanner;

public class Triangle {
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public double getPerimeter() {
        return sideA + sideB + sideC;
    }

    public double getArea() {
        double s = getPerimeter() / 2;
        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
    }

    public boolean isIsosceles() {
        return sideA == sideB || sideA == sideC || sideB == sideC;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите сторону A треугольника: ");
        double sideA = scanner.nextDouble();

        System.out.print("Введите сторону B треугольника: ");
        double sideB = scanner.nextDouble();

        System.out.print("Введите сторону C треугольника: ");
        double sideC = scanner.nextDouble();

        Triangle triangle = new Triangle(sideA, sideB, sideC);
        System.out.println("Периметр: " + triangle.getPerimeter());
        System.out.println("Площадь: " + triangle.getArea());
        System.out.println("Равнобедренный: " + triangle.isIsosceles());

        scanner.close();
    }
}