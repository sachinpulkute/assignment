import java.util.*;
class demo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int per = sc.nextInt();
        if(per>=85){
            System.out.println("first class with distingtion");
        }else if(per>=75 && per<85){
            System.out.println("first class");
        }else if(per>=50 && per<75){
            System.out.println("second class");
        }else {
            System.out.println("pass");
        }
    }
}