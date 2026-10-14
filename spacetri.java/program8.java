import  java.util.*;
class pat18{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        for(int i = 1 ; i<=row ; i++){
            for(int j = 1; j<i ;j++){
                System.out.print("\t");
            }
            for(int k = i ; k<= row ;k++){
                System.out.print(k + "\t");
            }
            System.out.println();
        }
        sc.close();
    }
}