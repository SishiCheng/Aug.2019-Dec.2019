import java.io.*;
class p {
    private static void foo(Integer i) {
        try {
            System.out.println("A");
            int j = i.intValue();
            System.out.println("B");
            j = j / 0;
            System.out.println("C");
        } catch (ArithmeticException e) {
            System.out.println("D");
        } catch (NullPointerException e) {
            System.out.println("E");
        } finally {
            System.out.println("F");
        }
    }

    public static void main(String[] args) {
        try {
            System.out.println("G");
            foo(null);
            int x = 461 / 0;
            System.out.println("H");
        } catch (ArithmeticException e) {
            System.out.println("I");
        } catch (NullPointerException e) {
            System.out.println("J");
        } finally {
            System.out.println("K");
        }
    }
}