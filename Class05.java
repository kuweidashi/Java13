package Java13;

public class Class05 {
    public static void main(String[] args) {
        int num = 12;
        int den[]={12,0,3,0,0,4};
   
        try { 
            for (int i=0;i<10;i++){
                System.out.println("ans="+num/den[i]);
            }       
        } catch (Exception e) {
            System.out.println("程式執行有誤");
        }   
    }
}
