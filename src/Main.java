import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args){
        //primitive's vs references
        //primitives are immutable
        int x = 5;
        int y = x;   // y gets a copy of the value, not a reference
        x = 10;      // this only changes x
        System.out.println(y); // still 5

        //Reference Variables are mutable
        int[] arr1 = {1, 2, 3};
        int[] arr2 = arr1; // sets arr2 to the memory location of arr1, via pointer reference.
        arr2[0] = 99;      // sets arr1 and arr2 because arr2 points to arr1
        System.out.println("arr1[0] value " + arr1[0]);
        System.out.println(arr2.length);


        Customer customer = new Customer();
        System.out.println(customer.name);
        customer.name = "sawyer";
        System.out.println(customer.name);


    }
}