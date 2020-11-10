package ee.bcs.valiit.tasks;

import java.util.Scanner;

public class Lesson2 {

    public static void main(String[] args) {
//        exercise1();
//        exercise2(5);
//        exercise3(3, 3);
//        fibonacci(200);
        exercise5(22);
    }


    public static void exercise1() {
        // TODO loo 10 elemendile täisarvude massiv
        // TODO loe sisse konsoolist 10 täisarvu
        // TODO trüki arvud välja vastupidises järiekorras
        Scanner scanner = new Scanner(System.in);
        int[] täisarvud = new int[10];

        for (int i = 0; i < 10; i++) {
            täisarvud[i] = scanner.nextInt();
        }

        for (int i = 9; i >= 0; i--) {
            System.out.println(täisarvud[i]);
        }
    }


    public static void exercise2(int n) {
        // TODO prindi välja x esimest paaris arvu
        // Näide:
        // Sisend 5
        // Väljund 2 4 6 8 10


//        copy paste netist:
//        int n = 100;
//        System.out.print("Even Numbers from 1 to "+n+" are: ");
//        for (int i = 1; i <= n; i++) {
//            //if number%2 == 0 it means its an even number
//            if (i % 2 == 0) {
//                System.out.print(i + " ");
//


//         see on copy paste + muudatused
        for (int i = 1; i <= n * 2; i++) {
            //if number%2 == 0 it means its an even number
            if (i % 2 == 0) {
                System.out.println(i + " ");

            }
        }
    }

    public static void exercise3(int x, int y) {
        // TODO trüki välja korrutustabel mis on x ühikut lai ja y ühikut kõrge
        // TODO näiteks x = 3 y = 3
        // TODO väljund
        // 1 2 3
        // 2 4 6
        // 3 6 9
// TODO 1 trüki korrutustabeli esimene rida (numbrid 1 - x)
        // TODO 2 lisa + " " print funktsiooni ja kasuta print mitte println
        // TODO 3 trüki seda sama rida y korda
        // TODO 4 Kuskile võiks kirjutada System.out.println(),
        //  et saada tabeli kuju
        // TODO 5 võrdle ridu. Kas on mingi seaduspärasus ridade vahel,
        // mis on ja mis võiks olla. Äkki tuleb mõni idee


        for (int j = 1; j <= y; j++) {
            System.out.println();

            for (int i = 1; i <= x; i++) {
                System.out.print(i * j + " ");
            }
        }
    }


    public static int fibonacci(int n) {
        // TODO
        // Fibonacci jada on fib(n) = fib(n-1) + fib(n-2);
        // 0, 1, 1, 2, 3, 5, 8, 13, 21
        // Tagasta fibonacci jada n element

        //       teha for loopiga sama asi - vihje: esimesed 2 numbrid if else'ga ära händlida, sellest ei pääse

//        c = a + b;
//        a = b;
//        b = c;

// prindin välja 50 fibo kohta
//        int a = 0, b = 1; // ÜHES REAS EI OLE ILUS
        int a = 0;
        int b = 1;
//        int c; // c ei ole vaja siin defineerida, see tuleb valemist
        for (int i = 0; i <= n; i++) {  // alustab nullist, laseb 50ni, liidab iga kord +1 NB! i++ VS i = i++
            System.out.println(a + " ");
            int c = a + b;
            a = b;
            b = c;
        }
        return b; // see funktsioon laseb nüüd lõpmatuseni fibo välja
    }


////        a b c d e f g h
//        int a = 0, b = 1;
//        int c = a + b;
//        a = b + c;
//        b = c + a;
//        c = a + b;
//        a = b + c;
//        b = c + a;
//        System.out.println(b);
//        return b;


//        koguaeg c = a + b, teha nii, et muutuja oleks koguaeg ühe võrra nihkes

//        int a = 0, b = 1;
//
//        int c = a + b;
//        a = b;
//        b = c;
//
//        c = a + b;
//        a = b;
//        b = c;
//
//        c = a + b;
//        a = b;
//        b = c;
//
//        c = a + b;
//        a = b;
//        b = c;
//
//        c = a + b;
//        a = b;
//        b = c;
//
//        c = a + b;
//        a = b;
//        b = c;
//
//        c = a + b;
//        a = b;
//        b = c;
//
//        c = a + b;
//        a = b;
//        b = c;
//
//        c = a + b;
//        a = b;
//        b = c;
//
//        c = a + b;
//        a = b;
//        b = c;
//
//        c = a + b;
//        System.out.println(c);
//        return c;


//        teha sama asi, aga ainult c = a + b

//        int eelviimane = 0, viimane = 1;
//
//        int c = eelviimane + viimane; // 1
//        eelviimane = viimane;
//        c = eelviimane + viimane; // 2
//        viimane = c;
//        c = eelviimane + viimane; // 3
//        eelviimane = c;
//        c = eelviimane + viimane; // 5
//        viimane = c;
//        c = eelviimane + viimane; // 8
//        eelviimane = c;
//        c = eelviimane + viimane; // 11
//        System.out.println(c);
//        return c;
//

//        viimase sisu uus väärtus

//        int eelviimane = 0, viimane = 1;
//
//        int c = eelviimane + viimane; // 1
//        eelviimane = viimane;
//        c = eelviimane + viimane; // 2
//        viimane = eelviimane;
//        c = eelviimane + viimane; // 3
//        viimane = eelviimane;
//        c = eelviimane + viimane; // 5
//        viimane = eelviimane;
//        c = eelviimane + viimane; // 8
//        viimane = eelviimane;
//        c = eelviimane + viimane; // 11
//        System.out.println(c);
//        return c;


