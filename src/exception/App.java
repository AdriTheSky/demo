package exception;

public class App {

    public static void m1(){
        System.out.println("M1 Begins");
        try {
            m2();
        } catch (Exception e) {
            System.err.println("Erreur de traitement de M2 : message = "+e.getMessage());
        }
        System.out.println("M1 Ends");
    }

    public static void m2() throws Exception {
        System.out.println("M2 Begins");
        App2.m();
        System.out.println("M2 Ends");
    }

    public static void main(String[] args) {

        System.out.println("Main Begins");
        m1();
        System.out.println("Main Ends");
    }
}
