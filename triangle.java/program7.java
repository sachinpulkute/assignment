import java.util.*;
class pat7{
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        int num = sc.nextInt();
        int val = num;
        for ( int i =num; i>0 ; i--){
            for (int j = 1; j <=i ;j++){
                System.out.print(val++ + "\t");
            }
            val=num;
            System.out.println();
        }
        sc.close();
    }
}