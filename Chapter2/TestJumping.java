package Chapter2;

public class TestJumping {
    public static void main(String[] args) {
       for(int i=1;i<=1000;i++){
        if(i==5)
            break;
        System.out.println(i+",");
        }
         for(int i=1;i<=1000;i++){
        if(i==5)
            continue;
        System.out.println(i+",");
         }  
    }
}
