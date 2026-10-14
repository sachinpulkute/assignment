import java.util.*;
class demo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        char ch = (char)('A' + num-1);
        for(int i=1; i<=num; i++){
            for(int j = 1;j<=num;j++){
                if(j%2==0){
                    System.out.print(ch + "\t");
                    ch -=1;
                }else{
                    int gum = (i%2==0)?(num-j):(j+1);
                    System.out.println(gum + "\t");
                }
           }
           System.out.println();
        } 
    }
}