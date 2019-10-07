package BTU;

import java.util.ArrayList;
import java.util.List;

public class A {
    int a;
    int b;
    public void print(){
        for (int i=a; i<b; i++){
            System.out.println(i);
        }
    }
    public void print2(){
        for (int i=0; i<a; i++){
            if (a%i==0){
                System.out.println(i);
            }
        }
    }
    List divisors=new ArrayList();
    public void print3(){
        for (int i=0; i<b; i++){
            if (b%i==0){
                for (int l=0; l<i; l++){
                    if (i%l==0){
                        divisors.add(l);
                    }
                }
                if (divisors.size()<=2){
                    System.out.println(i);
                }
            }
        }
    }
}
