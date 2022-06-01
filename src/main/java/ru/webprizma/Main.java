package ru.webprizma;

public class Main {

    public static void main(String[] args) {
        boolean testStarted = true;
        String testStatusOK = "Тест стартовал";
        String testStatusFail = "Тест не стартовал";
        String testStatusError = "Системная ошибка, проверьте код программы";

        if (testStarted) {
            System.out.println(testStatusOK);

            System.out.println("Блок: все типы данных и операторов");
            System.out.println("================");

            byte a = 64; // byte.max = -128
            byte b = 32; // byte.max = 127
            System.out.println("a = " + a);
            System.out.println("b = " + b);
            System.out.println("a + b = " + (a + b));
            System.out.println("================");

            short c = 15430; // short.max = -32768;
            short d = -1000; // short.max = 32767;
            System.out.println("c = " + c);
            System.out.println("d = " + d);
            System.out.println("c - d = " + (c - d));
            System.out.println("================");

            int e = 21474; // int.max = -2147483648;
            int f = 83647; // int.max = 2147483647;
            System.out.println("e = " + e);
            System.out.println("f = " + f);
            System.out.println("e * f = " + (e * f));
            System.out.println("================");

            long g = 3643747456345634L; // long.max = –9223372036854775808
            long h = 435346L; // long.max = 9223372036854775807
            System.out.println("g = " + g);
            System.out.println("h = " + h);
            System.out.println("g / h = " + (g / h));
            System.out.println("================");

            float i = 15.5F; // float.max = -3.4E+38
            float j = -3.5F; // float.max = 3.4E+38
            System.out.println("i = " + i);
            System.out.println("j = " + j);
            System.out.println("i % j = " + (i % j));
            System.out.println("================");

            double k = 8.5D; // double.max = -1.7E+308
            double l = -2.5D; // double.max = 1.7E+308
            System.out.println("k = " + k);
            System.out.println("l = " + l);
            System.out.println("k % l = " + (k % l));
            System.out.println("================");

            char letterA = 'a';
            System.out.println(letterA);
            System.out.println("================");

            System.out.println("e = " + e);
            System.out.println("e++ = " + (e++)); //сначала выводит переменную, затем прибавляет инкремент
            System.out.println("e = " + e);
            System.out.println("++e = " + (++e)); //сначала прибавляет инкремент, затем выводит переменную
            System.out.println("================");

            if (a == 0) {
                System.out.println("a равно нулю");
                System.out.println("================");
            } else {
                System.out.println("a не равно нулю");
                System.out.println("================");
            }

            if (a != 0) {
                System.out.println("a не равно нулю");
                System.out.println("================");
            } else {
                System.out.println("a равно нулю");
                System.out.println("================");
            }

            if (a > 0) {
                System.out.println("a больше нуля");
                System.out.println("================");
            } else {
                System.out.println("a меньше нуля");
                System.out.println("================");
            }

            if (a < 0) {
                System.out.println("a меньше нуля");
                System.out.println("================");
            } else {
                System.out.println("a больше нуля");
                System.out.println("================");
            }

            if (a >= 0) {
                System.out.println("a больше или равно нулю");
                System.out.println("================");
            } else {
                System.out.println("a меньше или равно нулю");
                System.out.println("================");
            }

            if (a <= 0) {
                System.out.println("a меньше или равно нулю");
                System.out.println("================");
            } else {
                System.out.println("a больше или равно нулю");
                System.out.println("================");
            }

            if (a >= 0 && b >= 0) {
                System.out.println("a меньше или равно нулю и b больше или равно нулю");
                System.out.println("================");
            } else {
                System.out.println("условие 'и' не удовлетворено");
                System.out.println("================");
            }

            if (a <= 0 || b <= 0) {
                System.out.println("a меньше или равно нулю или b больше или равно нулю");
                System.out.println("================");
            } else {
                System.out.println("условие 'или' не удовлетворено");
                System.out.println("================");
            }

            int num = 3;
            switch(num){

                case 1:
                    System.out.println("число равно 1");
                    break;
                case 8:
                    System.out.println("число равно 8");
                    num++;
                    break;
                case 9:
                    System.out.println("число равно 9");
                    break;
                default:
                    System.out.println("число не равно 1, 8, 9");
            }
            System.out.println("================");

            num = 3;
            int output = 0;
            switch(num){

                case 1:
                    output = 3;
                    break;
                case 2:
                case 3:
                case 4:
                    output = 6;
                    break;
                case 5:
                    output = 12;
                    break;
                default:
                    output = 24;
            }
            System.out.println(output);

            System.out.println("Блок: операции над разными типами данных");
            System.out.println("================");

            Typetester Typetester = new Typetester();

            byte aByte = 64; // -128...127
            short bShort = 24657; // -32768...32767
            var abResult = aByte + bShort;
            System.out.println("byte a = " + aByte);
            System.out.println("short b = " + bShort);
            System.out.println("a + b = " + abResult);
            Typetester.printType( abResult );
            System.out.println("================");

            int eIntegral = 423425; // -2147483648...2147483647
            long fLong = 23423423525L; // –9223372036854775808...9223372036854775807
            var efResult = eIntegral * fLong;
            System.out.println("int e = " + eIntegral);
            System.out.println("long f = " + fLong);
            System.out.println("e * f = " + efResult);
            Typetester.printType( efResult );
            System.out.println("================");

            int xIntegral = 423425; // -2147483648...2147483647
            double zDouble = 2.5D;
            var xzResult = xIntegral / zDouble;
            System.out.println("int x = " + xIntegral);
            System.out.println("double z = " + zDouble);
            System.out.println("e / f = " + xzResult);
            Typetester.printType( xzResult );
            System.out.println("================");

            System.out.println("Блок: переполнение в min/max стороны");
            System.out.println("================");

            var evilVar = 10;

            int intMaxCheck = 2147483647; // -2147483648...2147483647
            System.out.println("Переполнение в max сторону переменной типа Integer: 2147483647 + 10");
            System.out.println("Результат переполнения: " + (intMaxCheck + evilVar));
            System.out.println("================");

            int intMinCheck = -2147483648; // -2147483648...2147483647
            System.out.println("Переполнение в min сторону переменной типа Integer: -2147483648 - 10");
            System.out.println("Результат переполнения: " + (intMinCheck - evilVar));
            System.out.println("================");

            long longMaxCheck = 9223372036854775807L; // –9223372036854775808...9223372036854775807
            System.out.println("Переполнение в max сторону переменной типа Long: 9223372036854775807 + 10");
            System.out.println("Результат переполнения: " + (longMaxCheck + evilVar));
            System.out.println("================");

            long longMinCheck = -9223372036854775808L; // –9223372036854775808...9223372036854775807
            System.out.println("Переполнение в min сторону переменной типа Long: -9223372036854775808 - 10");
            System.out.println("Результат переполнения: " + (longMinCheck - evilVar));
            System.out.println("================");

            System.out.println("В результате переполнения вычисление продолжается c другой стороны диапазона");
        } else if (!testStarted) {
            System.out.println(testStatusFail);
        } else {
            System.out.println(testStatusError);
        }
    }
}

class Typetester {
    void printType(byte x) {
        System.out.println(x + " is an byte");
    }
    void printType(short x) {
        System.out.println(x + " is an short");
    }
    void printType(int x) {
        System.out.println(x + " is an int");
    }
    void printType(long x) {
        System.out.println(x + " is an long");
    }
    void printType(float x) {
        System.out.println(x + " is an float");
    }
    void printType(double x) {
        System.out.println(x + " is an double");
    }
    void printType(char x) {
        System.out.println(x + " is an char");
    }
}