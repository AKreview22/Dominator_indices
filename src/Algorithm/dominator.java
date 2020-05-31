package Algorithm;

import java.util.HashMap;

public class dominator {

    static int FindDominator(int array[]) {

        int size = array.length ;

        int max = 0;
        int index = -1;

        for (int i = 0; i < size; i++) {
            int counter = 0;
            for (int j = 0; j < size; j++) {
                if (array[i] == array[j])
                    counter++;
            }
            if (counter > max && counter > size / 2) {
                max = counter;
                index = i;
            }
        }

        if (index == -1) {
            return index;
        }
        return array[index];
    }

    static int FindDominator_HashMap(int array[]) {

        int size = array.length ;

        HashMap<Integer,Integer> table = new HashMap<Integer, Integer>();

        for(int i = 0; i < size; i++) {

            if (table.containsKey(array[i])) {

                int count = table.get(array[i]) + 1 ;
                if (count > size /2) {
                    return array[i];
                } else
                    table.put(array[i], count);

            }
            else
                table.put(array[i],1);
        }
        return -1 ;
    }

    static int[] findIndex (int array[] , int number)
    {
        int size = array.length ;
        int indexArray[] = new int[size] ;
        int j = 0 ;

        for ( int i = 0 ; i < size ; i++ )
        {
            if (array[i] == number )
            {
                indexArray[j]= i+1 ;
                j++;
            }
        }

        return  indexArray;

    }

    static void printDominatorIndex (int[] intArray) {
        int result = FindDominator_HashMap(intArray);

        if (result == -1 ) {
            System.out.print(-1);
        }else {
            int[] arrayIndex = findIndex(intArray, result);

            for (int i = 0; i < arrayIndex.length; i++) {
                if (arrayIndex[i] != 0) {
                    System.out.print(arrayIndex[i] + " ");
                }
            }
        }

    }
}
