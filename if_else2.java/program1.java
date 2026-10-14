import java.util.*;
class demo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num>=1 && num<=100){
            System.out.println(num + "is in range of 1 to 100");
        }else{
            System.out.println(num + "is not in range of 1 to 100");
        }
    }
}