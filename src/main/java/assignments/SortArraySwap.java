package assignments;

import java.util.Arrays;

public class SortArraySwap {

    public static void main(String[] args) {
        int[] values = new int[]{4, 2, 4, 4, 3, 1, 5, 4};
        int temp;

        int arrayLength = values.length;
        for (int i=0; i< arrayLength; i++) {
            for(int j=i+1; j< arrayLength; j++) {
                if(values[i] < values[j]) {
                    temp = values[i];
                    values[i] = values[j];
                    values[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(values));
    }
}
