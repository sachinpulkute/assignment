import java.util.*;
class demo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num%2==0 || num%5==0 || num%10==0){
            System.out.println(num + "is divisible by 2,5,10");
        }else{
            System.out.println(num + "is not divisible by 2,5,10");
        }
    }
}