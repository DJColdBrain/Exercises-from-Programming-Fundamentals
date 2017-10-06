import java.util.Arrays;

public class SortsAndSearches {
    public static void main(String[] args) {

        int[] array = new int[] {4,5,1,2,34,666,66,7,7,223,45,6,7};


        selectSort(array);

        System.out.println(Arrays.toString(array));
        System.out.println(binarySearch(array, 4));
    }

    public static void selectSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int min = i;
            for (int j = i +1 ; j < array.length; j++) {
                if (array[min] > array[j]){
                    min  = j;
                }
            }
            swap(array, min, i);
        }
    }

    public static void swap(int[] arr, int indexFirst, int indexSecond){
        int holder= arr[indexFirst];
        arr[indexFirst] = arr[indexSecond];
        arr[indexSecond] = holder;
    }

    public static int linearSearch(int[] arr, int searched){
        for (int i = 0; i < arr.length; i++) {
             if (searched == arr[i]){
                 return i;
             }
        }
        return -1;
    }

    public static int binarySearch(int[] arr, int searched){
        if (searched > arr[arr.length-1] || searched < arr[0]){
            return -1;
        }

        int start = 0;
        int end = arr.length-1;
        while (start <= end){
            int middle = (start + end)/2;
            if (arr[middle] > searched){
                end = middle-1;
            }else if (arr[middle] < searched){
                start = middle+1;
            }else if (arr[middle] == searched){
                return middle;
            }
        }
        return -1;
    }

    public static void bubleSort(int[] arr){
        boolean swaped = true;
        do{
            swaped = false;
            for (int i = 0; i < arr.length -1; i++) {
                if (arr[i] > arr[i+1]){
                    swap(arr, i, i+1);
                    swaped = true;
                }
            }
        }while (swaped);
    }

}
