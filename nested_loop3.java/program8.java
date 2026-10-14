import java.util.*;
class demo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
        for(int i=1; i<=num; i++){
            int count = 1;
             char ch = (char)('A' + num - 1);
            for(int j =0;j<num;j++){
           if(i%2==1){
            System.out.print(ch-- + "\t");
           }else{
            System.out.print(count++ + "\t");
           } 
            }
           System.out.println();
        } 
    }
}