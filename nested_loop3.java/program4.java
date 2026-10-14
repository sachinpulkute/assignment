import java.util.*;
class demo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i=1; i<=num; i++){
         int count = i;
           for(int j=1; j<=num;j++){
            System.out.print(count*j +"\t");
           }
           System.out.println();
        } 
    }
}