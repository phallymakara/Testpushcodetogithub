package Chapter2;
import java.util.Scanner;
public class UsingDoWhile {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        double s;
        do{
            System.out.println("Enter s=");
            s=cin.nextDouble();
        }while(!(s>=0&&s<=100));
    }
    
}
