package chapter3;
import java.util.Scanner;
public class ArrayMax {
public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
    int n;
    System.out.println("Enter n=");
    n = scanner.nextInt();
    int[]a = new int[n];
    for (int i = 0; i < n;i++){
        System.out.println("a["+i+"]=");
        a[i] = scanner.nextInt();
    }
    int max=a[0];
    int index=0;
    for(int i = 1;i<n;i++){
        if(max<a[i])
             max=a[i];
            index=i;
    }
    System.out.println("Maximum is a["+index+"]="+a[index]);
  }
    
    
}
