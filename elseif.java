import java.util.*;

public class elseif {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two numbers : ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        if (x == y) {
            System.out.println(x+" equals to "+y);
        } else if (x < y) {
            System.out.println(x+" is less than "+y);
        } else {
            System.out.println(x+" is greator than "+y);
        }
        sc.close();
    }
}
