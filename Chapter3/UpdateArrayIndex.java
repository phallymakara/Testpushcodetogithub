package chapter3;
import java.util.Scanner;
public class UpdateArrayIndex {
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
        int index;
        do{
            System.out.println("Enter index to Update :");
            index =cin.nextInt();
        }while(!(index>=0 && index < n));
        int update;
        System.out.println("Enter new value to update :");
        update =cin.nextInt();
        a[index]=update;
        System.out.println("List All element Array after Update...");
        for(int i=0;i<a.length;i++){
            System.out.println("a["+i+"]="+a[i]);
        }
    }
    
}
