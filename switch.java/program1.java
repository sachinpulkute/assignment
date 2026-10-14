import java.util.*;
class demo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String colour = sc.nextLine().toLowerCase();
        switch (colour) {
            case "red":
                System.out.println("stop");
                break;
            case "yellow":
                System.out.println("wait");
                break;
            case "green":
                System.out.println("go");
                break;
            default:
                System.out.println("no valid colour");
        }
    }
}