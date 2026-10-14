import java.util.*;
class demo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int per = sc.nextInt()
        if(per >= 85 ){
            System.out.println("science");
        }else if (per >= 75 && per <= 65){
            System.out.println("commerce");
        }else{
            System.out.println("arts");
        }
    }
}