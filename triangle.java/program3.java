import java.util.*;
class pat3{
    public static void main (String atgs[]){
        Scanner sc = new Scanner (System.in);
        int num = sc.nextInt();
        int val = num;
        for (int i = 0; i<=num ; i++){
            for(int j = 0;j<=i ; j++){
                System.out.print(val-- + "\t");
            }
            val = num;
            System.out.println();
        }
        sc.close();
    }
}