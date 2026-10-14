import java.util.*;
class demo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if(age < 0){
            System.out.println("invalid");
            }else{
                if(age>=18){
                    System.out.println("valid");
                }else{
                    System.out.println("invalid");
                }
            }
    }
}