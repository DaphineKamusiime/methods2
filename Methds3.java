import java.net.SocketAddress;

//method overloading
public class Methds3{
    static int result(int a, int b){
        return a+b;
    }
    static double result(float a,float b){
        return a*b;

    }
    public static void main(String[] args){
        int R1=result(34, 89);
        double R2=result(45,67);
        System.out.println(R1);
        System.out.println(R2);
    }
}