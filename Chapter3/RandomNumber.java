package chapter3;
import java.util.Random;
public class RandomNumber {
    public static void main(String[] args) {
        Random r = new Random();
        for(int i=1;i<=30;i++){
        int value = r.nextInt(10)+1; //+1 mean to except zero number
        System.out.println("values ="+value);
        }
    }
    
}
