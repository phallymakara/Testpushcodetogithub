package chapter3;
import java.util.Random;
public class TestRandom {
    public static void main(String[] args) {
        Random r = new Random();
        int val;
        int v1=0,v2=0,v3=0,v4=0,v5=0;
        for(int i=1;i<=1000;i++){
        int v =r.nextInt(1000)+1;
        if(v<=50){
            val=1;
            v1++;
        }
        else if(v<=150){
            val=2;
            v2++;
        }
        else if(v<=300){
            val=3;
            v3++;
        }
        else if(v<=600){
            val=4;
            v4++;
        }
        else{ 
            val=5;
            v5++;   
        }
        System.out.println("val ="+val);
        }
        System.out.println("v1 = "+v1+" "+(v1*100.0)/1000+"%");
        System.out.println("v2 = "+v2+" "+(v2*100.0)/1000+"%");
        System.out.println("v3 = "+v3+" "+(v3*100.0)/1000+"%");
        System.out.println("v4 = "+v4+" "+(v4*100.0)/1000+"%");
        System.out.println("v5 = "+v5+" "+(v5*100.0)/1000+"%");
    }

    
}
