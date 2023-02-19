import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][] arr = new  int [3][3];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.println("Enter the number of the element");
                arr[i][j] = sc.nextInt();

            }

        }

        for (int a[] : arr) {
            for (int b: a) {
                System.out.print(b + " ");

            }
            System.out.println(" ");


        }



    }




}
