package chapter3;
import java.util.Random;
public class NoDuRandom {
    public static void main(String[] args) {
        Random r = new Random();
        int []a= new int [90];
        for(int i=0;i<a.length;i++){
            a[0] = r.nextInt(90)+1;
            label:for(int j=0;j<i;j++){
                if(a[i]==a[j])
                    i--;
                    continue label;
            }
            System.out.println("a["+i+"]="+a[i]);
        }
    }
    
}
