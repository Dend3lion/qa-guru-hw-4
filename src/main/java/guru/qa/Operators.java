package guru.qa;

public class Operators {
    public static void main(String[] args) {
        // Арифметические операторы
        int a = 15;
        int b = 30;
        int c = 35;
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("b / a = " + (b / a));
        System.out.println("c % a = " + (c % a));
        System.out.println("a++   = " + (a++));
        System.out.println("a++   = " + (++a));
        System.out.println("b--   = " + (b--));

        // Операторы сравнения
        System.out.println("a == b = " + (a == b));
        System.out.println("a != b = " + (a != b));
        System.out.println("a > b = " + (a > b));
        System.out.println("a <= b = " + (a <= b));

        // Логические операторы
        boolean d = true;
        boolean e = false;

        System.out.println("d && e = " + (d && e));
        System.out.println("d || e = " + (d || e));
        System.out.println("!(d && e) = " + !(d && e));

        // Переполнение
        int f = Integer.MAX_VALUE;
        System.out.println("maximum Integer = " + f);
        System.out.println("Integer overflow " + (f + 1));

        // Комбинация типов
        int g = 10;
        double h = 1.23;
        System.out.println("int + double = " + (g + h));
        System.out.println("int / double = " + (g / h));
    }
}
