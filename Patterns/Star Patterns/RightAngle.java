import java.util.Scanner;

public class RightAngle {
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number");
        int number = sc.nextInt();
    
        for(int i=0;i<number;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    
    }
}
