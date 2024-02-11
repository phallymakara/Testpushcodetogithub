package chapter3;

import java.util.Scanner;

public class NoDupplicate {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n;
        System.out.print("Enter n =");
        n=cin.nextInt();
        int a[] = new int[n];
        LABEL:for(int i=0;i<a.length;i++){
            System.out.println("Enter a["+i+"]=");
            a[i]=cin.nextInt();
            for(int j=0;j<i;j++){
                if(a[i]==a[j]){
                    i--;
                    continue LABEL;
                }
            }
        }
        System.out.println("List All Elements :");
        for(int i=0;i<n;i++){
            System.out.println("a["+i+"]="+a[i]);
        }
    }
}
