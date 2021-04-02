package Box;

import java.util.Scanner;

public class Teater {
    private static Object Sort;

    public static void main(String[] args) {
        Box1 box1 = new Box1();
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter object's length:");
        int x = sc.nextInt();
        System.out.println("Please enter object's length:");
        int y = sc.nextInt();
        System.out.println("Please enter object's length:");
        int z = sc.nextInt();
        System.out.println("Length: " + x + ", width: " + y + ", height: " + z);


        int max, mid, min;
        if (x > y) {
            if (x > z) {
                max = x;
                if (y > z) {
                    mid = y;
                    min = z;
                } else {
                    mid = z;
                    min = y;
                }
            } else {
                max = z;
                mid = x;
                min = y;
            }
        } else if (y > z) {
            max = y;
            if (x > z) {
                mid = x;
                min = z;
            } else {
                mid = z;
                min = x;
            }
        } else {
            max = z;
            mid = y;
            min = x;
        }


        if (x <= 10 && y <= 10 && z <= 10) {
            System.out.println("Box 1 it is, price: " + box1.getPrice());
        } else if (x <20 && y <= 20 && z <= 20) {
            System.out.println("Box 2 it is, price: 50" );
            /*
            System.out.println("Box 2 it is, price: " + box2.getPrice());
            */

        }




    }
}
