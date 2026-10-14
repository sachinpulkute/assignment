import java.util.*;
class pat16{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        for(int i = row ; i>=1 ; i--){
            for(int j = 0; j<row-i ;j++){
                System.out.print("\t");
            }
            for(int k = 1 ; k<= i ;k++){
                System.out.print(i + "\t");
            }
            System.out.println();
        }
        sc.close();
    }
}