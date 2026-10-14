import java.util.*;
class pat5{
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        int num = sc.nextInt();
        int val = num;
        for ( int i =1; i <=num ; i++){
            for (int j = 1; j <=i ;j++){
                System.out.print(val*j + "\t");
            }
            val=num;
            System.out.println();
        }
        sc.close();

    }
}