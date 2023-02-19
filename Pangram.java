import java.util.Locale;

public class Pangram {
    public static void main(String[] args) {
        boolean flag = false;
        String str = "The quick brown fox jumps over the lazy dog";
        str = str.toUpperCase();
        str = str.replace(" " , "");

        char []ch = str.toCharArray();
        int [] arr = new int[26];

        for (int i = 0  ; i <ch.length ; i++) {
            arr[ch[i] - 65]++;

        }

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==0){
                System.out.println("it is not pangram");
                flag = true;
            }

        }
        if(flag==false){
            System.out.println("it is pangram");
        }


    }
}
