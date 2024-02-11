package chapter3;

public class TestArrayN {
  public static void main(String[] args) {
      int []a = {10,20,30,40,50,20,34,443,53,24};
    //for(int i=0;i<a.length;i++){
      //  System.out.println("a["+i+"]="+a[i]);
      
    //}
    for(int temp:a){
        System.out.println("Temp="+temp);
    }
  }
}
