import java.util.Scanner;
//Q2 . Write a program to print triangle usint star pattern logic ?
public class Q2Taringle {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of row : ");


        int n = sc.nextInt();


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");

            }
            System.out.println();

        }


    }

}


