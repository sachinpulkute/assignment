import java.util.*;
class demo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        if(ch>=65 && ch<=90 ){
            System.out.println(ch + "is positive number");
        }else{
            System.out.println(ch + "is negative number");
        }
    }
}