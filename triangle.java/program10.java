import java.util.*;
class pat10{
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        int num = sc.nextInt();
        for ( int i =num; i>0 ; i--){
            int val = i;
            for (int j = 1; j <=i ;j++){
                System.out.print(val++ + "\t");
            }
            System.out.println();
        }
        sc.close();
    }
}