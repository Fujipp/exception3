package exception3;

public class LAB3 {
    public static void main(String[] args) {
        try {
            System.out.println("statement 1");
            System.out.println("statement 2");
            System.out.println("statement 3");
        }
        catch(Exception e) {
        }
        finally {
            System.out.println("statement 4");
        }
        System.out.println("statement 5");
    }
}
