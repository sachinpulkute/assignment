import java.util.*;
class demo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num%6==0){
            System.out.println(num + "is divisible by 6");
        }else{
            System.out.println(num + "is not divisible by 6");
        }
    }
}