import java.util.*;
class demo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String size = sc.nextLine().toUpperCase();
        switch (size) {
            case "S":
                System.out.println("short");
                break;
            case "M":
                System.out.println("medium");
                break;
            case "L":
                System.out.println("large");
                break;
            case "XL":
                System.out.println("extra large");
                break;
            default:
                System.out.println("no INvalid");
        }
    }
}