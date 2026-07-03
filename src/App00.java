//import java.lang.reflect.Array;
import java.util.Arrays;

public class App00 {

    public static void main(String[] args){
        int[] array1D = {0,1,2,3};
        int[][] array2D = {{0,1}, {2,3}, };
        //demo: array1D -> String
        System.out.println(array1D);
        System.out.println(Arrays.toString(array1D));

        //demo: array2D -> String
        System.out.println(array2D);
        System.out.println(Arrays.toString(array2D));
        System.out.println(Arrays.deepToString(array2D));

        // swap two variables:
        int a = 3;
        int b = 5;

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("a = "+a);
        System.out.println("b ="+b);


    }
}
