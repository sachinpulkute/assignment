import java.util.*;
class demo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i=num; i>0; i--){
           for(int j=1; j<=num;j++){
            System.out.print((i + (j-1)*num) + ""  +"\t");
           }
           System.out.println();
        } 
    }
}