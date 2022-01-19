package com.cursor;

public class LogicalOpTable {

    public static void main(String args[]) {

        boolean p;
        boolean q;

        System.out.println(" P  \t Q  \t  AND \t  OR \t  XOR \t NOT ");
        System.out.println(" P  \t Q  \t(p & q)\t(p | q)\t(p ^ q)\t(!p)");
        p = true;
        q = true;
        System.out.print(p + "\t" + q + "\t");
        System.out.print((p & q) + "\t" + (p | q) + "\t");
        System.out.println((p ^ q) + "\t" + (!p));
        p = true;
        q = false;
        System.out.print(p + "\t" + q + "\t");
        System.out.print((p & q) + "\t" + (p | q) + "\t");
        System.out.println((p ^ q) + "\t" + (!p));
        p = false;
        q = true;
        System.out.print(p + "\t" + q + "\t");
        System.out.print((p & q) + "\t" + (p | q) + "\t");
        System.out.println((p ^ q) + "\t" + (!p));
        p = false;
        q = false;
        System.out.print(p + "\t" + q + "\t");
        System.out.print((p & q) + "\t" + (p | q) + "\t");
        System.out.println((p ^ q) + "\t" + (!p));


        int p1;
        int q1;

        System.out.println("\n");

        System.out.println(" P  \t Q  \t  AND \t  OR \t  XOR \t NOT ");
        System.out.println(" P  \t Q  \t(p & q)\t(p | q)\t(p ^ q)\t(!p)");
        p1 = 1;
        q1 = 1;
        System.out.print(" " + p1 + "\t     " + q1 + "\t     ");
        System.out.print((p1 & q1) + "\t      " + (p1 | q1) + "\t      ");
        System.out.println((p1 ^ q1) + "\t      " + (p1 = 0));
        p1 = 1;
        q1 = 0;
        System.out.print(" " + p1 + "\t     " + q1 + "\t     ");
        System.out.print((p1 & q1) + "\t      " + (p1 | q1) + "\t      ");
        System.out.println((p1 ^ q1) + "\t      " + (p1 = 0));
        p1 = 0;
        q1 = 1;
        System.out.print(" " + p1 + "\t     " + q1 + "\t     ");
        System.out.print((p1 & q1) + "\t      " + (p1 | q1) + "\t      ");
        System.out.println((p1 ^ q1) + "\t      " + (p1 = 1));
        p1 = 0;
        q1 = 0;
        System.out.print(" " + p1 + "\t     " + q1 + "\t     ");
        System.out.print((p1 & q1) + "\t      " + (p1 | q1) + "\t      ");
        System.out.println((p1 ^ q1) + "\t      " + (p1 = 1));
    }
}
/* Попытайтесь видоизменить программу так, чтобы вместо логических значений
true и false отображались значения 1 и О. Это потребует больших
усилий, чем кажется на первый взгляд!
 */