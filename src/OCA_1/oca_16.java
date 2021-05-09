package OCA_1;

public class oca_16 {

    public static void doSum(Integer x, Integer y){ //Wrapper Class
        System.out.print("Integer sum is " + (x + y));
    }

    public static void doSum(double x, double y){
        System.out.print("double sum is " + (x + y));
    }

    public static void doSum(float x, float y){
        System.out.print("float sum is " + (x + y));

    }

    public static void main(String[] args) {
        doSum(10,20);
        doSum(10.0, 20.0);
    }

    /*

    A) double sum is 30.0flout sum is 30.0

    B) flout sum is 30.0double sum is 30.0 ****

    C) Integer sum is 30.0double sum is 30.0

    D) Integer sum is 30.0flout sum is 30.0

     */

}
