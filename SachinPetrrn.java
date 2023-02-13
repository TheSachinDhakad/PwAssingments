public class SachinPetrrn {

//    write a program to print your Full Name using pattern programming logic
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == 3 || i == n || j == 1 && i <= (n - 1) / 2 || j == n && i == 4) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }


            }
            System.out.print("  ");


            // printing A


            for (int j2 = 1; j2 <= n; j2++) {
                if (i == 1 || i == 3 || j2 == 1 || j2 == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }


            }


            // printing c
            System.out.print("  ");
            for (int j = 1; j <= n; j++) {
                if (i == 1 || j == 1 || i == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }


            System.out.print("  ");
            for (int j = 1; j <= n; j++) {
                if (i == 3 || j == 1 || j == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }


            System.out.print("  ");
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 3) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }


            System.out.print("  ");
            for (int j = 1; j <= n; j++) {
                if (j == 1 || j == n || i == j) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }


            System.out.println();
        }
    }


}
