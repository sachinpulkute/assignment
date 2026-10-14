import java.util.*;
class demo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
         int count = 1;
        for(int i=1; i<=num; i++){
           if(i%2==1){
            for(int j = 1;j<=num;j++){
                char ch = (char)('A' + num - 1);
                System.out.print(j + "" + ch + "\t");
            }
           }else{
                for(int j = num;j>=1;j--){
                char ch = (char)('A' + num - 1);
                System.out.print(j + "" + ch + "\t");
            }
           }
           System.out.println();
        } 
    }
}