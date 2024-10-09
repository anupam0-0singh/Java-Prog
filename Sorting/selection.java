package Sorting;

public class selection {
    public static void sorted(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {5, 9, 6, 7, 15, 18, 10, 2};

        for(int i = 0; i < arr.length-1; i++){
            int smallest = i;
            for(int j = i + 1; j < arr.length; j++){
                if (arr[smallest]>arr[j]) {
                    smallest = j;
                }
                int temp = arr[smallest];
                arr[smallest] = arr[i];
                arr[i] = temp;
            }
        }
        sorted(arr);
    }
}
