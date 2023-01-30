package ie.atu.arrays;

import java.io.File;
import java.util.Scanner;

public class ArrayDemo {
    public static void main(String[] args) {

        int[] anArray;

        anArray = new int[10];

        anArray[0] = 100;

        anArray[1] = 200;

        anArray[2] = 300;

        anArray[3] = 400;

        anArray[4] = 500;

        anArray[5] = 600;

        anArray[6] = 700;

        anArray[7] = 800;

        anArray[8] = 900;

        anArray[9] = 1000;

        System.out.println("Element at index 0: " + anArray[0]);

        System.out.println("Element at index 1: " + anArray[1]);

        System.out.println("Element at index 2: " + anArray[2]);

        System.out.println("Element at index 3: " + anArray[3]);

        System.out.println("Element at index 4: " + anArray[4]);

        System.out.println("Element at index 5: " + anArray[5]);

        System.out.println("Element at index 6: " + anArray[6]);

        System.out.println("Element at index 7: " + anArray[7]);

        System.out.println("Element at index 8: " + anArray[8]);

        System.out.println("Element at index 9: " + anArray[9]);

        int indexValue = 0;

        for (int value : anArray) {
            System.out.println("Element at index" + indexValue + " : " + value);
            indexValue++;
        }

        Scanner myScan = new Scanner(System.in);

        try {
            System.out.println("Please enter a new number: ");
            anArray[10] = myScan.nextInt();

        } catch (ArrayIndexOutOfBoundsException aiob) {
            System.out.println("We went of our allocated memory block");
        }

    }

}
