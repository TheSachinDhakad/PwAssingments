public class PwStringQus {
    public static void main(String[] args) {
        String str = "refrigerator";
        System.out.println(str.length());


        String s1 = "umbrella";
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == 'e') {
                System.out.println("yes e is present ");
                return;

            }


        }
        System.out.println("e is not present ");
    }
}











