import java.util.*;
class pat12{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        for(int i = 1 ; i <= row ; i++){
        for(int j = 1; j<=row-i ;j++){
            System.out.print("\t");
        }
        for(int k = row ; k>=row - i+1 ;k--){
            System.out.print(k + "\t");
        }
        System.out.println();
    }
        sc.close();
    }
}