package Ladder.Lesson2;

public class Primitives {

    public static void main(String[] args) {

        byte b1 = 12; //десятичная система счисления
        byte b2 = 0B1100; //двоичная система счисления
        byte b3 = 0_14; //восьмиричная система счисления
        byte b4 = 0XC; //шестнадцатиричная система счисления
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);

        short s1 = -1300;
        short s2 = -0B10100010100;
        short s3 = -0_2424;
        short s4 = -0X514;
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);

        int i1 = 0;
        int i2 = 0B0;
        int i3 = 0_0;
        int i4 = 0X0;
        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);
        System.out.println(i4);

        long l1 = 123456789L;
        long l2 = 0B0111010110111100110100010101L;
        long l3 = 0_726746425L;
        long l4 = 0X75BCD15L;
        System.out.println(l1);
        System.out.println(l2);
        System.out.println(l3);
        System.out.println(l4);

        float f1 = 3.14f;
        float f2 = -3.14f;
        double d1 = 3.1415926535_8979323846_2643383279_5028841971;
        double d2 = -3.1415926535897932384626433832795028841971;
        boolean bool1 = true;
        boolean bool2 = false;
        System.out.println(f1);
        System.out.println(f2);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(bool1);
        System.out.println(bool2);

        char c1 = 1280; //десятичная система
        char c2 = '\u0500'; //шестнадцатиричная система
        char c3 = 'Ԁ';
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
    }
}
