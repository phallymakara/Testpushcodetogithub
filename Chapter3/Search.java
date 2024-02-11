package chapter3;
import java.util.Scanner;

public class Search {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n;
        System.out.print("Enter n =");
        n=cin.nextInt();
        int a[] = new int[n];
        for(int i=0;i<a.length;i++){
            System.out.println("Enter a["+i+"]=");
            a[i]=cin.nextInt();
        }
        int search;
        System.out.print("Enter search :");
        search=cin.nextInt();
        boolean b = false;
        for(int i=0;i<a.length;i++){
            if(search==a[i]){
                System.out.println(i+",");
                b=true;
            }
        }
        if(b)
        System.out.println("found in Araray");
        else
        System.out.println("Not found in Array");
    }      
}
