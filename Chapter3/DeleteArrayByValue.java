package chapter3;
import java.util.Scanner;
public class DeleteArrayByValue {
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
        int delete;
        System.out.println("Enter Value to delete =");
        delete=cin.nextInt();
        int count=0;
        for(int i=0;i<a.length;i++){
            if(delete==a[i]){
                count++;
            }
        }
        if(count>0){
            int [] temp =a;
            a = new int[a.length-count];
            int j=0;
            for(int i =0;i<temp.length;i++){
                if(delete==temp[i])
                continue;
            a[j]=temp[j];
            j++;
            }
           

        }else
        System.out.println("Not Found");
    System.out.println("List All Element of Array");
    for(int i=0;i<a.length;i++)
        System.out.println("a["+i+"]="+a[i]);
    
    }
}
