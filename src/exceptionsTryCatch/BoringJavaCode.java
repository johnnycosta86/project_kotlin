package exceptionsTryCatch;

public class BoringJavaCode {


    public static Double divide(int a, int b) throws InterruptedException {
        Thread.sleep(1000);
        return (double)a / b;
    }

    public static void main(String args[]) {

        try {
           System.out.println(divide(6,3));
        }
        catch (InterruptedException e) {

        }
    }



}
