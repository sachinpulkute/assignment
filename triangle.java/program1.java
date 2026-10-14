import java.util.*; 
class demo{
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int val = 1;
        for (int i = 0; i< num;i++){
            for (int j = 0; j<=i; j++){
                System.out.print(val++ + "\t");
            }
            System.out.println();
        } 
        sc.close();
    }
}