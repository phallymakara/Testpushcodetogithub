package chapter3;

import java.util.Scanner;

public class DeleteArrayByIndex {
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
            System.out.println("Enter index to delete :");
            index=cin.nextInt();
        }while(!(index>=0 && index<n));
        int temp [] = a;
        a = new int[a.length-1];
        int j=0;
        for(int i=0;i<temp.length;i++){
            if(i==index)
            continue;
            a[j] = temp[i];
            j++;
        }
        System.out.println("List All arrays after Delete ...");
        for(int i=0;i<a.length;i++){
            System.out.println("a["+i+"]="+a[i]);
        }
    }
    
}
