import java.util.*;
class demo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int budget = sc.nextInt();
        if(budget>100000){
            System.out.println("i phone");
        }else if(budget>50000){
            System.out.println("samsung");
        }else if(budget>25000){
            System.out.println("1+");
        }else if(budget>15000){
            System.out.println("oppo");
        }else{
            System.out.println("nokia");
        }
    }
}