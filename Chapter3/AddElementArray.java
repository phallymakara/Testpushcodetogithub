package chapter3;

public class AddElementArray {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        int [] temp = a;

        a=new int[a.length+2];
        System.arraycopy(temp,0,a,0,temp.length);
        for(int i=0; i<a.length; i++) {
            System.out.println("a["+i+"]="+a[i]);
        }
    }
    
}
