import java.util.*;
class demo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        char ch = (char)('A' + num - 1);
        for(int i=num; i>=1; i--){
           for(int j=1; j<=num;j++){
            System.out.print(ch +"\t");
           }ch--;
           System.out.println();
        } 
    }
}