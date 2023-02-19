public class StringReverse {
    public static void main(String[] args) {

        String str = "sachin nagar";
        String newStr = "";

        String [] sarr = str.split(" ");
//        case 1
//        for (int i = str.length()-1; i >=0 ; i--) {
//            newStr = newStr+str.charAt(i);
//
//
//        }
//        System.out.println(newStr);

//        for (int i = sarr.length-1; i >=0 ; i--) {
//            newStr = newStr+sarr[i]+" ";
//
//        }
//        System.out.println(newStr);

        for (String ele:sarr) {
            for (int i = ele.length()-1; i>=0 ; i--) {
                newStr = newStr+ele.charAt(i);

            }
            newStr= newStr+" ";

        }
        System.out.println(newStr);

    }
}
