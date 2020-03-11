package exception;

public class App2 {


    public static void m() throws Exception{
        System.out.println("M Begins");
        int nb = (int) (Math.random() * 3);
        System.out.println("La division de 2/"+nb+" est égale à :"+2/nb);
        System.out.println("M Ends");
    }
}
