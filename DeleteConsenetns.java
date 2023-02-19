public class DeleteConsenetns {
    public static void main(String[] args) {
        String s2 = "Hello , have a good day";
        String newStr = "";

        for (int i = 0; i < s2.length(); i++) {
            char ch = s2.charAt(i);

            if(ch== 'a' || ch == 'e' || ch=='i' ||
                    ch=='o' || ch=='u'){
//                System.out.print(ch);


                newStr = newStr+ch+" ";




            }




        }
        System.out.print(newStr);

    }
}
