import java.util.*;
class pat13{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        for(int i = row ; i >= 1 ; i--){
        for(int j = 1; j<i ;j++){
            System.out.print("\t");
        }
        for(int k = i ; k<=row ;k++){
            System.out.print((char)('A'+k-1) + "\t");
        }
        System.out.println();
    }
        sc.close();
    }
}