import java.util.*;
class demo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i=1; i<=num; i++){
            if(i%2==1){
                 for(int j=num-1; j>=0;j--){
                 System.out.print((char)('A'+j) +"\t");
            }
        }else{
            for(int j=0; j<num;j++){
                 System.out.print((char)('A'+j) +"\t");
            }
        }
           System.out.println();
        } 
    }
}