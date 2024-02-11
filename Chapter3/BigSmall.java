package chapter3;
import java.util.Scanner;
import java.util.Random;
public class BigSmall {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        Random r = new Random();
        int vs;
        int money;
        System.out.print("Enter number to bit =");
        vs =cin.nextInt(2);
        System.out.print("Enter money to bet =");
        money =cin.nextInt();
        int vr=r.nextInt(2);
        if(vr==vs){
            vr=r.nextInt(2);
            if(vr==vs){   //if random true random again
            System.out.println("You win!!!");
            money = money*2;
            System.out.println("Your money = " + money);
            }
        }
        else{
            System.out.println("Thanks you!!!");
            System.out.println("Your money =0$");
        }
    }
}
