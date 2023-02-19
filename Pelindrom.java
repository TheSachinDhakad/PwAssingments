public class Pelindrom {
    public static void main(String[] args) {
        String str = "madam";

        String newStr = "";

        for (int i = str.length()-1; i >=0 ; i--) {

            newStr = newStr+str.charAt(i);

        }
        if(newStr.equals(str)){
            System.out.println("yes this is pelindrom ");
        }
        else {
            System.out.println("not a palindrom");
        }




    }
}
