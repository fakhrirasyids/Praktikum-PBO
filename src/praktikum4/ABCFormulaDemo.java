package praktikum4;

import java.util.Scanner;
import static java.lang.Math.sqrt;

public class ABCFormulaDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("==========================");

            double a;
            double b;
            double c;

            System.out.println("Nilai a : ");
            a = scanner.nextDouble();
            System.out.println("Nilai b : ");
            b = scanner.nextDouble();
            System.out.println("Nilai c : ");
            c = scanner.nextDouble();

            ABCFormula abcFormula = new ABCFormula(a, b, c);
            abcFormula.printResult();

            System.out.print("\n Input data lagi [Y/T] ? : ");
            String choice = scanner.next();

            if (!choice.equalsIgnoreCase("y")) {
                break;
            }
        }
    }
}

class ABCFormula {
    private double a, b, c;

    ABCFormula(Double a, Double b, Double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    private double determinant(double a, double b, double c) {
        return (b * b) - (4 * (a * c));
    }

    private double xOne(double b, double d, double a) {
        if (d > 0) {
            return ((b * -1) + sqrt(d)) / (2 * a);
        } else {
            return ((b * -1) / (2 * a)) + ((sqrt((d * -1)) / (2 * a)));
        }
    }

    private double xTwo(double b, double d, double a) {
        if (d > 0) {
            return ((b * -1) - sqrt(d)) / (2 * a);
        } else {
            return ((b * -1) / (2 * a)) - ((sqrt((d * -1)) / (2 * a)));
        }
    }

    private double xDefault(double b, double a) {
        return (b * -1) / (2 * a);
    }

    void printResult() {
        double det = determinant(this.a, this.b, this.c);
        System.out.println("a : " + this.a);
        System.out.println("b : " + this.b);
        System.out.println("c : " + this.c);
        System.out.println("D : " + det);

        if (det != 0) {
            System.out.println("x1 : " + xOne(this.b, det, this.a));
            System.out.println("x2 : " + xTwo(this.b, det, this.a));
        } else {
            double xDefault = xDefault(this.b, this.a);
            System.out.println("x1 : " + xDefault);
            System.out.println("x2 : " + xDefault);
        }
    }
}