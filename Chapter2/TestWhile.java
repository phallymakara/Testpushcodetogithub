package Chapter2;

public class TestWhile {
    public static void main(String[] args) {
        int i = 1;
        while(i<=5){
            System.out.println(i+",");
            i++;
        }
        System.out.println("i ="+i);
        while(i>=1){
            System.out.println(i+",");
            i--;
        }
        System.out.println("i="+i);
    }
}
