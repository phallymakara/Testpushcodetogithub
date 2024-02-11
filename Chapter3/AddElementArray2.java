package chapter3;
import java.util.Scanner;
public class AddElementArray2 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n;
        System.out.print("Enter n :");
        n=cin.nextInt();
        int a[] = new int[n];
        for(int i =0; i<a.length;i++){
            System.out.println("Enter a["+i+"]=");
            a[i]=cin.nextInt();
        }
        int add;
        System.out.println("Enter element to add :");
        add=cin.nextInt();
        int[] temp = a;
        a = new int[a.length+add];
        System.arraycopy(temp,0,a,0,temp.length);
        for(int i=n;i<a.length;i++){
            System.out.println("Enter new a ["+i+"]=");
            a[i]=cin.nextInt();
        }
        System.out.println("List all element of Array :");
        for(int i =0;i<a.length;i++)
            System.out.println("a["+i+"] ="+a[i]);

        
    }
}
