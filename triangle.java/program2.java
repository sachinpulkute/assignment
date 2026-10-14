import java.util.*;
class demo{
    public static void main (String atgs[]){
        Scanner sc = new Scanner (System.in);
        int num = sc.nextInt();
        int val = 1;
        for (int i = 1; i<=num ; i++){
            for(int j = 0;j<=i ; j++){
                System.out.print(val++ + "\t");
            }
            val = 1;
            System.out.println();
        }
        sc.close();
    }
}