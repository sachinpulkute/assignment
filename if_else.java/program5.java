import java.util.*;
class demo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num%7==0){
            System.out.println(num + "is divisible by 7");
        }else{
            System.out.println(num + "is not divisible by 7");
        }
    }
}