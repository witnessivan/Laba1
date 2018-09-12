package practika2;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Practika2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x[];
        Scanner in =new Scanner(System.in);
        System.out.println("Введите количество элементовЭ");
        int n = in.nextInt();
        x = new int[n];
        inp_array(x,n);
        out_array(x,n);
        int z = in.nextInt();
        int rez=seach_array(x,z);
        if(rez!=-1){
            System.out.println("Индекс лемента=" + rez);
        }
        else
        {
            System.out.println("Нет такогшо числа");
        }
    }
    public static void inp_array(int []a,int n){
       Scanner in = new Scanner(System.in);
       for(int i =0;i<n;i++){
            a[i]=in.nextInt();
       }
    }
    public static void out_array(int[]a,int n ){
       System.out.println("Числа массива");
       for(int i = 0; i < a.length;i++){
           System.out.print(a[i]+" ");
      }
    }
    public static int seach_array(int[]a,int z){
        int i;
        System.out.println("числа массива");
        for( i = 0; i < a.length && a[i]!= z; ++i);
            return(i==a.length)?-1:i;
        
    }
    
}
