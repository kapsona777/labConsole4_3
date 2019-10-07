package BTU;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner inpt=new Scanner(System.in);
        BTU.A a=new BTU.A();
        a.a=inpt.nextInt();
        a.b=inpt.nextInt();
        A aPrint=new A();
        aPrint.print();
        aPrint.print2();
        aPrint.print3();

    }
}
