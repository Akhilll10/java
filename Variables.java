import java.net.InterfaceAddress;
import java.util.Arrays;

public class Variables {
    public static void main(String[] args) {
        //Variables
        //Types  -> 1. Primitive            2. Non primitive
        //Primitive
//        byte :   1 byte
//        short : 2
//        int : 4
//        long : 8
//        float : 4
//        double : 8
//        char : 2
//        boolean : 1

        byte age = 30;
        int rollNo = 21;
        long phone = 11111111567899990L;
        float pi = 3.14F;
        char letter = 'a';
        boolean isAdult = true;


//        2. Non primitive
//        String
//        Array
//        Class
//        Interface
//        Object

        String name = "Aman";

        //initialize array
        int arr[] = new int[5];

//        add element
        for(int i = 0 ;i<arr.length ; i++){
            arr[i] = i;
        }

//        view element
        for(int i = 0 ;i<arr.length ; i++){
            System.out.println(arr[i] + " ");
        }


        int arr1[] = {1,2,4,5,6,7};
        System.out.println(arr1[2]);


        System.out.println("Best of luck");
    }
}
