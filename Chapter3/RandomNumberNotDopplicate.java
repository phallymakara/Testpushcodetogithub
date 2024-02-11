package chapter3;
import java.util.Random;
public class RandomNumberNotDopplicate {
  public static void main(String[] args) {
      Random r =new Random();
    int a[] = new  int[90];
    Label:for(int i=0;i<a.length;i++){
        a[i] = r.nextInt(10)+1;
        for(int j=0;j<i;j++)
            if(a[i]==a[j]){
                i--;
                continue Label;
            }
        System.out.println("a["+i+"]=" +a[i]);
    }   
  }
}
