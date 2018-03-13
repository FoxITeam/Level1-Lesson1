package ru.foxit.grayfox;

import java.lang.Boolean;
import java.util.Scanner;

// CTRL + ALT + L - row format.
// psvm - public static void
// inside "psvm" - sout - System.out
public class Main {


    // Допишу, как проснусь, пока тут будет 3 задания!
    public static void main(String[] args) {
        //lesson1();
        //lesson2();
        //lesson3();
    }

    public static void lesson1() {
        // CTRL + ALT + L - Комбинация для IntelliJ IDEA - Выровнять код по человечески.
        // psvm - публик статик войд Маин(Стринг аргс[]) {}
        // sout - систем.аут.принтлн();
        // 1. Создать пустой проект в IntelliJ IDEA и прописать метод main();
        System.out.println("Hello! GrayFox left a mark in the history of java!");
    }

    public static void lesson2() {
        // Приучаемся писать код в следующем виде:
        // byteFox - первое слово в маленьком регистре, второе слово с заглавной буквы.
        // Исключаем переменные с 1 буквов (инициализация int a = 0;), чтобы код был читабелен для других.
        // 2. Создать переменные всех пройденных типов данных, и инициализировать их значения;
        byte byteFox = 127;
        short shortFox = 5000;
        int intFox = 20;
        long longFox = 1111;
        float floatFox = 30.0F;
        boolean booFox = true;
        double dooFox = 5.5;
        char charFox = '\t';
        char charFox2 = 2;

        System.out.println("Минимальное значение Byte" + Byte.MIN_VALUE);
        System.out.println("Максимальное значение Byte" + Byte.MAX_VALUE);
        System.out.println("Мое значение Byte" + byteFox);

        System.out.println("Минимальное значение Short" + Short.MIN_VALUE);
        System.out.println("Максимальное значение Short" + Short.MAX_VALUE);
        System.out.println("Мое значение Short" + shortFox);

        System.out.println("Минимальное значение Integer" + Integer.MIN_VALUE);
        System.out.println("Максимальное значение Integer" + Integer.MAX_VALUE);
        System.out.println("Мое значение Integer" + intFox);

        System.out.println("Минимальное значение Long" + Long.MIN_VALUE);
        System.out.println("Максимальное значение Long" + Long.MAX_VALUE);
        System.out.println("Мое значение Long" + longFox);

        System.out.println("Минимальное значение Float" + Float.MIN_VALUE);
        System.out.println("Максимальное значение Float" + Float.MAX_VALUE);
        System.out.println("Мое значение Float" + floatFox);

        System.out.println("Boolean = " + Boolean.TRUE);
        System.out.println("Boolean = " + Boolean.FALSE);
        System.out.println("Мое значение Boolean = " + booFox);

        System.out.println("Минимальное значение Double" + Double.MIN_VALUE);
        System.out.println("Максимальное значение Double" + Double.MAX_VALUE);
        System.out.println("Мое значение Double" + dooFox);

        System.out.println("Минимальное значение Char " + (int) (Character.MIN_VALUE));
        System.out.println("Максимальное значение Char " + (int) (Character.MAX_VALUE));
        System.out.println("Мое значение Char " + (int) (charFox) + " " + (int) (charFox2));
    }

    public static void lesson3() {
        // 3. Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат, где a, b, c, d – входные параметры этого метода;

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите значение a: ");
        int expressionA = sc.nextInt();
        System.out.print("Введите значение b: ");
        int expressionB = sc.nextInt();
        System.out.print("Введите значение c: ");
        int expressionC = sc.nextInt();
        System.out.print("Введите значение d: ");
        int expressionD = sc.nextInt();
        int expressionE = expressionC / expressionD;
        int expressionK = expressionB + expressionE;
        int m = expressionA * expressionK;
        System.out.println("a = " + expressionA);
        System.out.println("b = " + expressionB);
        System.out.println("c = " + expressionC);
        System.out.println("d = " + expressionD);
        System.out.println("a * (b + (c / d)) ");
        System.out.println("Ваш ответ: " + m);
    }

}

