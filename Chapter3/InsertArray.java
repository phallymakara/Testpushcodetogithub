package chapter3;

import java.util.Scanner;

public class InsertArray {
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
            System.out.println("Enter number of index to  find insert =");
            index = cin.nextInt();
        }while(!(index>=0&&index<n));
        int value;
        System.out.println("Enter value to insert =");
        value = cin.nextInt();
        int [] temp=a;
        a = new int[a.length+1];
        int j=0;
        for(int i=0;i<a.length;i++){
            if(index==i){
                a[i] = value;
                continue;
            }
            a[i]=temp[j];
            j++;
        }
        System.out.println("List All Element of Array :");
        for(int i =0;i<a.length;i++)
            System.out.println("a["+i+"]="+a[i]);
    }
    
}
