package chapter3;
import java.util.Scanner;
public class Short1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.println("Enter n:");
        n=scanner.nextInt();
        int[]a = new int[n];
        for (int i=0;i<a.length;i++){
            System.out.println("["+i+"]=");
            a[i]=scanner.nextInt();
        }
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++)
                if(a[i]>a[j]){
                    int temp = a[i];
                    a[i]=a[j];
                    a[j]=temp;
                 }
         } 
        System.out.println("List all element after sotred...");
        for(int i = 0;i<a.length;i++)
            System.out.println("a["+i+"]="+a[i]);
        }
    }
