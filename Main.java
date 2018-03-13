package ru.foxit.grayfox;

import java.lang.Boolean;
import java.util.Scanner;

// CTRL + ALT + L - row format.
// psvm - public static void
// inside "psvm" - sout - System.out
public class Main {
    public static void main(String[] args) {
        //lesson1(); // 1 задание
        //lesson2(); // 2 задание
        //lesson3(); // 3 задание
        //lesson4(10, 6); // Без сканера
        //lesson4_2(); // Со сканером
        //lesson5(); // 1 вариант по больше
        //lesson5_2(); // 2 вариант упрощенный
        //lesson6(); // 6 задание
        //lesson7(); // 7 задание без проверки
        //lesson7_2(); // 7 задание с проверкой
    }

    ////////////////////////////////////////////////////////////////////
    public static void lesson1() {
        // CTRL + ALT + L - Комбинация для IntelliJ IDEA - Выровнять код по человечески.
        // psvm - публик статик войд Маин(Стринг аргс[]) {}
        // sout - систем.аут.принтлн();
        // TODO 1. Создать пустой проект в IntelliJ IDEA и прописать метод main();
        System.out.println("Hello! GrayFox left a mark in the history of java!");
    }

    ////////////////////////////////////////////////////////////////////
    public static void lesson2() {
        // Приучаемся писать код в следующем виде:
        // byteFox - первое слово в маленьком регистре, второе слово с заглавной буквы.
        // Исключаем переменные с 1 буквов (инициализация int a = 0;), чтобы код был читабелен для других.
        // TODO 2. Создать переменные всех пройденных типов данных, и инициализировать их значения;
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

    ////////////////////////////////////////////////////////////////////
    public static void lesson3() {
        // TODO 3. Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат, где a, b, c, d – входные параметры этого метода;
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

    ////////////////////////////////////////////////////////////////////
    public static void lesson4(int a, int b) {
        // Вариант без сканера. в Main lesson4(10, 6); - Изменяем цифры и получаем ответ true или false.
        // TODO 4. Написать метод, принимающий на вход два числа, и проверяющий что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false;
        int receiving = a + b;
        if (receiving >= 10 && receiving <= 20) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    ////////////////////////////////////////////////////////////////////
    public static void lesson4_2() {
        // Вариант со сканером.
        // TODO 4. Написать метод, принимающий на вход два числа, и проверяющий что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false;
        Scanner sc = new Scanner(System.in);
        decision(sc.nextInt(), sc.nextInt());
    }

    private static void decision(int a, int b) {
        int c = a + b;
        if (c >= 10 && c <= 20) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

    }

    ////////////////////////////////////////////////////////////////////
    public static void lesson5() {
        // Вариант 1
        // TODO 5. Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль положительное ли число передали, или отрицательное. Замечание: если передать ноль, то вывести "Введён 0".
        Scanner i = new Scanner(System.in);
        System.out.print("Введите число: ");
        int a = i.nextInt();
        if (a > 0) {
            System.out.println("Положительное число");
        } else if (a == 0) {
            System.out.println("Введён 0");
        } else {
            System.out.println("Отрицательное число");
        }
    }

    ////////////////////////////////////////////////////////////////////
    public static void lesson5_2() {
        // Вариант 2
        // TODO 5. Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль положительное ли число передали, или отрицательное. Замечание: если передать ноль, то вывести "Введён 0".
        Scanner i = new Scanner(System.in);
        System.out.print("Введите число: ");
        int a = i.nextInt();
        if (a > 0) System.out.println("Положительное число");
        else {
            if (a == 0) System.out.println("Введён 0");
            else System.out.println("Отрицательное число");
        }
    }

    ////////////////////////////////////////////////////////////////////
    public static void lesson6() {
        // TODO 6. Написать метод, которому в качестве параметра передается целое число, метод должен вернуть true, если число отрицательное;
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число: ");
        int a = sc.nextInt();
        if (a > -1) {
            System.out.println("false");
        } else {
            System.out.println("true");
        }
    }

    ////////////////////////////////////////////////////////////////////
    public static void lesson7() {
        // Простой вариант без проверки.
        // TODO 7. Написать метод, которому в качестве параметра передается строка, обозначающая имя, метод должен вывести в консоль сообщение «Привет, указанное_имя!»;
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите свое имя: ");
        String name = sc.nextLine();
        System.out.println("Привет, " + name + "!");
    }


    public static void lesson7_2() {
        // Если введешь цифры в место имени, тебе программа скажет, "Вы ввели цифры! Зачем? Введите свое Имя!"
        // Кстати странно, он проверяет только цифры от 0 до 9, с 10 уже пишет цифры =)
        // TODO 7. Написать метод, которому в качестве параметра передается строка, обозначающая имя, метод должен вывести в консоль сообщение «Привет, указанное_имя!»;
        String name;
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите свое имя: ");
        name = sc.nextLine();

        if (name.matches("\\d")) {
            System.out.println("Вы ввели цифры! Зачем? Введите свое Имя!");
        } else {
            System.out.println("Привет, " + name + "!");
        }
    }
}


