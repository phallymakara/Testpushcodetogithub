package chapter3;
import java.util.Scanner;
public class ArrayN {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n;
    System.out.println("Enter n=");
    n = scanner.nextInt();
    int[]a = new int[n];
    for (int i = 0; i < n;i++){
        System.out.println("a["+i+"]="+a[i]);
        a[i] = scanner.nextInt();
    }
    System.out.println("lIST ALL ELEMENT OF ARRAY.....");
    for(int j=0;j<n;j++){
        System.out.println("a["+j+"]="+a[j]);
    }

    
 }
}
