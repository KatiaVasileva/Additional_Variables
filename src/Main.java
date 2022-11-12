public class Main {
    public static void main(String[] args) {
//        Задача 6
        System.out.println("Задача 6");
        int a = 12;
        int b = 27;
        int c = 44;
        int d = 15;
        int e = 9;
        int result = a * (b + (c - d * e));
        System.out.println("Результат равен " + result + ".");
        int invertedResult = result * (-1);
        System.out.println("Результат с противоположным значением равен " + invertedResult + ".");
        System.out.println();

//        Задача 7
        System.out.println("Задача 7");
        int a1 = 5;
        int b1 = 7;
        System.out.println("a = " + a1 + ", b = " + b1);
        a1 = a1 + b1;
        b1 = a1 - b1;
        a1 = a1 - b1;
        System.out.println("a = " + a1 + ", b = " + b1);
        System.out.println();

//        Задача 8
        System.out.println("Задача 8");
        int a2 = 256;
        int b2 = (a2 / 10) % 10;
        System.out.println("Если а = " + a2 + ", то b = " + b2);
        System.out.println();
    }
}