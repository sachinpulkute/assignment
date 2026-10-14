import java.util.*;
class pat19{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        for(int i = 0 ; i<row ; i++){
            for(int j = 0; j<i ;j++){
                System.out.print("\t");
            }
            for(int k = 0 ; k<row-i ;k++){
                System.out.print((char)('A'+row-1-k) + "\t");
            }
            System.out.println();
        }
        sc.close();
    }
}