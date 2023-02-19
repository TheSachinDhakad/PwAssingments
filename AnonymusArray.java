class  Calc {
    public  int add(int [] arr){
        int result = 0;

        for (int n: arr) {
            result = result+n;

        }
        return result;

    }
}
public class AnonymusArray {

    public static void main(String[] args) {
        Calc obj = new Calc();
        int result = obj.add(new int []{2,3,4,5});
        System.out.println(result);






    }
}
