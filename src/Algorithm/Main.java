package Algorithm;
import java.util.*;

public class Main {

    public static void main(String[] args) {


        Scanner myInput = new Scanner( System.in );
        System.out.println("Enter the size of your array");
        int size = myInput.nextInt();
        int[] intArray = new int[size];

        System.out.println("Enter the elements of your array");
        for ( int i = 0 ; i < size ; i++ )
        {
            intArray[i]=myInput.nextInt();
        }

        System.out.println("The indices of dominator is : ");
        dominator.printDominatorIndex(intArray);
        }
    }

