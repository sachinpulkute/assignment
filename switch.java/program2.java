import java.util.*;
class demo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String grade = sc.nextLine().toUpperCase();
        switch (grade) {
            case "O":
                System.out.println("outstanding");
                break;
            case "A":
                System.out.println("excellent");
                break;
            case "B":
                System.out.println("good");
                break;
            case "C":
                System.out.println("avg");
                break;
            default:
                System.out.println("no INvalid");
        }
    }
}