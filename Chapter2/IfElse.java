package Chapter2;

public class IfElse {
    public static void main(String[] args) {
        int a=7;
        if(a<10) // .. ... 9
        System.out.println("Statement1");
        else if(a<50) //10......49
        System.out.println("Statement2");
        else if(a<90) //50......89
        System.out.println("Statement3");
        else // 90.
        System.out.println("Statement4");
    }
}
