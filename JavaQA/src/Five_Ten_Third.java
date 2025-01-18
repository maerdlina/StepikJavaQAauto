// 5.10.3

import java.lang.*;
import java.util.Scanner;

public class Five_Ten_Third {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner scan = new Scanner(System.in);
        int x1 = scan.nextInt();
        int y1 = scan.nextInt();
        int x2 = scan.nextInt();
        int y2 = scan.nextInt();
        int x3 = scan.nextInt();
        int y3 = scan.nextInt();

        Triangle t = new Triangle(new Point(x1, y1), new Point(x2, y2), new Point(x3, y3));
        if(!t.yes()){
            System.out.println("Треугольник не существует");
        } else System.out.println(t.area());
    }
}

class Triangle {
    Point a, b, c;

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public boolean yes(){
        double ar = area();
        return ar > 0;
    }

    public double area() {
        // Используем формулу Герона для вычисления площади треугольника
        double A = Math.sqrt((a.getX() - b.getX()) * (a.getX() - b.getX()) + (a.getY() - b.getY()) * (a.getY() - b.getY()));
        double B = Math.sqrt((b.getX() - c.getX()) * (b.getX() - c.getX()) + (b.getY() - c.getY()) * (b.getY() - c.getY()));
        double C = Math.sqrt((a.getX() - c.getX()) * (a.getX() - c.getX()) + (a.getY() - c.getY()) * (a.getY() - c.getY()));

        double s = (A + B + C) / 2; // Полупериметр
        return Math.sqrt(s * (s - A) * (s - B) * (s - C)); // Площадь по формуле Герона
    }
}

class Point {
    private double x;
    private double y;

    public Point(final double x, final double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}