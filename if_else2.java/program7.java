import java.util.*;
class demo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base = sc.nextInt();
        int selling = sc.nextInt();
        int diff = base - selling;
        if(diff>0){
            System.out.println(diff + "loss");
        }else if(diff<0){
            System.out.println(diff + "profit");
        }else{
            System.out.println(diff + "equal");
        }
    }
}