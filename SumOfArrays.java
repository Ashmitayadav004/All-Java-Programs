import java.util.*;

public class SumOfArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of array : ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Sum is : "+sum( arr, size));
        System.out.println("avg is : "+avg( arr, size));
        sc.close();
    }

    public static int sum(int[] arr, int size) {
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += arr[i];
        }
        return sum;
    }
    public static int avg (int[] arr  , int size ) {
        int avg = (sum(arr, size)/size);
        
        return avg;
    }
}
