import java.util.Scanner;
//Q1 . Write a program to print alphabets A,B ,C,D,E,F,G,H using pattern programming logic?
public class AlphabatePaterrn {
    public static void main(String args[]) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows : ");


        int n;
        n = sc.nextInt();


        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((char) (j + 64));


            }
            System.out.println();

        }


    }

}
