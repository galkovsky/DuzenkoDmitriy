import java.util.Arrays;

/**
 * Created by Дмитрий on 24.02.2015.
 */
public class BubblSortMethod {
    public void bubblesort(int arr[], boolean flag) {
        if (flag) {

            for (int a = 0; a < arr.length - 1; a++) {
                for (int k = 0; k < arr.length - 1 - a ; k++) {
                    if (arr[k + 1] > arr[k]) {
                        int temp = arr[k + 1];
                        arr[k+1] = arr[k];
                        arr[k] = temp;
                    }
                }
            }
            System.out.println(" Array sorted " + Arrays.toString(arr));

        } else {
            for (int a = 0; a < arr.length - 1; a++) {
                for (int k = 0; k < arr.length - 1 - a; k++) {
                    if (arr[k + 1] < arr[k]) {
                        int temp = arr[k + 1];
                        arr[k + 1] = arr[k];
                        arr[k] = temp;
                    }
                }

            }
            System.out.println(" Array sorted " + Arrays.toString(arr));

        }
    }

}