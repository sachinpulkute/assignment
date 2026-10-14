import java.util.*;
class demo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        if(num1<0 || num2<0){
            System.out.println("invalid");
        }else{
        int result = num1 * num2;
        switch (result%2) {
            case 0:
                System.out.println("even");
                break;
            case 1:
                System.out.println("odd");
                break;
            default:
                System.out.println("INvalid");
            }
        }
    }
}