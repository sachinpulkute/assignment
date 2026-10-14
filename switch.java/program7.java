import java.util.*;
class demo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String service = sc.nextLine().toUpperCase();
        switch (service) {
            case "platinum":
                System.out.println("799");
                break;
            case "gold":
                System.out.println("599");
                break;
            case "silver":
                System.out.println("399");
                break;
            case "bronze":
                System.out.println("199");
                break;
            case "free":
                System.out.println("free");
            default:
                System.out.println("INvalid");
        }
    }
}