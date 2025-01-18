import java.util.Arrays;
public class First {
    private int a = 5; // Поле экземпляра класса
    private static int b = 100; // Поле класса
    {
        a = -5;
        System.out.println("Dynamic initialization section");
    }
    public First() {
        a = 10;
        b = 10;
        System.out.println("Constructor");
    }
    static {
        b = -5;
        System.out.println("Static initialization section");
    }
    public static void main(String[] arg) {
        System.out.println("Main");
        First obj = new First();
        System.out.println("a=" + obj.a + " b=" + b);
    }
}