    public static void exercise5(int n) {
        // https://onlinejudge.org/index.php?option=onlinejudge&Itemid=8&page=show_problem&problem=36
//        Consider the following algorithm:
//        1. input n
//        2. print n
//        3. if n = 1 then STOP
//        4. if n is odd then n ←− 3n + 1
//        5. else n ←− n/2
//        6. GOTO 2
//        Given the input 22, the following sequence of numbers will be printed
//        22 11 34 17 52 26 13 40 20 10 5 16 8 4 2 1

//        Start with an
//        integer n. If n is even, divide by 2. If n is odd, multiply by 3 and add 1. Repeat this
//        process with the new value of n, terminating when n = 1. For example, the following
//        sequence of numbers will be generated for n = 22:
//        22 11 34 17 52 26 13 40 20 10 5 16 8 4 2 1



        while(n > 1){

            if (n % 2 == 1) {
                n = (3 * n) + 1;
            } else {
                n = n / 2;
            }
            System.out.println(n);
        }
    }
//    public static void exercise6() {
        /*
            Kirjutada Java programm, mis loeb failist visits.txt sisse looduspargi külastajad erinevatel jaanuari päevadel ning
            a) sorteerib külastuspäevad külastajate arvu järgi kasvavalt ning prindib tulemuse konsoolile;
            b) prindib konsoolile päeva, mil külastajaid oli kõige rohkem.
            Faili asukoht tuleb programmile ette anda käsurea parameetrina.
         */

//    public static void exercise7() {
//        // TODO arvuta kasutades BigDecimali 1.89 * ((394486820340 / 15 ) - 4 )
//        BigDecimal a = new BigDecimal("1.89");
//        BigDecimal b = new BigDecimal("394486820345");
//        BigDecimal c = new BigDecimal("15");
//        BigDecimal d = new BigDecimal("4");
//
//        System.out.println(b.divide(c, 4, RoundingMode.HALF_UP));
//    }

//    public static void exercise8() {
        /*
        Failis nums.txt on üksteise all 150 60-kohalist numbrit.

        Kirjuta programm, mis loeks antud numbrid failist sisse ja liidaks need arvud kokku ning kuvaks ekraanil summa.
        Faili nimi tuleb programmile ette anda käsurea parameetrina.

        VASTUS:
        Õige summa: 77378062799264987173249634924670947389130820063105651135266574
         */
//    }

    public static void exercise9() {
        /* TODO
        Sama mis eelmises ülesandes aga ära kasuta BigInt ega BigDecimal klassi
         */
    }
}


